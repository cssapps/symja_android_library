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
public class IntRules125 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(u_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_DEFAULT,ArcTanh(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(c,Plus(p,C1D2)),Sqrt(Plus(C1,Times(CN1,Sqr(a),Sqr(x)))),Power(Plus(c,Times(d,Sqr(x))),CN1D2),Int(Times(u,Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),p),Power(E,Times(n,ArcTanh(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(Times(Sqr(a),c),d))),Not(PositiveQ(c))),Not(IntegerQ(Times(C1D2,n)))),NegativeIntegerQ(Plus(p,Negate(C1D2)))))),
ISetDelayed(Int(Times(u_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_DEFAULT,ArcTanh(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(Plus(c,Times(d,Sqr(x))),p),Power(Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),p),-1),Int(Times(u,Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),p),Power(E,Times(n,ArcTanh(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(Times(Sqr(a),c),d))),Not(Or(IntegerQ(p),PositiveQ(c)))),Not(IntegerQ(Times(C1D2,n)))),Not(IntegerQ(Plus(p,C1D2)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcTanh(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(d,p),Int(Times(u,Power(Power(x,Times(C2,p)),-1),Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),p),Power(E,Times(n,ArcTanh(Times(a,x))))),x)),And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(c,Times(Sqr(a),d)))),IntegerQ(p)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_),Power(E,Times(n_,ArcTanh(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(c,p),Int(Times(u,Power(Plus(C1,Negate(Power(Times(a,x),-1))),p),Power(Plus(C1,Power(Times(a,x),-1)),p),Power(E,Times(n,ArcTanh(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,d,p),x),ZeroQ(Plus(c,Times(Sqr(a),d)))),Not(IntegerQ(p))),IntegerQ(Times(C1D2,n))),PositiveQ(c)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_),Power(E,Times(n_,ArcTanh(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(x,Times(C2,p)),Power(Plus(c,Times(d,Power(x,-2))),p),Power(Times(Power(Plus(C1,Times(CN1,a,x)),p),Power(Plus(C1,Times(a,x)),p)),-1),Int(Times(u,Power(Power(x,Times(C2,p)),-1),Power(Plus(C1,Times(CN1,a,x)),p),Power(Plus(C1,Times(a,x)),p),Power(E,Times(n,ArcTanh(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(c,Times(Sqr(a),d)))),Not(IntegerQ(p))),IntegerQ(Times(C1D2,n))),Not(PositiveQ(c))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_),Power(E,Times(n_DEFAULT,ArcTanh(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(x,Times(C2,p)),Power(Plus(c,Times(d,Power(x,-2))),p),Power(Power(Plus(C1,Times(c,Sqr(x),Power(d,-1))),p),-1),Int(Times(u,Power(Power(x,Times(C2,p)),-1),Power(Plus(C1,Times(c,Sqr(x),Power(d,-1))),p),Power(E,Times(n,ArcTanh(Times(a,x))))),x)),And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(c,Times(Sqr(a),d)))),Not(IntegerQ(p))),Not(IntegerQ(Times(C1D2,n)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(E,Times(n_,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(CN1,Times(C1D2,n)),Int(Times(u,Power(E,Times(n,ArcTanh(Times(a,x))))),x)),And(FreeQ(a,x),IntegerQ(Times(C1D2,n))))),
ISetDelayed(Int(Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,Plus(n,C1))),Power(Times(Sqr(x),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,Plus(n,Negate(C1)))),Sqrt(Plus(C1,Times(CN1,Sqr(x),Power(a,-2))))),-1)),x),x,Power(x,-1))),And(FreeQ(a,x),OddQ(n)))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,Plus(n,C1))),Power(Times(Power(x,Plus(m,C2)),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,Plus(n,Negate(C1)))),Sqrt(Plus(C1,Times(CN1,Sqr(x),Power(a,-2))))),-1)),x),x,Power(x,-1))),And(And(FreeQ(a,x),OddQ(n)),IntegerQ(m)))),
ISetDelayed(Int(Power(E,Times(n_,ArcCoth(Times(a_DEFAULT,x_)))),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,n)),Power(Times(Sqr(x),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,n))),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,n),x),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcCoth(Times(a_DEFAULT,x_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,n)),Power(Times(Power(x,Plus(m,C2)),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,n))),-1)),x),x,Power(x,-1))),And(And(FreeQ(List(a,n),x),Not(IntegerQ(n))),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(x_,m_)),x_Symbol),
    Condition(Times(CN1,Power(x,m),Power(Power(x,-1),m),Subst(Int(Times(Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,Plus(n,C1))),Power(Times(Power(x,Plus(m,C2)),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,Plus(n,Negate(C1)))),Sqrt(Plus(C1,Times(CN1,Sqr(x),Power(a,-2))))),-1)),x),x,Power(x,-1))),And(And(FreeQ(List(a,m),x),OddQ(n)),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcCoth(Times(a_DEFAULT,x_)))),Power(x_,m_)),x_Symbol),
    Condition(Times(CN1,Power(x,m),Power(Power(x,-1),m),Subst(Int(Times(Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,n)),Power(Times(Power(x,Plus(m,C2)),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,n))),-1)),x),x,Power(x,-1))),And(And(FreeQ(List(a,m,n),x),Not(IntegerQ(n))),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_)),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(d,p),Int(Times(u,Power(x,p),Power(Plus(C1,Times(c,Power(Times(d,x),-1))),p),Power(E,Times(n,ArcCoth(Times(a,x))))),x)),And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(Times(Sqr(a),Sqr(c)),Negate(Sqr(d))))),Not(IntegerQ(Times(C1D2,n)))),IntegerQ(p)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_)),p_),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(Plus(c,Times(d,x)),p),Power(Times(Power(x,p),Power(Plus(C1,Times(c,Power(Times(d,x),-1))),p)),-1),Int(Times(u,Power(x,p),Power(Plus(C1,Times(c,Power(Times(d,x),-1))),p),Power(E,Times(n,ArcCoth(Times(a,x))))),x)),And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(Times(Sqr(a),Sqr(c)),Negate(Sqr(d))))),Not(IntegerQ(Times(C1D2,n)))),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(c,p),Subst(Int(Times(Power(Plus(C1,Times(d,x,Power(c,-1))),p),Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,n)),Power(Times(Sqr(x),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,n))),-1)),x),x,Power(x,-1))),And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(Sqr(c),Times(CN1,Sqr(a),Sqr(d))))),Not(IntegerQ(Times(C1D2,n)))),Or(IntegerQ(p),PositiveQ(c))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(CN1,Power(c,p),Subst(Int(Times(Power(Plus(C1,Times(d,x,Power(c,-1))),p),Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,n)),Power(Times(Power(x,Plus(m,C2)),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,n))),-1)),x),x,Power(x,-1))),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(Sqr(c),Times(CN1,Sqr(a),Sqr(d))))),Not(IntegerQ(Times(C1D2,n)))),Or(IntegerQ(p),PositiveQ(c))),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(CN1,Power(c,p),Power(x,m),Power(Power(x,-1),m),Subst(Int(Times(Power(Plus(C1,Times(d,x,Power(c,-1))),p),Power(Plus(C1,Times(x,Power(a,-1))),Times(C1D2,n)),Power(Times(Power(x,Plus(m,C2)),Power(Plus(C1,Times(CN1,x,Power(a,-1))),Times(C1D2,n))),-1)),x),x,Power(x,-1))),And(And(And(And(FreeQ(List(a,c,d,m,n,p),x),ZeroQ(Plus(Sqr(c),Times(CN1,Sqr(a),Sqr(d))))),Not(IntegerQ(Times(C1D2,n)))),Or(IntegerQ(p),PositiveQ(c))),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(Plus(c,Times(d,Power(x,-1))),p),Power(Power(Plus(C1,Times(d,Power(Times(c,x),-1))),p),-1),Int(Times(u,Power(Plus(C1,Times(d,Power(Times(c,x),-1))),p),Power(E,Times(n,ArcCoth(Times(a,x))))),x)),And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(Sqr(c),Times(CN1,Sqr(a),Sqr(d))))),Not(IntegerQ(Times(C1D2,n)))),Not(Or(IntegerQ(p),PositiveQ(c)))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Times(Power(E,Times(n,ArcCoth(Times(a,x)))),Power(Times(a,c,n),-1)),And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(Times(Sqr(a),c),d))),Not(IntegerQ(Times(C1D2,n)))))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Times(Plus(n,Times(CN1,a,x)),Power(E,Times(n,ArcCoth(Times(a,x)))),Power(Times(a,c,Plus(Sqr(n),Negate(C1)),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(Times(Sqr(a),c),d))),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(Plus(n,Times(C2,a,Plus(p,C1),x)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcCoth(Times(a,x)))),Power(Times(a,c,Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1))))),-1)),Times(CN1,C2,Plus(p,C1),Plus(Times(C2,p),C3),Power(Times(c,Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1))))),-1),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcCoth(Times(a,x))))),x))),And(And(And(And(And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(Times(Sqr(a),c),d))),Not(IntegerQ(Times(C1D2,n)))),RationalQ(p)),Less(p,CN1)),Unequal(p,QQ(-3L,2L))),NonzeroQ(Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1)))))),Or(IntegerQ(p),Not(IntegerQ(n)))))),
