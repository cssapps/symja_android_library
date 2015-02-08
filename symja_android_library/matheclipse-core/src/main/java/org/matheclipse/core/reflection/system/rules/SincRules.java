package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symjaunittests">https://bitbucket.org/axelclk/symjaunittests</a>.
 */
public interface SincRules {
  final public static IAST RULES = List(
    ISet(Sinc(C0),
      C1),
    ISet(Sinc(Times(QQ(1L,6L),Pi)),
      Times(C1D3,Pi)),
    ISet(Sinc(Times(C1D4,Pi)),
      Times(C2,CSqrt2,Power(Pi,-1))),
    ISet(Sinc(Times(C1D3,Pi)),
      Times(QQ(3L,2L),CSqrt3,Power(Pi,-1))),
    ISet(Sinc(Times(C1D2,Pi)),
      Times(C2,Power(Pi,-1))),
    ISet(Sinc(Pi),
      C0),
    ISet(Sinc(Times(QQ(5L,12L),Pi)),
      Times(QQ(3L,5L),Plus(C1,CSqrt3),CSqrt2,Power(Pi,-1))),
    ISet(Sinc(Times(QQ(1L,5L),Pi)),
      Times(C5,Power(Pi,-1),Sqrt(Plus(QQ(5L,8L),Times(QQ(-1L,8L),CSqrt5))))),
    ISet(Sinc(Times(QQ(1L,12L),Pi)),
      Times(Plus(CN3,Times(C3,CSqrt3)),CSqrt2,Power(Pi,-1))),
    ISet(Sinc(Times(QQ(1L,10L),Pi)),
      Times(QQ(5L,2L),Plus(CN1,CSqrt5),Power(Pi,-1))),
    ISet(Sinc(Times(QQ(2L,5L),Pi)),
      Times(QQ(5L,2L),Power(Pi,-1),Sqrt(Plus(QQ(5L,8L),Times(QQ(1L,8L),CSqrt5))))),
    ISet(Sinc(Times(QQ(3L,10L),Pi)),
      Times(QQ(5L,6L),Plus(C1,CSqrt5),Power(Pi,-1))),
    ISet(Sinc(CI),
      Sinh(C1)),
    ISetDelayed(Sinc(ArcSin(x_)),
      Times(x,Power(ArcSin(x),-1))),
    ISetDelayed(Sinc(ArcCos(x_)),
      Times(Sqrt(Plus(C1,Negate(Sqr(x)))),Power(ArcCos(x),-1))),
    ISetDelayed(Sinc(ArcTan(x_)),
      Times(x,Power(Plus(C1,Sqr(x)),CN1D2),Power(ArcTan(x),-1))),
    ISet(Sinc(DirectedInfinity(CI)),
      CInfinity),
    ISet(Sinc(CComplexInfinity),
      Indeterminate)
  );
}
