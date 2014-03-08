package org.matheclipse.core.patternmatching;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.matheclipse.core.expression.F;
import org.matheclipse.core.generic.Functors;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IPattern;
import org.matheclipse.core.interfaces.IPatternObject;
import org.matheclipse.core.interfaces.IPatternSequence;
import org.matheclipse.core.interfaces.ISymbol;

/**
 * A map from a pattern to a possibly found value during pattern-matching.
 * 
 */
public class PatternMap implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5384429232269800438L;

	/**
	 * Count the number of patterns with associated symbols in the pattern map.
	 */
	private int fPatternCounter;

	/**
	 * If <code>true</code> the rule contains no pattern.
	 */
	private boolean fRuleWithoutPattern;

	/**
	 * Contains the symbols of the patterns. The corresponding value (or <code>null</code>) is stored in
	 * <code>fPatternValuesArray</code>.
	 */
	private ISymbol[] fSymbolsArray;

	/**
	 * Contains the current values of the pattern symbols. The corresponding symbol is stored in <code>fSymbolsArray</code>.
	 */
	private IExpr[] fPatternValuesArray;

	public PatternMap() {
		this(new IExpr[0]);
	}

	private PatternMap(IExpr[] exprArray) {
		this.fPatternCounter = 0;
		this.fRuleWithoutPattern = true;
		this.fPatternValuesArray = exprArray;
	}

	/**
	 * Set the index of <code>fPatternSymbolsArray</code> where the <code>pattern</code> stores it's assigned value during pattern
	 * matching.
	 * 
	 * @param pattern
	 * @param patternIndexMap
	 */
	protected void addPattern(TreeMap<ISymbol, Integer> patternIndexMap, IPatternObject pattern) {
		fRuleWithoutPattern = false;
		ISymbol sym = pattern.getSymbol();
		if (sym != null) {
			Integer i = patternIndexMap.get(sym);
			if (i != null) {
				// for "named" patterns (i.e. "x_" or "x_IntegerQ")
				pattern.setIndex(i.intValue());
				return;
			}
			pattern.setIndex(fPatternCounter);
			patternIndexMap.put(sym, Integer.valueOf(fPatternCounter++));
		}
	}

	protected void addSinglePattern(IPatternObject pattern) {
		fRuleWithoutPattern = false;
		ISymbol sym = pattern.getSymbol();
		if (sym != null) {
			pattern.setIndex(0);
			this.fSymbolsArray = new ISymbol[1];
			this.fPatternValuesArray = new IExpr[1];
			fSymbolsArray[0] = sym;
			fPatternCounter++;
		}
	}

	/**
	 * Determine all patterns (i.e. all objects of instance IPattern) in the given expression
	 * 
	 * Increments this classes pattern counter.
	 * 
	 * @param lhsPatternExpr
	 *            the (left-hand-side) expression which could contain pattern objects.
	 */
	protected void determinePatterns(final IExpr lhsPatternExpr) {
		if (lhsPatternExpr instanceof IAST) {
			TreeMap<ISymbol, Integer> patternIndexMap = new TreeMap<ISymbol, Integer>();
			determinePatternsRecursive(patternIndexMap, (IAST) lhsPatternExpr);
			this.fSymbolsArray = new ISymbol[fPatternCounter];
			this.fPatternValuesArray = new IExpr[fPatternCounter];
			for (ISymbol sym : patternIndexMap.keySet()) {
				Integer indx = patternIndexMap.get(sym);
				fSymbolsArray[indx.intValue()] = sym;
			}
		} else if (lhsPatternExpr instanceof IPatternObject) {
			addSinglePattern((IPatternObject) lhsPatternExpr);
		}
	}

	/**
	 * Determine all patterns (i.e. all objects of instance IPattern) in the given expression
	 * 
	 * Increments this classes pattern counter.
	 * 
	 * @param patternIndexMap
	 * @param lhsPatternExpr
	 *            the (left-hand-side) expression which could contain pattern objects.
	 */
	private int determinePatternsRecursive(TreeMap<ISymbol, Integer> patternIndexMap, final IAST lhsPatternExpr) {
		final IAST ast = (IAST) lhsPatternExpr;
		int listEvalFlags = IAST.NO_FLAG;
		for (int i = 0; i < ast.size(); i++) {
			IExpr temp = ast.get(i);
			if (temp.isAST()) {
				listEvalFlags |= determinePatternsRecursive(patternIndexMap, (IAST) temp);
			} else if (temp instanceof IPatternObject) {
				if (temp.isPattern()) {
					IPattern pat = (IPattern) temp;
					addPattern(patternIndexMap, pat);
					if (pat.isDefault()) {
						// the ast contains a pattern with default value
						// (i.e. "x_.")
						listEvalFlags |= IAST.CONTAINS_DEFAULT_PATTERN;
					} else {
						// the ast contains a pattern without value (i.e.
						// "x_")
						listEvalFlags |= IAST.CONTAINS_PATTERN;
					}
				} else if (temp.isPatternSequence()) {
					addPattern(patternIndexMap, (IPatternSequence) temp);
					// the ast contains a pattern sequence (i.e. "x__")
					listEvalFlags |= IAST.CONTAINS_PATTERN_SEQUENCE;
				}
			}
		}
		ast.setEvalFlags(listEvalFlags);
		// disable flag "pattern with default value"
		listEvalFlags &= IAST.CONTAINS_NO_DEFAULT_PATTERN_MASK;
		return listEvalFlags;
	}

	@Override
	protected PatternMap clone() {
		PatternMap result = new PatternMap(null);
		// avoid Arrays.copyOf because of Android version
		result.fPatternValuesArray = new IExpr[fPatternValuesArray.length];
		System.arraycopy(fPatternValuesArray, 0, result.fPatternValuesArray, 0, fPatternValuesArray.length);
		// don't clone the fSymbolsArray which is final after the
		// #determinepatterns()
		// method
		result.fSymbolsArray = fSymbolsArray;
		result.fPatternCounter = fPatternCounter;
		result.fRuleWithoutPattern = fRuleWithoutPattern;
		return result;
	}

	/**
	 * Copy the current values into a new array.
	 * 
	 * @return
	 * @see PatternMap#resetPattern(IExpr[])
	 */
	public IExpr[] copyPattern() {
		IExpr[] patternValuesArray = new IExpr[fPatternValuesArray.length];
		System.arraycopy(fPatternValuesArray, 0, patternValuesArray, 0, fPatternValuesArray.length);
		return patternValuesArray;
	}

	/**
	 * Copy the found pattern matches from the given <code>patternMap</code> back to this maps pattern values.
	 * 
	 * @param patternMap
	 */
	public void copyPatternValuesFromPatternMatcher(final PatternMap patternMap) {
		// for (ISymbol pattern : patternMap.fSymbolsArray) {
		ISymbol[] symbolsArray = patternMap.fSymbolsArray;
		for (int i = 0; i < symbolsArray.length; i++) {
			for (int j = 0; j < fSymbolsArray.length; j++) {
				if (fSymbolsArray[j] == symbolsArray[i]) {
					fPatternValuesArray[j] = patternMap.fPatternValuesArray[i];
				}
			}
		}
	}

	private Map<ISymbol, IExpr> getRulesMap() {
		final Map<ISymbol, IExpr> rulesMap = new IdentityHashMap<ISymbol, IExpr>(fSymbolsArray.length * 2);
		for (int i = 0; i < fSymbolsArray.length; i++) {
			if (fPatternValuesArray[i] != null) {
				rulesMap.put(fSymbolsArray[i], fPatternValuesArray[i]);
			}
		}
		return rulesMap;
	}

	/**
	 * Return the matched value for the given pattern object
	 * 
	 * @param pExpr
	 * @return <code>null</code> if no matched expression exists
	 */
	public IExpr getValue(IPatternObject pattern) {
		int indx = pattern.getIndex();
		if (indx >= 0) {
			return fPatternValuesArray[indx];
		}
		return null;
	}

	/**
	 * Return the matched value for the given <code>index</code> if possisble.
	 * 
	 * @return <code>null</code> if no matched expression exists
	 */
	protected IExpr getValue(int index) {
		if (index < fPatternValuesArray.length) {
			return fPatternValuesArray[index];
		}
		return null;
	}

	public List<IExpr> getValuesAsList() {
		List<IExpr> args = new ArrayList<IExpr>(fPatternValuesArray.length);
		IExpr arg;
		for (int i = 0; i < fPatternValuesArray.length; i++) {
			arg = fPatternValuesArray[i];
			if (arg == null)
				return null;
			args.add(arg);
		}
		return args;
	}

	/**
	 * Set all pattern values to <code>null</code>;
	 */
	protected void initPattern() {
		Arrays.fill(fPatternValuesArray, null);
	}

	/**
	 * Check if all symbols in the symbols array have corresponding values assigned.
	 * 
	 * @return
	 */
	public boolean isAllPatternsAssigned() {
		if (fPatternValuesArray != null) {
			// all patterns have values assigned?
			for (int i = 0; i < fPatternValuesArray.length; i++) {
				if (fPatternValuesArray[i] == null) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Returns true if the given expression contains no patterns
	 * 
	 * @return
	 */
	public boolean isRuleWithoutPatterns() {
		return fRuleWithoutPattern;
	}

	/**
	 * Reset the values to the values in the given array
	 * 
	 * @param patternValuesArray
	 * @see PatternMap#copyPattern()
	 */
	public void resetPattern(IExpr[] patternValuesArray) {
		System.arraycopy(patternValuesArray, 0, fPatternValuesArray, 0, fPatternValuesArray.length);
	}

	public void setValue(IPatternObject pattern, IExpr expr) {
		int indx = pattern.getIndex();
		if (indx >= 0) {
			fPatternValuesArray[indx] = expr;
		}
	}

	public int size() {
		return fPatternValuesArray.length;
	}

	/**
	 * Substitute all symbols in the given expression with the current value of the given arrays
	 * 
	 * @param expression
	 * 
	 * @return
	 */
	public IExpr substitutePatternSymbols(final IExpr expression) {
		if (fPatternValuesArray != null) {
			return F.subst(expression, Functors.rules(getRulesMap()));
		}
		return expression;
	}

}