ISetDelayed(Int(Times(x_,Power(E,Times(n_,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Times(CN1,Plus(C1,Times(CN1,a,n,x)),Power(E,Times(n,ArcCoth(Times(a,x)))),Power(Times(Sqr(a),c,Plus(Sqr(n),Negate(C1)),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(Times(Sqr(a),c),d))),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(x_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(Plus(Times(C2,Plus(p,C1)),Times(a,n,x)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcCoth(Times(a,x)))),Power(Times(Sqr(a),c,Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1))))),-1)),Times(CN1,n,Plus(Times(C2,p),C3),Power(Times(a,c,Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1))))),-1),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcCoth(Times(a,x))))),x))),And(And(And(And(And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(Times(Sqr(a),c),d))),Not(IntegerQ(Times(C1D2,n)))),RationalQ(p)),LessEqual(p,CN1)),Unequal(p,QQ(-3L,2L))),NonzeroQ(Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1)))))),Or(IntegerQ(p),Not(IntegerQ(n)))))),
ISetDelayed(Int(Times(Sqr(x_),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(CN1,Plus(n,Times(C2,Plus(p,C1),a,x)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcCoth(Times(a,x)))),Power(Times(Power(a,3),c,Sqr(n),Plus(Sqr(n),Negate(C1))),-1)),And(And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(Times(Sqr(a),c),d))),Not(IntegerQ(Times(C1D2,n)))),ZeroQ(Plus(Sqr(n),Times(C2,Plus(p,C1))))),NonzeroQ(Plus(Sqr(n),Negate(C1)))))),
ISetDelayed(Int(Times(Sqr(x_),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(Plus(n,Times(C2,Plus(p,C1),a,x)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcCoth(Times(a,x)))),Power(Times(Power(a,3),c,Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1))))),-1)),Times(CN1,Plus(Sqr(n),Times(C2,Plus(p,C1))),Power(Times(Sqr(a),c,Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1))))),-1),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcCoth(Times(a,x))))),x))),And(And(And(And(And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(Times(Sqr(a),c),d))),Not(IntegerQ(Times(C1D2,n)))),RationalQ(p)),LessEqual(p,CN1)),NonzeroQ(Plus(Sqr(n),Times(C2,Plus(p,C1))))),NonzeroQ(Plus(Sqr(n),Times(CN1,C4,Sqr(Plus(p,C1)))))),Or(IntegerQ(p),Not(IntegerQ(n)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(CN1,Power(Negate(c),p),Power(Power(a,Plus(m,C1)),-1),Subst(Int(Times(Power(E,Times(n,x)),Power(Coth(x),Plus(m,Times(C2,Plus(p,C1)))),Power(Power(Cosh(x),Times(C2,Plus(p,C1))),-1)),x),x,ArcCoth(Times(a,x)))),And(And(And(And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(Times(Sqr(a),c),d))),Not(IntegerQ(Times(C1D2,n)))),IntegerQ(m)),RationalQ(p)),LessEqual(LessEqual(C3,m),Times(CN2,Plus(p,C1)))),IntegerQ(p)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(d,p),Int(Times(u,Power(x,Times(C2,p)),Power(Plus(C1,Negate(Power(Times(Sqr(a),Sqr(x)),-1))),p),Power(E,Times(n,ArcCoth(Times(a,x))))),x)),And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(Times(Sqr(a),c),d))),Not(IntegerQ(Times(C1D2,n)))),IntegerQ(p)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(Plus(c,Times(d,Sqr(x))),p),Power(Times(Power(x,Times(C2,p)),Power(Plus(C1,Negate(Power(Times(Sqr(a),Sqr(x)),-1))),p)),-1),Int(Times(u,Power(x,Times(C2,p)),Power(Plus(C1,Negate(Power(Times(Sqr(a),Sqr(x)),-1))),p),Power(E,Times(n,ArcCoth(Times(a,x))))),x)),And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(Times(Sqr(a),c),d))),Not(IntegerQ(Times(C1D2,n)))),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(c,p),Power(Power(a,Times(C2,p)),-1),Int(Times(u,Power(Power(x,Times(C2,p)),-1),Power(Plus(CN1,Times(a,x)),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,Times(a,x)),Plus(p,Times(C1D2,n)))),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(c,Times(Sqr(a),d)))),Not(IntegerQ(Times(C1D2,n)))),Or(IntegerQ(p),PositiveQ(c))),IntegersQ(Times(C2,p),Plus(p,Times(C1D2,n)))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Power(c,p),Subst(Int(Times(Power(Plus(C1,Times(CN1,x,Power(a,-1))),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,Times(x,Power(a,-1))),Plus(p,Times(C1D2,n))),Power(x,-2)),x),x,Power(x,-1))),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(c,Times(Sqr(a),d)))),Not(IntegerQ(Times(C1D2,n)))),Or(IntegerQ(p),PositiveQ(c))),Not(IntegersQ(Times(C2,p),Plus(p,Times(C1D2,n))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(CN1,Power(c,p),Subst(Int(Times(Power(Plus(C1,Times(CN1,x,Power(a,-1))),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,Times(x,Power(a,-1))),Plus(p,Times(C1D2,n))),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1))),And(And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(c,Times(Sqr(a),d)))),Not(IntegerQ(Times(C1D2,n)))),Or(IntegerQ(p),PositiveQ(c))),Not(IntegersQ(Times(C2,p),Plus(p,Times(C1D2,n))))),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(CN1,Power(c,p),Power(x,m),Power(Power(x,-1),m),Subst(Int(Times(Power(Plus(C1,Times(CN1,x,Power(a,-1))),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,Times(x,Power(a,-1))),Plus(p,Times(C1D2,n))),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1))),And(And(And(And(And(FreeQ(List(a,c,d,m,n,p),x),ZeroQ(Plus(c,Times(Sqr(a),d)))),Not(IntegerQ(Times(C1D2,n)))),Or(IntegerQ(p),PositiveQ(c))),Not(IntegersQ(Times(C2,p),Plus(p,Times(C1D2,n))))),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-2))),p_),Power(E,Times(n_DEFAULT,ArcCoth(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(Plus(c,Times(d,Power(x,-2))),p),Power(Power(Plus(C1,Negate(Power(Times(Sqr(a),Sqr(x)),-1))),p),-1),Int(Times(u,Power(Plus(C1,Negate(Power(Times(Sqr(a),Sqr(x)),-1))),p),Power(E,Times(n,ArcCoth(Times(a,x))))),x)),And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(c,Times(Sqr(a),d)))),Not(IntegerQ(Times(C1D2,n)))),Not(Or(IntegerQ(p),PositiveQ(c)))))),
ISetDelayed(Int(Power(E,Times(n_DEFAULT,ArcTanh(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Int(Times(Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),Power(Power(Plus(C1,Times(CN1,a,c),Times(CN1,b,c,x)),Times(C1D2,n)),-1)),x),FreeQ(List(a,b,c,n),x))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcTanh(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),Power(x_,m_)),x_Symbol),
    Condition(Times(C4,Power(Times(n,Power(b,Plus(m,C1)),Power(c,Plus(m,C1))),-1),Subst(Int(Times(Power(x,Times(C2,Power(n,-1))),Power(Plus(CN1,Times(CN1,a,c),Times(Plus(C1,Times(CN1,a,c)),Power(x,Times(C2,Power(n,-1))))),m),Power(Power(Plus(C1,Power(x,Times(C2,Power(n,-1)))),Plus(m,C2)),-1)),x),x,Times(Power(Plus(C1,Times(c,Plus(a,Times(b,x)))),Times(C1D2,n)),Power(Power(Plus(C1,Times(CN1,c,Plus(a,Times(b,x)))),Times(C1D2,n)),-1)))),And(And(And(FreeQ(List(a,b,c),x),NegativeIntegerQ(m)),RationalQ(n)),Less(Less(CN1,n),C1)))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcTanh(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),Power(Power(Plus(C1,Times(CN1,a,c),Times(CN1,b,c,x)),Times(C1D2,n)),-1)),x),FreeQ(List(a,b,c,d,e,m,n),x))),
