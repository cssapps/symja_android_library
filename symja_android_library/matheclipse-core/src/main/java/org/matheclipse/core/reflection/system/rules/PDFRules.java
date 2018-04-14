package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface PDFRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 4 };

  final public static IAST RULES = List(
    IInit(PDF, SIZES),
    // PDF(GammaDistribution(a_,b_)):=Piecewise({{1/(b^a*E^(#1/b)*Gamma(a)*#1^(1-a)),#1>0}},0)&
    ISetDelayed(PDF(GammaDistribution(a_,b_)),
      Function(Piecewise(List(List(Times(Power(Times(Power(b,a),Exp(Times(Power(b,-1),Slot1)),Gamma(a)),-1),Power(Slot1,Plus(CN1,a))),Greater(Slot1,C0))),C0))),
    // PDF(GammaDistribution(a_,b_,g_,d_)):=Piecewise({{g/(E^((-d+#1)/b)^g*b*Gamma(a)*((-d+#1)/b)^(1-a*g)),#1>d}},0)&
    ISetDelayed(PDF(GammaDistribution(a_,b_,g_,d_)),
      Function(Piecewise(List(List(Times(g,Power(Times(Exp(Power(Times(Power(b,-1),Plus(Negate(d),Slot1)),g)),b,Gamma(a)),-1),Power(Times(Power(b,-1),Plus(Negate(d),Slot1)),Plus(CN1,Times(a,g)))),Greater(Slot1,d))),C0))),
    // PDF(NormalDistribution()):=1/(E^(#1^2/2)*Sqrt(2*Pi))&
    ISetDelayed(PDF(NormalDistribution()),
      Function(Power(Times(Exp(Times(C1D2,Sqr(Slot1))),Sqrt(Times(C2,Pi))),-1))),
    // PDF(NormalDistribution(n_,m_)):=1/(E^((-n+#1)^2/(2*m^2))*m*Sqrt(2*Pi))&
    ISetDelayed(PDF(NormalDistribution(n_,m_)),
      Function(Power(Times(Exp(Times(Power(Times(C2,Sqr(m)),-1),Sqr(Plus(Negate(n),Slot1)))),m,Sqrt(Times(C2,Pi))),-1)))
  );
}