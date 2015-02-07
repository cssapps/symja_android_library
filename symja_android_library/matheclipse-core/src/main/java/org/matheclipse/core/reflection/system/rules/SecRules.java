package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symjaunittests">https://bitbucket.org/axelclk/symjaunittests</a>.
 */
public interface SecRules {
  final public static IAST RULES = List(
    ISet(Sec(C0),
      C1),
    ISet(Sec(Times(QQ(1L,12L),Pi)),
      Plus(Negate(CSqrt2),CSqrt6)),
    ISet(Sec(Times(QQ(1L,10L),Pi)),
      Sqrt(Plus(C2,Times(CN2,C1DSqrt5)))),
    ISet(Sec(Times(QQ(1L,8L),Pi)),
      Times(C2,Power(Plus(C2,CSqrt2),CN1D2))),
    ISet(Sec(Times(QQ(1L,6L),Pi)),
      Times(C2,C1DSqrt3)),
    ISet(Sec(Times(QQ(1L,5L),Pi)),
      Plus(CN1,CSqrt5)),
    ISet(Sec(Times(C1D4,Pi)),
      CSqrt2),
    ISet(Sec(Times(QQ(3L,10L),Pi)),
      Sqrt(Plus(C2,Times(C2,C1DSqrt5)))),
    ISet(Sec(Times(C1D3,Pi)),
      C2),
    ISet(Sec(Times(QQ(2L,5L),Pi)),
      Plus(C1,CSqrt5)),
    ISet(Sec(Times(QQ(5L,12L),Pi)),
      Plus(CSqrt2,CSqrt6)),
    ISet(Sec(Times(C1D2,Pi)),
      CComplexInfinity),
    ISet(Sec(Times(QQ(7L,12L),Pi)),
      Plus(Negate(CSqrt2),Negate(CSqrt6))),
    ISet(Sec(Times(QQ(3L,5L),Pi)),
      Plus(CN1,Negate(CSqrt5))),
    ISet(Sec(Times(QQ(2L,3L),Pi)),
      CN2),
    ISet(Sec(Times(QQ(7L,10L),Pi)),
      Negate(Sqrt(Plus(C2,Times(C2,C1DSqrt5))))),
    ISet(Sec(Times(QQ(3L,4L),Pi)),
      Negate(CSqrt2)),
    ISet(Sec(Times(QQ(4L,5L),Pi)),
      Plus(C1,Negate(CSqrt5))),
    ISet(Sec(Times(QQ(5L,6L),Pi)),
      Times(CN2,C1DSqrt3)),
    ISet(Sec(Times(QQ(9L,10L),Pi)),
      Negate(Sqrt(Plus(C2,Times(CN2,C1DSqrt5))))),
    ISet(Sec(Times(QQ(11L,12L),Pi)),
      Plus(CSqrt2,Negate(CSqrt6))),
    ISet(Sec(Pi),
      CN1),
    ISet(Sec(Times(QQ(13L,12L),Pi)),
      Plus(CSqrt2,Negate(CSqrt6))),
    ISet(Sec(Times(QQ(11L,10L),Pi)),
      Negate(Sqrt(Plus(C2,Times(CN2,C1DSqrt5))))),
    ISet(Sec(Times(QQ(7L,6L),Pi)),
      Times(CN2,C1DSqrt3)),
    ISet(Sec(Times(QQ(6L,5L),Pi)),
      Plus(C1,Negate(CSqrt5))),
    ISet(Sec(Times(QQ(5L,4L),Pi)),
      Negate(CSqrt2)),
    ISet(Sec(Times(QQ(4L,3L),Pi)),
      CN2),
    ISet(Sec(Times(QQ(7L,5L),Pi)),
      Plus(CN1,Negate(CSqrt5))),
    ISet(Sec(Times(QQ(3L,2L),Pi)),
      CComplexInfinity),
    ISet(Sec(Times(QQ(19L,12L),Pi)),
      Plus(CSqrt2,CSqrt6)),
    ISet(Sec(Times(QQ(8L,5L),Pi)),
      Plus(C1,CSqrt5)),
    ISet(Sec(Times(QQ(5L,3L),Pi)),
      C2),
    ISet(Sec(Times(QQ(17L,10L),Pi)),
      Sqrt(Plus(C2,Times(C2,C1DSqrt5)))),
    ISet(Sec(Times(QQ(7L,4L),Pi)),
      CSqrt2),
    ISet(Sec(Times(QQ(9L,5L),Pi)),
      Plus(CN1,CSqrt5)),
    ISet(Sec(Times(QQ(11L,6L),Pi)),
      Times(C2,C1DSqrt3)),
    ISet(Sec(Times(QQ(19L,10L),Pi)),
      Sqrt(Plus(C2,Times(CN2,C1DSqrt5)))),
    ISet(Sec(Times(QQ(23L,12L),Pi)),
      Plus(Negate(CSqrt2),CSqrt6)),
    ISet(Sec(Times(C2,Pi)),
      C1),
    ISet(Sec(DirectedInfinity(CI)),
      C0),
    ISet(Sec(DirectedInfinity(CNI)),
      C0),
    ISet(Sec(CComplexInfinity),
      Indeterminate)
  );
}