ISetDelayed(Int(Times(u_DEFAULT,Power(E,Times(n_DEFAULT,ArcTanh(Plus(a_,Times(b_DEFAULT,x_))))),Power(Plus(c_,Times(d_DEFAULT,x_),Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(c,Power(Plus(C1,Negate(Sqr(a))),-1)),p),Int(Times(u,Power(Plus(C1,Negate(a),Times(CN1,b,x)),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,a,Times(b,x)),Plus(p,Times(C1D2,n)))),x)),And(And(And(FreeQ(List(a,b,c,d,e,n,p),x),ZeroQ(Plus(Times(b,d),Times(CN1,C2,a,e)))),ZeroQ(Plus(Times(Sqr(b),c),Times(e,Plus(C1,Negate(Sqr(a))))))),Or(IntegerQ(p),PositiveQ(Times(c,Power(Plus(C1,Negate(Sqr(a))),-1))))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(E,Times(n_DEFAULT,ArcTanh(Plus(a_,Times(b_DEFAULT,x_))))),Power(Plus(c_,Times(d_DEFAULT,x_),Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(c,Times(d,x),Times(e,Sqr(x))),p),Power(Power(Plus(C1,Negate(Sqr(a)),Times(CN1,C2,a,b,x),Times(CN1,Sqr(b),Sqr(x))),p),-1),Int(Times(u,Power(Plus(C1,Negate(Sqr(a)),Times(CN1,C2,a,b,x),Times(CN1,Sqr(b),Sqr(x))),p),Power(E,Times(n,ArcTanh(Times(a,x))))),x)),And(And(And(FreeQ(List(a,b,c,d,e,n,p),x),ZeroQ(Plus(Times(b,d),Times(CN1,C2,a,e)))),ZeroQ(Plus(Times(Sqr(b),c),Times(e,Plus(C1,Negate(Sqr(a))))))),Not(Or(IntegerQ(p),PositiveQ(Times(c,Power(Plus(C1,Negate(Sqr(a))),-1)))))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(E,Times(n_,ArcCoth(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_))))))),x_Symbol),
    Condition(Times(Power(CN1,Times(C1D2,n)),Int(Times(u,Power(E,Times(n,ArcTanh(Times(c,Plus(a,Times(b,x))))))),x)),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,n))))),
