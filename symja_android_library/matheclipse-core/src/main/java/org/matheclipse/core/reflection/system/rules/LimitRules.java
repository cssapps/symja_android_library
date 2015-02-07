package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symjaunittests">https://bitbucket.org/axelclk/symjaunittests</a>.
 */
public interface LimitRules {
  final public static IAST RULES = List(
    ISetDelayed(Limit(Power(x_,$p(m,NumberQ)),Rule(x_Symbol,CInfinity)),
      Condition(CInfinity,Positive(m))),
    ISetDelayed(Limit(Power(x_,$p(m,NumberQ)),Rule(x_Symbol,CInfinity)),
      Condition(C0,Negative(m))),
    ISetDelayed(Limit(Power($p(m,NumberQ),x_),Rule(x_Symbol,CInfinity)),
      Condition(If(Greater(m,C1),CInfinity,If(Equal(m,C1),C1,C0)),Positive(m))),
    ISetDelayed(Limit(Power($p(m,NumberQ),Negate(x_)),Rule(x_Symbol,CInfinity)),
      Condition(C0,Greater(m,C1))),
    ISetDelayed(Limit(Power(E,x_),Rule(x_Symbol,CInfinity)),
      CInfinity),
    ISetDelayed(Limit(Power(E,x_),Rule(x_Symbol,Negate(CInfinity))),
      C0),
    ISet(Limit(Log(x_),Rule(x_Symbol,CInfinity)),
      CInfinity),
    ISet(Limit(Power(Plus(C1,Power(x_,CN1)),x_),Rule(x_Symbol,CInfinity)),
      E),
    ISet(Limit(Power(Plus(C1,Times(a_,Power(x_,CN1))),x_),Rule(x_Symbol,CInfinity)),
      Power(E,a)),
    ISetDelayed(Limit(HarmonicNumber(y_Symbol,$p(s,IntegerQ)),Rule(x_Symbol,CInfinity)),
      Condition(Module(List(Set(v,Times(C1D2,s))),Times(Power(Times(C2,Pi),Times(C2,v)),Power(CN1,Plus(v,C1)),BernoulliB(Times(C2,v)),Power(Times(C2,Factorial(Times(C2,v))),CN1))),And(EvenQ(s),Positive(s))))
  );
}
