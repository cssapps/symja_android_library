package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules8 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),Power(x_,n_))),Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),-1)),x_Symbol),
    Condition(Plus(Times(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Power(Plus(Times(b,c),Times(CN1,a,d)),-1),Int(Power(Plus(a,Times(b,Power(x,n))),-1),x)),Times(Plus(Times($s("B"),c),Times(CN1,$s("A"),d)),Power(Plus(Times(b,c),Times(CN1,a,d)),-1),Int(Power(Plus(c,Times(d,Power(x,n))),-1),x))),And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),NonzeroQ(Plus(Times($s("B"),c),Times(CN1,$s("A"),d)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),Power(x_,n_))),Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),-1)),x_Symbol),
    Condition(Plus(Times($s("B"),Power(b,-1),Int(Power(Plus(c,Times(d,Power(x,n))),CN1D2),x)),Times(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Power(b,-1),Int(Power(Times(Plus(a,Times(b,Power(x,n))),Sqrt(Plus(c,Times(d,Power(x,n))))),-1),x))),And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),NonzeroQ(Plus(Times($s("B"),c),Times(CN1,$s("A"),d)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),Power(x_,n_))),Power(Times(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),-1)),x_Symbol),
    Condition(Plus(Times($s("B"),Power(b,-1),Int(Times(Sqrt(Plus(a,Times(b,Power(x,n)))),Power(Plus(c,Times(d,Power(x,n))),CN1D2)),x)),Times(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Power(b,-1),Int(Power(Times(Sqrt(Plus(a,Times(b,Power(x,n)))),Sqrt(Plus(c,Times(d,Power(x,n))))),-1),x))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),NonzeroQ(Plus(Times($s("B"),c),Times(CN1,$s("A"),d)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),Not(And(Equal(n,C2),SimplerSqrtQ(Times(CN1,b,Power(a,-1)),Times(CN1,d,Power(c,-1)))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),Power(x_,n_))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,b,n,Plus(p,C1)),-1)),Times(Power(Times(a,b,n,Plus(p,C1)),-1),Int(Times(Simp(Plus(Times(c,Plus(Times($s("A"),b,n,Plus(p,C1)),Times($s("A"),b),Times(CN1,a,$s("B")))),Times(d,Plus(Times($s("A"),b,n,Plus(p,C1)),Times(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Plus(Times(n,q),C1))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1)))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),NonzeroQ(Plus(Times($s("B"),c),Times(CN1,$s("A"),d)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(p,q)),Less(p,CN1)),Greater(q,C0)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),Power(x_,n_))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("B"),x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(b,Plus(Times(n,Plus(p,q,C1)),C1)),-1)),Times(Power(Times(b,Plus(Times(n,Plus(p,q,C1)),C1)),-1),Int(Times(Simp(Plus(Times(c,Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times($s("A"),b,n,Plus(p,q,C1)))),Times(Plus(Times(d,Plus(Times($s("A"),b),Times(CN1,a,$s("B")))),Times($s("B"),n,q,Plus(Times(b,c),Times(CN1,a,d))),Times($s("A"),b,d,n,Plus(p,q,C1))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Negate(C1)))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n,p),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),NonzeroQ(Plus(Times($s("B"),c),Times(CN1,$s("A"),d)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(q)),Greater(q,C0)),NonzeroQ(Plus(Times(n,Plus(p,q,C1)),C1))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),Power(x_,n_))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),x,Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(a,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1)),Times(Power(Times(a,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),-1),Int(Times(Simp(Plus(Times(c,Plus(Times($s("A"),b),Times(CN1,a,$s("B")))),Times($s("A"),n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),Times(d,Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Plus(Times(n,Plus(p,q,C2)),C1),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n,q),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),NonzeroQ(Plus(Times($s("B"),c),Times(CN1,$s("A"),d)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,n_))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("A"),Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x)),Times($s("B"),Int(Times(Power(x,n),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x))),And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n,p,q),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),NonzeroQ(Plus(Times($s("B"),c),Times(CN1,$s("A"),d)))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times(d,Power(b,-1),Int(Times(Power(Plus(c,Times(d,Power(x,n))),Plus(p,Negate(C1))),Power(Plus(e,Times(f,Power(x,n))),q)),x)),Times(Plus(Times(b,c),Times(CN1,a,d)),Power(b,-1),Int(Times(Power(Plus(c,Times(d,Power(x,n))),Plus(p,Negate(C1))),Power(Plus(e,Times(f,Power(x,n))),q),Power(Plus(a,Times(b,Power(x,n))),-1)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,n,q),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(b,e),Times(CN1,a,f)))),NonzeroQ(Plus(Times(d,e),Times(CN1,c,f)))),RationalQ(p)),Greater(p,C0)))),