ISetDelayed(Int(Power(E,Times(n_DEFAULT,ArcCoth(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),x_Symbol),
    Condition(Times(Power(Times(c,Plus(a,Times(b,x))),Times(C1D2,n)),Power(Plus(C1,Power(Times(c,Plus(a,Times(b,x))),-1)),Times(C1D2,n)),Power(Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),-1),Int(Times(Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),Power(Power(Plus(CN1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),-1)),x)),And(FreeQ(List(a,b,c,n),x),Not(IntegerQ(Times(C1D2,n)))))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcCoth(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),Power(x_,m_)),x_Symbol),
    Condition(Times(CN4,Power(Times(n,Power(b,Plus(m,C1)),Power(c,Plus(m,C1))),-1),Subst(Int(Times(Power(x,Times(C2,Power(n,-1))),Power(Plus(C1,Times(a,c),Times(Plus(C1,Times(CN1,a,c)),Power(x,Times(C2,Power(n,-1))))),m),Power(Power(Plus(CN1,Power(x,Times(C2,Power(n,-1)))),Plus(m,C2)),-1)),x),x,Times(Power(Plus(C1,Power(Times(c,Plus(a,Times(b,x))),-1)),Times(C1D2,n)),Power(Power(Plus(C1,Negate(Power(Times(c,Plus(a,Times(b,x))),-1))),Times(C1D2,n)),-1)))),And(And(And(FreeQ(List(a,b,c),x),NegativeIntegerQ(m)),RationalQ(n)),Less(Less(CN1,n),C1)))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcCoth(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(c,Plus(a,Times(b,x))),Times(C1D2,n)),Power(Plus(C1,Power(Times(c,Plus(a,Times(b,x))),-1)),Times(C1D2,n)),Power(Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),-1),Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),Power(Power(Plus(CN1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),-1)),x)),And(FreeQ(List(a,b,c,d,e,m,n),x),Not(IntegerQ(Times(C1D2,n)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(E,Times(n_DEFAULT,ArcCoth(Plus(a_,Times(b_DEFAULT,x_))))),Power(Plus(c_,Times(d_DEFAULT,x_),Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(c,Power(Plus(C1,Negate(Sqr(a))),-1)),p),Power(Times(Plus(a,Times(b,x)),Power(Plus(C1,a,Times(b,x)),-1)),Times(C1D2,n)),Power(Times(Plus(C1,a,Times(b,x)),Power(Plus(a,Times(b,x)),-1)),Times(C1D2,n)),Power(Plus(C1,Negate(a),Times(CN1,b,x)),Times(C1D2,n)),Power(Power(Plus(CN1,a,Times(b,x)),Times(C1D2,n)),-1),Int(Times(u,Power(Plus(C1,Negate(a),Times(CN1,b,x)),Plus(p,Times(CN1,C1D2,n))),Power(Plus(C1,a,Times(b,x)),Plus(p,Times(C1D2,n)))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,n,p),x),Not(IntegerQ(Times(C1D2,n)))),ZeroQ(Plus(Times(b,d),Times(CN1,C2,a,e)))),ZeroQ(Plus(Times(Sqr(b),c),Times(e,Plus(C1,Negate(Sqr(a))))))),Or(IntegerQ(p),PositiveQ(Times(c,Power(Plus(C1,Negate(Sqr(a))),-1))))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(E,Times(n_DEFAULT,ArcCoth(Plus(a_,Times(b_DEFAULT,x_))))),Power(Plus(c_,Times(d_DEFAULT,x_),Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(c,Times(d,x),Times(e,Sqr(x))),p),Power(Power(Plus(C1,Negate(Sqr(a)),Times(CN1,C2,a,b,x),Times(CN1,Sqr(b),Sqr(x))),p),-1),Int(Times(u,Power(Plus(C1,Negate(Sqr(a)),Times(CN1,C2,a,b,x),Times(CN1,Sqr(b),Sqr(x))),p),Power(E,Times(n,ArcCoth(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,n,p),x),Not(IntegerQ(Times(C1D2,n)))),ZeroQ(Plus(Times(b,d),Times(CN1,C2,a,e)))),ZeroQ(Plus(Times(Sqr(b),c),Times(e,Plus(C1,Negate(Sqr(a))))))),Not(Or(IntegerQ(p),PositiveQ(Times(c,Power(Plus(C1,Negate(Sqr(a))),-1)))))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(E,Times(n_DEFAULT,ArcTanh(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),-1)))))),x_Symbol),
    Condition(Int(Times(u,Power(E,Times(n,ArcCoth(Plus(Times(a,Power(c,-1)),Times(b,x,Power(c,-1))))))),x),FreeQ(List(a,b,c,n),x))),
