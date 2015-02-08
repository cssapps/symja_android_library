package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symjaunittests">https://bitbucket.org/axelclk/symjaunittests</a>.
 */
public interface LogRules {
  final public static IAST RULES = List(
    ISet(Log(C1),
      C0),
    ISet(Log(E),
      C1),
    ISetDelayed(Log(Power(E,$p(x,IntegerQ))),
      x),
    ISetDelayed(Log(Power(E,$p(x,Rational))),
      x),
    ISet(Log(Power(E,CI)),
      CI),
    ISet(Log(Power(E,CNI)),
      CNI),
    ISet(Log(C0),
      CNInfinity),
    ISetDelayed(Log(a_,E),
      Power(Log(a),-1)),
    ISetDelayed(Log(a_,Power(E,$p(m,IntegerQ))),
      Times(m,Power(Log(a),-1))),
    ISetDelayed(Log(a_,C0),
      Times(CN1,CInfinity,Power(Log(a),-1))),
    ISet(Log(a_,C1),
      C0),
    ISetDelayed(Log(a_,CN1),
      Times(CI,Pi,Power(Log(a),-1))),
    ISetDelayed(Log(E,z_),
      Log(z)),
    ISet(Log(C0,z_),
      C0),
    ISet(Log(C1,z_),
      CComplexInfinity),
    ISetDelayed(Log(CN1,z_),
      Times(CN1,CI,Power(Pi,-1),Log(z))),
    ISet(Log(a_,C1),
      Indeterminate)
  );
}