ISetDelayed(Int(Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_))),Sqrt(Plus(e_DEFAULT,Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Plus(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),-1),Int(Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x)),Times(CN1,d,Power(Plus(Times(b,c),Times(CN1,a,d)),-1),Int(Power(Times(Plus(c,Times(d,Sqr(x))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x))),And(And(And(FreeQ(List(a,b,c,d,e,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(b,e),Times(CN1,a,f)))),NonzeroQ(Plus(Times(d,e),Times(CN1,c,f)))))),
ISetDelayed(Int(Power(Times(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_))),Sqr(x_),Sqrt(Plus(e_DEFAULT,Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Plus(Times(Power(c,-1),Int(Power(Times(Sqr(x),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x)),Times(CN1,d,Power(c,-1),Int(Power(Times(Plus(c,Times(d,Sqr(x))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),x))),And(FreeQ(List(c,d,e,f),x),NonzeroQ(Plus(Times(d,e),Times(CN1,c,f)))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,Sqr(x_))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),Sqrt(Plus(e_,Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Times(Power(Times(a,Sqrt(c),Sqrt(e),Rt(Times(CN1,d,Power(c,-1)),C2)),-1),EllipticPi(Times(b,c,Power(Times(a,d),-1)),ArcSin(Times(Rt(Times(CN1,d,Power(c,-1)),C2),x)),Times(c,f,Power(Times(e,d),-1)))),And(And(And(FreeQ(List(a,b,c,d,e,f),x),PositiveQ(c)),PositiveQ(e)),Or(And(PosQ(Times(CN1,e,f)),Or(NegQ(Times(CN1,c,d)),Not(RationalQ(Rt(Times(CN1,c,d),C2))))),And(And(NegQ(Times(CN1,e,f)),NegQ(Times(CN1,c,d))),Not(RationalQ(Rt(Times(c,d),C2)))))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,Sqr(x_))),Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),Sqrt(Plus(e_,Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Times(Sqrt(Times(Plus(c,Times(d,Sqr(x))),Power(c,-1))),Sqrt(Times(Plus(e,Times(f,Sqr(x))),Power(e,-1))),Power(Times(Sqrt(Plus(c,Times(d,Sqr(x)))),Sqrt(Plus(e,Times(f,Sqr(x))))),-1),Int(Power(Times(Plus(a,Times(b,Sqr(x))),Sqrt(Plus(C1,Times(d,Power(c,-1),Sqr(x)))),Sqrt(Plus(C1,Times(f,Power(e,-1),Sqr(x))))),-1),x)),And(And(FreeQ(List(a,b,c,d,e,f),x),Not(And(PositiveQ(c),PositiveQ(e)))),Or(And(PosQ(Times(CN1,e,f)),Or(NegQ(Times(CN1,c,d)),Not(RationalQ(Rt(Times(CN1,c,d),C2))))),And(And(NegQ(Times(CN1,e,f)),NegQ(Times(CN1,c,d))),Not(RationalQ(Rt(Times(c,d),C2)))))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),-1),Power(Plus(e_DEFAULT,Times(f_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,d,Power(Plus(Times(b,c),Times(CN1,a,d)),-1),Int(Times(Power(Plus(c,Times(d,Power(x,n))),p),Power(Plus(e,Times(f,Power(x,n))),q)),x)),Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),-1),Int(Times(Power(Plus(c,Times(d,Power(x,n))),Plus(p,C1)),Power(Plus(e,Times(f,Power(x,n))),q),Power(Plus(a,Times(b,Power(x,n))),-1)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,n,q),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(b,e),Times(CN1,a,f)))),NonzeroQ(Plus(Times(d,e),Times(CN1,c,f)))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),p_),Power(Plus(e_DEFAULT,Times(f_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Module(List(Set(u,ExpandIntegrand(Times(Power(Plus(a,Times(b,Power(x,n))),m),Power(Plus(c,Times(d,Power(x,n))),p),Power(Plus(e,Times(f,Power(x,n))),q)),x))),Condition(Int(u,x),SumQ(u))),And(And(And(And(FreeQ(List(a,b,c,d,e,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(b,e),Times(CN1,a,f)))),NonzeroQ(Plus(Times(d,e),Times(CN1,c,f)))),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(a,Times(b,Power(x,n))),m),Power(Plus(c,Times(d,Power(x,n))),p),Power(Plus(e,Times(f,Power(x,n))),q)),x),FreeQ(List(a,b,c,d,e,f,m,n,p,q),x))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,n_))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(v_,n_))),p_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,Power(w_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),-1),Subst(Int(Times(Power(Plus(a,Times(b,Power(x,n))),m),Power(Plus(c,Times(d,Power(x,n))),p),Power(Plus(e,Times(f,Power(x,n))),q)),x),x,u)),And(And(And(And(FreeQ(List(a,b,c,d,e,f,m,n,p,q),x),ZeroQ(Plus(u,Negate(v)))),ZeroQ(Plus(u,Negate(w)))),LinearQ(u,x)),NonzeroQ(Plus(u,Negate(x)))))),
ISetDelayed(Int(Times(Power(u_,m_DEFAULT),Power(v_,p_DEFAULT),Power(w_,q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(ExpandToSum(v,x),p),Power(ExpandToSum(w,x),q)),x),And(And(And(And(FreeQ(List(m,p,q),x),BinomialQ(List(u,v,w),x)),ZeroQ(Plus(BinomialDegree(u,x),Negate(BinomialDegree(v,x))))),ZeroQ(Plus(BinomialDegree(u,x),Negate(BinomialDegree(w,x))))),Not(BinomialMatchQ(List(u,v,w),x)))))
  );
}