ISetDelayed(Int(Times(u_DEFAULT,Power(E,Times(n_DEFAULT,ArcCoth(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),-1)))))),x_Symbol),
    Condition(Int(Times(u,Power(E,Times(n,ArcTanh(Plus(Times(a,Power(c,-1)),Times(b,x,Power(c,-1))))))),x),FreeQ(List(a,b,c,n),x))),
ISetDelayed(Int(Times(ArcTanh(Times(a_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_))),n_)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Power(Plus(c,Times(d,Sqr(x))),n),x)))),Plus(Dist(ArcTanh(Times(a,x)),u,x),Times(CN1,a,Int(Dist(Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),-1),u,x),x)))),And(And(FreeQ(List(a,c,d),x),IntegerQ(Times(C2,n))),LessEqual(n,CN1)))),
ISetDelayed(Int(Times(ArcCoth(Times(a_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_))),n_)),x_Symbol),
    Condition(Module(List(Set(u,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(Power(Plus(c,Times(d,Sqr(x))),n),x)))),Plus(Dist(ArcCoth(Times(a,x)),u,x),Times(CN1,a,Int(Dist(Power(Plus(C1,Times(CN1,Sqr(a),Sqr(x))),-1),u,x),x)))),And(And(FreeQ(List(a,c,d),x),IntegerQ(Times(C2,n))),LessEqual(n,CN1)))),
