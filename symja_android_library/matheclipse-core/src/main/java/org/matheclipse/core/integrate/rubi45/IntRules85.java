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
public class IntRules85 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Times(d_,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),Power($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,m),Int(Power(Times(d,Csc(Plus(a,Times(b,x)))),Plus(n,Negate(m))),x)),And(FreeQ(List(a,b,d,n),x),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(Times(d_,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),Power($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(d,m),Int(Power(Times(d,Sec(Plus(a,Times(b,x)))),Plus(n,Negate(m))),x)),And(FreeQ(List(a,b,d,n),x),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(Times(d_DEFAULT,$($s("§csc"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),Power(Times(c_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(Times(Power(Times(c,Sin(Plus(a,Times(b,x)))),n),Power(Times(d,Csc(Plus(a,Times(b,x)))),n),Int(Power(Times(c,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(n))),x)),And(FreeQ(List(a,b,c,d,m,n),x),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(Times(c_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Times(Power(Times(c,Cos(Plus(a,Times(b,x)))),n),Power(Times(d,Sec(Plus(a,Times(b,x)))),n),Int(Power(Times(c,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(n))),x)),And(FreeQ(List(a,b,c,d,m,n),x),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(Times(d_DEFAULT,$($s("§cot"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),Power(Times(c_DEFAULT,$($s("§tan"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(c,Tan(Plus(a,Times(b,x)))),n),Power(Times(d,Cot(Plus(a,Times(b,x)))),n),Int(Power(Times(c,Tan(Plus(a,Times(b,x)))),Plus(m,Negate(n))),x)),FreeQ(List(a,b,c,d,m,n),x))),
ISetDelayed(Int(Times($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(Sin(Plus(a,Negate(c),Times(Plus(b,Negate(d)),x))),Power(Times(C2,Plus(b,Negate(d))),-1)),Times(CN1,Sin(Plus(a,c,Times(Plus(b,d),x))),Power(Times(C2,Plus(b,d)),-1))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(b),Negate(Sqr(d))))))),
ISetDelayed(Int(Times($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),$($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(Sin(Plus(a,Negate(c),Times(Plus(b,Negate(d)),x))),Power(Times(C2,Plus(b,Negate(d))),-1)),Times(Sin(Plus(a,c,Times(Plus(b,d),x))),Power(Times(C2,Plus(b,d)),-1))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(b),Negate(Sqr(d))))))),
ISetDelayed(Int(Times($($s("§cos"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN1,Cos(Plus(a,Negate(c),Times(Plus(b,Negate(d)),x))),Power(Times(C2,Plus(b,Negate(d))),-1)),Times(CN1,Cos(Plus(a,c,Times(Plus(b,d),x))),Power(Times(C2,Plus(b,d)),-1))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Sqr(b),Negate(Sqr(d))))))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_),Sqr($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Power(Times(g,Sin(Plus(c,Times(d,x)))),p),x)),Times(C1D2,Int(Times(Cos(Plus(c,Times(d,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(FreeQ(List(a,b,c,d,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),PositiveIntegerQ(Times(C1D2,p))))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_),Sqr($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Power(Times(g,Sin(Plus(c,Times(d,x)))),p),x)),Times(CN1,C1D2,Int(Times(Cos(Plus(c,Times(d,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(FreeQ(List(a,b,c,d,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),PositiveIntegerQ(Times(C1D2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(C2,p),Power(Power(e,p),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,p)),Power(Sin(Plus(a,Times(b,x))),p)),x)),And(And(And(FreeQ(List(a,b,c,d,e,m),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(C2,p),Power(Power(f,p),-1),Int(Times(Power(Cos(Plus(a,Times(b,x))),p),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,p))),x)),And(And(And(FreeQ(List(a,b,c,d,f,n),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Times(Sqr(e),Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),And(And(And(And(FreeQ(List(a,b,c,d,e,g,m,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),ZeroQ(Plus(m,p,Negate(C1)))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Times(CN1,Sqr(e),Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),And(And(And(And(FreeQ(List(a,b,c,d,e,g,m,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),ZeroQ(Plus(m,p,Negate(C1)))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Times(CN1,Power(Times(e,Cos(Plus(a,Times(b,x)))),m),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(b,g,m),-1)),And(And(And(And(FreeQ(List(a,b,c,d,e,g,m,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),ZeroQ(Plus(m,Times(C2,p),C2))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),m),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(b,g,m),-1)),And(And(And(And(FreeQ(List(a,b,c,d,e,g,m,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),ZeroQ(Plus(m,Times(C2,p),C2))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(Sqr(e),Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),Times(Power(e,4),Plus(m,p,Negate(C1)),Power(Times(C4,Sqr(g),Plus(p,C1)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C4))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C2))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,p)),Greater(m,C2)),Less(p,CN1)),Or(Greater(m,C3),Equal(p,QQ(-3L,2L)))),IntegersQ(Times(C2,m),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Sqr(e),Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),Times(Power(e,4),Plus(m,p,Negate(C1)),Power(Times(C4,Sqr(g),Plus(p,C1)),-1),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C4))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C2))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,p)),Greater(m,C2)),Less(p,CN1)),Or(Greater(m,C3),Equal(p,QQ(-3L,2L)))),IntegersQ(Times(C2,m),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),m),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),Times(Sqr(e),Plus(m,Times(C2,p),C2),Power(Times(C4,Sqr(g),Plus(p,C1)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C2))),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,p)),Greater(m,C1)),Less(p,CN1)),NonzeroQ(Plus(m,Times(C2,p),C2))),Or(Less(p,CN2),Equal(m,C2))),IntegersQ(Times(C2,m),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(e,Sin(Plus(a,Times(b,x)))),m),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),Times(Sqr(e),Plus(m,Times(C2,p),C2),Power(Times(C4,Sqr(g),Plus(p,C1)),-1),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C2))),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,p)),Greater(m,C1)),Less(p,CN1)),NonzeroQ(Plus(m,Times(C2,p),C2))),Or(Less(p,CN2),Equal(m,C2))),IntegersQ(Times(C2,m),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(Sqr(e),Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(m,Times(C2,p))),-1)),Times(Sqr(e),Plus(m,p,Negate(C1)),Power(Plus(m,Times(C2,p)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,g,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m)),Greater(m,C1)),NonzeroQ(Plus(m,Times(C2,p)))),IntegersQ(Times(C2,m),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Sqr(e),Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(m,Times(C2,p))),-1)),Times(Sqr(e),Plus(m,p,Negate(C1)),Power(Plus(m,Times(C2,p)),-1),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,g,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m)),Greater(m,C1)),NonzeroQ(Plus(m,Times(C2,p)))),IntegersQ(Times(C2,m),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(e,Cos(Plus(a,Times(b,x)))),m),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(m,p,C1)),-1)),Times(Plus(m,Times(C2,p),C2),Power(Times(Sqr(e),Plus(m,p,C1)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,g,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(m,Times(C2,p),C2))),NonzeroQ(Plus(m,p,C1))),IntegersQ(Times(C2,m),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),m),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(m,p,C1)),-1)),Times(Plus(m,Times(C2,p),C2),Power(Times(Sqr(e),Plus(m,p,C1)),-1),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,g,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(m,Times(C2,p),C2))),NonzeroQ(Plus(m,p,C1))),IntegersQ(Times(C2,m),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_),$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(C2,Sin(Plus(a,Times(b,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(d,Plus(Times(C2,p),C1)),-1)),Times(C2,p,g,Power(Plus(Times(C2,p),C1),-1),Int(Times(Sin(Plus(a,Times(b,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,Negate(C1)))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(p)),Greater(p,C0)),IntegerQ(Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_),$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN2,Cos(Plus(a,Times(b,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(d,Plus(Times(C2,p),C1)),-1)),Times(C2,p,g,Power(Plus(Times(C2,p),C1),-1),Int(Times(Cos(Plus(a,Times(b,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,Negate(C1)))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(p)),Greater(p,C0)),IntegerQ(Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_),$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(Cos(Plus(a,Times(b,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),Times(Plus(Times(C2,p),C3),Power(Times(C2,g,Plus(p,C1)),-1),Int(Times(Sin(Plus(a,Times(b,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(p)),Less(p,CN1)),IntegerQ(Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_),$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN1,Sin(Plus(a,Times(b,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(p,C1)),-1)),Times(Plus(Times(C2,p),C3),Power(Times(C2,g,Plus(p,C1)),-1),Int(Times(Cos(Plus(a,Times(b,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(p)),Less(p,CN1)),IntegerQ(Times(C2,p))))),
ISetDelayed(Int(Times(Power($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),CN1D2),$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN1,ArcSin(Plus(Cos(Plus(a,Times(b,x))),Negate(Sin(Plus(a,Times(b,x)))))),Power(d,-1)),Times(Log(Plus(Cos(Plus(a,Times(b,x))),Sin(Plus(a,Times(b,x))),Sqrt(Sin(Plus(c,Times(d,x)))))),Power(d,-1))),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))))),
ISetDelayed(Int(Times(Power($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),CN1D2),$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN1,ArcSin(Plus(Cos(Plus(a,Times(b,x))),Negate(Sin(Plus(a,Times(b,x)))))),Power(d,-1)),Times(CN1,Log(Plus(Cos(Plus(a,Times(b,x))),Sin(Plus(a,Times(b,x))),Sqrt(Sin(Plus(c,Times(d,x)))))),Power(d,-1))),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_),Power($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),-1)),x_Symbol),
    Condition(Times(C2,g,Int(Times(Sin(Plus(a,Times(b,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,Negate(C1)))),x)),And(And(And(And(FreeQ(List(a,b,c,d,g,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),IntegerQ(Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_),Power($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_))),-1)),x_Symbol),
    Condition(Times(C2,g,Int(Times(Cos(Plus(a,Times(b,x))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,Negate(C1)))),x)),And(And(And(And(FreeQ(List(a,b,c,d,g,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),IntegerQ(Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Times(Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),p),Power(Sin(Plus(a,Times(b,x))),p)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,p)),Power(Sin(Plus(a,Times(b,x))),p)),x)),And(And(And(FreeQ(List(a,b,c,d,e,g,m,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Times(Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(Power(Cos(Plus(a,Times(b,x))),p),Power(Times(f,Sin(Plus(a,Times(b,x)))),p)),-1),Int(Times(Power(Cos(Plus(a,Times(b,x))),p),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,p))),x)),And(And(And(FreeQ(List(a,b,c,d,f,g,n,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(Sqr($($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Sqr($($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(C1D4,Int(Power(Times(g,Sin(Plus(c,Times(d,x)))),p),x)),Times(CN1,C1D4,Int(Times(Sqr(Cos(Plus(c,Times(d,x)))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(FreeQ(List(a,b,c,d,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),PositiveIntegerQ(Times(C1D2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power($($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(C2,p),Power(Times(Power(e,p),Power(f,p)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,p)),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,f,m,n),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Times(e,Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C1))),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,f,Plus(n,p,C1)),-1)),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),ZeroQ(Plus(m,p,C1))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Times(CN1,e,Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C1))),Power(Times(f,Cos(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,f,Plus(n,p,C1)),-1)),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),ZeroQ(Plus(m,p,C1))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Times(CN1,Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,e,f,Plus(m,p,C1)),-1)),And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),ZeroQ(Plus(m,n,Times(C2,p),C2))),NonzeroQ(Plus(m,p,C1))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(Sqr(e),Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(f,Sin(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(n,p,C1)),-1)),Times(Power(e,4),Plus(m,p,Negate(C1)),Power(Times(C4,Sqr(g),Plus(n,p,C1)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C4))),Power(Times(f,Sin(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C2))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,p)),Greater(m,C3)),Less(p,CN1)),NonzeroQ(Plus(n,p,C1))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Sqr(e),Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(f,Cos(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(n,p,C1)),-1)),Times(Power(e,4),Plus(m,p,Negate(C1)),Power(Times(C4,Sqr(g),Plus(n,p,C1)),-1),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C4))),Power(Times(f,Cos(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C2))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,p)),Greater(m,C3)),Less(p,CN1)),NonzeroQ(Plus(n,p,C1))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),m),Power(Times(f,Sin(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(n,p,C1)),-1)),Times(Sqr(e),Plus(m,n,Times(C2,p),C2),Power(Times(C4,Sqr(g),Plus(n,p,C1)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(f,Sin(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C2))),x))),And(And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,p)),Greater(m,C1)),Less(p,CN1)),NonzeroQ(Plus(m,n,Times(C2,p),C2))),NonzeroQ(Plus(n,p,C1))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))),Or(Or(Less(p,CN2),Equal(m,C2)),Equal(m,C3))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(e,Sin(Plus(a,Times(b,x)))),m),Power(Times(f,Cos(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1)),Power(Times(C2,b,g,Plus(n,p,C1)),-1)),Times(Sqr(e),Plus(m,n,Times(C2,p),C2),Power(Times(C4,Sqr(g),Plus(n,p,C1)),-1),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(f,Cos(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C2))),x))),And(And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,p)),Greater(m,C1)),Less(p,CN1)),NonzeroQ(Plus(m,n,Times(C2,p),C2))),NonzeroQ(Plus(n,p,C1))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))),Or(Or(Less(p,CN2),Equal(m,C2)),Equal(m,C3))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(e,Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C1))),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,f,Plus(n,p,C1)),-1)),Times(Sqr(e),Plus(m,p,Negate(C1)),Power(Times(Sqr(f),Plus(n,p,C1)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,C2)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,n)),Greater(m,C1)),Less(n,CN1)),NonzeroQ(Plus(n,p,C1))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,e,Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C1))),Power(Times(f,Cos(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,f,Plus(n,p,C1)),-1)),Times(Sqr(e),Plus(m,p,Negate(C1)),Power(Times(Sqr(f),Plus(n,p,C1)),-1),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(f,Cos(Plus(a,Times(b,x)))),Plus(n,C2)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,n)),Greater(m,C1)),Less(n,CN1)),NonzeroQ(Plus(n,p,C1))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(e,Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C1))),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,f,Plus(m,n,Times(C2,p))),-1)),Times(Sqr(e),Plus(m,p,Negate(C1)),Power(Plus(m,n,Times(C2,p)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(f,Sin(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m)),Greater(m,C1)),NonzeroQ(Plus(m,n,Times(C2,p)))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,e,Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C1))),Power(Times(f,Cos(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,f,Plus(m,n,Times(C2,p))),-1)),Times(Sqr(e),Plus(m,p,Negate(C1)),Power(Plus(m,n,Times(C2,p)),-1),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,Negate(C2))),Power(Times(f,Cos(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m)),Greater(m,C1)),NonzeroQ(Plus(m,n,Times(C2,p)))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,f,Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,Negate(C1))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,e,Plus(m,n,Times(C2,p))),-1)),Times(C2,f,g,Plus(n,p,Negate(C1)),Power(Times(e,Plus(m,n,Times(C2,p))),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,Negate(C1))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,Negate(C1)))),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,n,p)),Less(m,CN1)),Greater(n,C0)),Greater(p,C0)),NonzeroQ(Plus(m,n,Times(C2,p)))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(f,Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Cos(Plus(a,Times(b,x)))),Plus(n,Negate(C1))),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,e,Plus(m,n,Times(C2,p))),-1)),Times(C2,f,g,Plus(n,p,Negate(C1)),Power(Times(e,Plus(m,n,Times(C2,p))),-1),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Cos(Plus(a,Times(b,x)))),Plus(n,Negate(C1))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,Negate(C1)))),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,n,p)),Less(m,CN1)),Greater(n,C0)),Greater(p,C0)),NonzeroQ(Plus(m,n,Times(C2,p)))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,e,f,Plus(m,p,C1)),-1)),Times(f,Plus(m,n,Times(C2,p),C2),Power(Times(C2,e,g,Plus(m,p,C1)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,Negate(C1))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1))),x))),And(And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,n,p)),Less(m,CN1)),Greater(n,C0)),Less(p,CN1)),NonzeroQ(Plus(m,n,Times(C2,p),C2))),NonzeroQ(Plus(m,p,C1))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Cos(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,e,f,Plus(m,p,C1)),-1)),Times(f,Plus(m,n,Times(C2,p),C2),Power(Times(C2,e,g,Plus(m,p,C1)),-1),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Cos(Plus(a,Times(b,x)))),Plus(n,Negate(C1))),Power(Times(g,Sin(Plus(c,Times(d,x)))),Plus(p,C1))),x))),And(And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m,n,p)),Less(m,CN1)),Greater(n,C0)),Less(p,CN1)),NonzeroQ(Plus(m,n,Times(C2,p),C2))),NonzeroQ(Plus(m,p,C1))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,e,f,Plus(m,p,C1)),-1)),Times(Plus(m,n,Times(C2,p),C2),Power(Times(Sqr(e),Plus(m,p,C1)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(f,Sin(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(m,n,Times(C2,p),C2))),NonzeroQ(Plus(m,p,C1))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(f_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(e_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,C1)),Power(Times(f,Cos(Plus(a,Times(b,x)))),Plus(n,C1)),Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(b,e,f,Plus(m,p,C1)),-1)),Times(Plus(m,n,Times(C2,p),C2),Power(Times(Sqr(e),Plus(m,p,C1)),-1),Int(Times(Power(Times(e,Sin(Plus(a,Times(b,x)))),Plus(m,C2)),Power(Times(f,Cos(Plus(a,Times(b,x)))),n),Power(Times(g,Sin(Plus(c,Times(d,x)))),p)),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(m,n,Times(C2,p),C2))),NonzeroQ(Plus(m,p,C1))),IntegersQ(Times(C2,m),Times(C2,n),Times(C2,p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),Power(Times(f_DEFAULT,$($s("§sin"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT),Power(Times(g_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Times(Power(Times(g,Sin(Plus(c,Times(d,x)))),p),Power(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),p),Power(Times(f,Sin(Plus(a,Times(b,x)))),p)),-1),Int(Times(Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,p)),Power(Times(f,Sin(Plus(a,Times(b,x)))),Plus(n,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(C2)))),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(Power(Times(e_DEFAULT,$($s("§cos"),Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),m_DEFAULT),$($s("§sin"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),x_Symbol),
    Condition(Times(CN1,Plus(m,C2),Power(Times(e,Cos(Plus(a,Times(b,x)))),Plus(m,C1)),Cos(Times(Plus(m,C1),Plus(a,Times(b,x)))),Power(Times(d,e,Plus(m,C1)),-1)),And(And(FreeQ(List(a,b,c,d,e,m),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,Power(b,-1)),Negate(Abs(Plus(m,C2))))))))
  );
}