ISetDelayed(Int(Times(u_,Power(v_,n_DEFAULT)),x_Symbol),
    Condition(Module(List(Set($s("tmp"),InverseFunctionOfLinear(u,x))),Condition(Times(Power(Times(CN1,Discriminant(v,x),Power(Times(C4,Coefficient(v,x,C2)),-1)),n),Power(Coefficient(Part($s("tmp"),C1),x,C1),-1),Subst(Int(SimplifyIntegrand(Times(SubstForInverseFunction(u,$s("tmp"),x),Power(Sech(x),Times(C2,Plus(n,C1)))),x),x),x,$s("tmp"))),And(And(NotFalseQ($s("tmp")),SameQ(Head($s("tmp")),$s("ArcTanh"))),ZeroQ(Plus(Times(Discriminant(v,x),Sqr(Part($s("tmp"),C1))),Negate(Sqr(D(v,x)))))))),And(And(And(And(QuadraticQ(v,x),IntegerQ(n)),Less(n,C0)),PosQ(Discriminant(v,x))),MatchQ(u,Condition(Times(r_DEFAULT,Power(f_,w_)),FreeQ(f,x)))))),
ISetDelayed(Int(Times(u_,Power(v_,n_DEFAULT)),x_Symbol),
    Condition(Module(List(Set($s("tmp"),InverseFunctionOfLinear(u,x))),Condition(Times(Power(Times(CN1,Discriminant(v,x),Power(Times(C4,Coefficient(v,x,C2)),-1)),n),Power(Coefficient(Part($s("tmp"),C1),x,C1),-1),Subst(Int(SimplifyIntegrand(Times(SubstForInverseFunction(u,$s("tmp"),x),Power(Negate(Sqr(Csch(x))),Plus(n,C1))),x),x),x,$s("tmp"))),And(And(NotFalseQ($s("tmp")),SameQ(Head($s("tmp")),$s("ArcCoth"))),ZeroQ(Plus(Times(Discriminant(v,x),Sqr(Part($s("tmp"),C1))),Negate(Sqr(D(v,x)))))))),And(And(And(And(QuadraticQ(v,x),IntegerQ(n)),Less(n,C0)),PosQ(Discriminant(v,x))),MatchQ(u,Condition(Times(r_DEFAULT,Power(f_,w_)),FreeQ(f,x)))))),
ISetDelayed(Int(ArcTanh(u_),x_Symbol),
    Condition(Plus(Times(x,ArcTanh(u)),Negate(Int(SimplifyIntegrand(Times(x,D(u,x),Power(Plus(C1,Negate(Sqr(u))),-1)),x),x))),InverseFunctionFreeQ(u,x))),
ISetDelayed(Int(ArcCoth(u_),x_Symbol),
    Condition(Plus(Times(x,ArcCoth(u)),Negate(Int(SimplifyIntegrand(Times(x,D(u,x),Power(Plus(C1,Negate(Sqr(u))),-1)),x),x))),InverseFunctionFreeQ(u,x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(u_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Plus(a,Times(b,ArcTanh(u))),Power(Times(d,Plus(m,C1)),-1)),Times(CN1,b,Power(Times(d,Plus(m,C1)),-1),Int(SimplifyIntegrand(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),D(u,x),Power(Plus(C1,Negate(Sqr(u))),-1)),x),x))),And(And(And(And(FreeQ(List(a,b,c,d,m),x),NonzeroQ(Plus(m,C1))),InverseFunctionFreeQ(u,x)),Not(FunctionOfQ(Power(Plus(c,Times(d,x)),Plus(m,C1)),u,x))),FalseQ(PowerVariableExpn(u,Plus(m,C1),x))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(u_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Plus(a,Times(b,ArcCoth(u))),Power(Times(d,Plus(m,C1)),-1)),Times(CN1,b,Power(Times(d,Plus(m,C1)),-1),Int(SimplifyIntegrand(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),D(u,x),Power(Plus(C1,Negate(Sqr(u))),-1)),x),x))),And(And(And(And(FreeQ(List(a,b,c,d,m),x),NonzeroQ(Plus(m,C1))),InverseFunctionFreeQ(u,x)),Not(FunctionOfQ(Power(Plus(c,Times(d,x)),Plus(m,C1)),u,x))),FalseQ(PowerVariableExpn(u,Plus(m,C1),x))))),
ISetDelayed(Int(Times(v_,Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(u_)))),x_Symbol),
    Condition(Module(List(Set(w,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(v,x)))),Condition(Plus(Dist(Plus(a,Times(b,ArcTanh(u))),w,x),Times(CN1,b,Int(SimplifyIntegrand(Times(w,D(u,x),Power(Plus(C1,Negate(Sqr(u))),-1)),x),x))),InverseFunctionFreeQ(w,x))),And(And(And(FreeQ(List(a,b),x),InverseFunctionFreeQ(u,x)),Not(MatchQ(v,Condition(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x)),m_DEFAULT),FreeQ(List(c,d,m),x))))),FalseQ(FunctionOfLinear(Times(v,Plus(a,Times(b,ArcTanh(u)))),x))))),
ISetDelayed(Int(Times(v_,Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(u_)))),x_Symbol),
    Condition(Module(List(Set(w,Block(List(Set($s("§showsteps"),False),Set($s("§stepcounter"),Null)),Int(v,x)))),Condition(Plus(Dist(Plus(a,Times(b,ArcCoth(u))),w,x),Times(CN1,b,Int(SimplifyIntegrand(Times(w,D(u,x),Power(Plus(C1,Negate(Sqr(u))),-1)),x),x))),InverseFunctionFreeQ(w,x))),And(And(And(FreeQ(List(a,b),x),InverseFunctionFreeQ(u,x)),Not(MatchQ(v,Condition(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x)),m_DEFAULT),FreeQ(List(c,d,m),x))))),FalseQ(FunctionOfLinear(Times(v,Plus(a,Times(b,ArcCoth(u)))),x)))))
  );
}
