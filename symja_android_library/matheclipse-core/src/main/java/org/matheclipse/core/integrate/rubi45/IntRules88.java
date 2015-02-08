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
public class IntRules88 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(c,Times(d,x)),m),Cos(Plus(a,Times(b,x))),Power(b,-1)),Times(d,m,Power(b,-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Cos(Plus(a,Times(b,x)))),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),m),Sin(Plus(a,Times(b,x))),Power(b,-1)),Times(CN1,d,m,Power(b,-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Sin(Plus(a,Times(b,x)))),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Times(SinIntegral(Plus(Times(b,c,Power(d,-1)),Times(b,x))),Power(d,-1)),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Times(CosIntegral(Plus(Times(b,c,Power(d,-1)),Times(b,x))),Power(d,-1)),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(Cos(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1))),Int(Times(Sin(Plus(Times(b,c,Power(d,-1)),Times(b,x))),Power(Plus(c,Times(d,x)),-1)),x)),Times(CN1,Sin(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1))),Int(Times(Cos(Plus(Times(b,c,Power(d,-1)),Times(b,x))),Power(Plus(c,Times(d,x)),-1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Times(Cos(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1))),Int(Times(Cos(Plus(Times(b,c,Power(d,-1)),Times(b,x))),Power(Plus(c,Times(d,x)),-1)),x)),Times(Sin(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1))),Int(Times(Sin(Plus(Times(b,c,Power(d,-1)),Times(b,x))),Power(Plus(c,Times(d,x)),-1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Times(C2,Power(d,-1),Subst(Int(Sin(Times(b,Sqr(x),Power(d,-1))),x),x,Sqrt(Plus(c,Times(d,x))))),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2)),x_Symbol),
    Condition(Times(C2,Power(d,-1),Subst(Int(Cos(Times(b,Sqr(x),Power(d,-1))),x),x,Sqrt(Plus(c,Times(d,x))))),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(Cos(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1))),Int(Times(Sin(Plus(Times(b,c,Power(d,-1)),Times(b,x))),Power(Plus(c,Times(d,x)),CN1D2)),x)),Times(CN1,Sin(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1))),Int(Times(Cos(Plus(Times(b,c,Power(d,-1)),Times(b,x))),Power(Plus(c,Times(d,x)),CN1D2)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),CN1D2)),x_Symbol),
    Condition(Plus(Times(Cos(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1))),Int(Times(Cos(Plus(Times(b,c,Power(d,-1)),Times(b,x))),Power(Plus(c,Times(d,x)),CN1D2)),x)),Times(Sin(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(d,-1))),Int(Times(Sin(Plus(Times(b,c,Power(d,-1)),Times(b,x))),Power(Plus(c,Times(d,x)),CN1D2)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x))),Power(Times(d,Plus(m,C1)),-1)),Times(CN1,b,Power(Times(d,Plus(m,C1)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x)))),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Cos(Plus(a,Times(b,x))),Power(Times(d,Plus(m,C1)),-1)),Times(b,Power(Times(d,Plus(m,C1)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Sin(Plus(a,Times(b,x)))),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Times(Power(Plus(c,Times(d,x)),m),Power(E,Plus(Times(CN1,a,CI),Times(CN1,b,CI,x)))),x)),Times(CN1,C1D2,CI,Int(Times(Power(Plus(c,Times(d,x)),m),Power(E,Plus(Times(a,CI),Times(b,CI,x)))),x))),FreeQ(List(a,b,c,d,m),x))),
ISetDelayed(Int(Times(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Power(Plus(c,Times(d,x)),m),Power(E,Plus(Times(CN1,a,CI),Times(CN1,b,CI,x)))),x)),Times(C1D2,Int(Times(Power(Plus(c,Times(d,x)),m),Power(E,Plus(Times(a,CI),Times(b,CI,x)))),x))),FreeQ(List(a,b,c,d,m),x))),
ISetDelayed(Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(d,Power(Sin(Plus(a,Times(b,x))),n),Power(Times(Sqr(b),Sqr(n)),-1)),Times(CN1,Plus(c,Times(d,x)),Cos(Plus(a,Times(b,x))),Power(Sin(Plus(a,Times(b,x))),Plus(n,Negate(C1))),Power(Times(b,n),-1)),Times(Plus(n,Negate(C1)),Power(n,-1),Int(Times(Plus(c,Times(d,x)),Power(Sin(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(n)),Greater(n,C1)))),
ISetDelayed(Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(d,Power(Cos(Plus(a,Times(b,x))),n),Power(Times(Sqr(b),Sqr(n)),-1)),Times(Plus(c,Times(d,x)),Sin(Plus(a,Times(b,x))),Power(Cos(Plus(a,Times(b,x))),Plus(n,Negate(C1))),Power(Times(b,n),-1)),Times(Plus(n,Negate(C1)),Power(n,-1),Int(Times(Plus(c,Times(d,x)),Power(Cos(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(n)),Greater(n,C1)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Sqr(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Sqr(Sin(Plus(a,Times(b,x)))),Power(Times(C4,Sqr(b)),-1)),Times(CN1,Power(Plus(c,Times(d,x)),m),Cos(Plus(a,Times(b,x))),Sin(Plus(a,Times(b,x))),Power(Times(C2,b),-1)),Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(C2,d,Plus(m,C1)),-1)),Times(CN1,Sqr(d),m,Plus(m,Negate(C1)),Power(Times(C4,Sqr(b)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Sqr(Sin(Plus(a,Times(b,x))))),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Sqr(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Sqr(Cos(Plus(a,Times(b,x)))),Power(Times(C4,Sqr(b)),-1)),Times(Power(Plus(c,Times(d,x)),m),Sin(Plus(a,Times(b,x))),Cos(Plus(a,Times(b,x))),Power(Times(C2,b),-1)),Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(C2,d,Plus(m,C1)),-1)),Times(CN1,Sqr(d),m,Plus(m,Negate(C1)),Power(Times(C4,Sqr(b)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Sqr(Cos(Plus(a,Times(b,x))))),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(m)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Sin(Plus(a,Times(b,x))),n),Power(Times(Sqr(b),Sqr(n)),-1)),Times(CN1,Power(Plus(c,Times(d,x)),m),Cos(Plus(a,Times(b,x))),Power(Sin(Plus(a,Times(b,x))),Plus(n,Negate(C1))),Power(Times(b,n),-1)),Times(Plus(n,Negate(C1)),Power(n,-1),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x)),Times(CN1,Sqr(d),m,Plus(m,Negate(C1)),Power(Times(Sqr(b),Sqr(n)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Power(Sin(Plus(a,Times(b,x))),n)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(m,n)),Greater(n,C1)),Greater(m,C1)),Unequal(n,C2)))),
ISetDelayed(Int(Times(Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Cos(Plus(a,Times(b,x))),n),Power(Times(Sqr(b),Sqr(n)),-1)),Times(Power(Plus(c,Times(d,x)),m),Sin(Plus(a,Times(b,x))),Power(Cos(Plus(a,Times(b,x))),Plus(n,Negate(C1))),Power(Times(b,n),-1)),Times(Plus(n,Negate(C1)),Power(n,-1),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Cos(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x)),Times(CN1,Sqr(d),m,Plus(m,Negate(C1)),Power(Times(Sqr(b),Sqr(n)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Power(Cos(Plus(a,Times(b,x))),n)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(m,n)),Greater(n,C1)),Greater(m,C1)),Unequal(n,C2)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(a,Times(b,x))),n),x),x),And(And(And(FreeQ(List(a,b,c,d,m),x),IntegerQ(n)),Greater(n,C1)),Or(Not(RationalQ(m)),And(LessEqual(CN1,m),Less(m,C1)))))),
ISetDelayed(Int(Times(Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),m),Power(Cos(Plus(a,Times(b,x))),n),x),x),And(And(And(FreeQ(List(a,b,c,d,m),x),IntegerQ(n)),Greater(n,C1)),Or(Not(RationalQ(m)),And(LessEqual(CN1,m),Less(m,C1)))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Sin(Plus(a,Times(b,x))),n),Power(Times(d,Plus(m,C1)),-1)),Times(CN1,b,n,Power(Times(d,Plus(m,C1)),-1),Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),Plus(m,C1)),Times(Cos(Plus(a,Times(b,x))),Power(Sin(Plus(a,Times(b,x))),Plus(n,Negate(C1)))),x),x))),And(And(And(And(FreeQ(List(a,b,c,d,m),x),IntegerQ(n)),Greater(n,C1)),RationalQ(m)),And(LessEqual(CN2,m),Less(m,CN1))))),
ISetDelayed(Int(Times(Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Cos(Plus(a,Times(b,x))),n),Power(Times(d,Plus(m,C1)),-1)),Times(b,n,Power(Times(d,Plus(m,C1)),-1),Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),Plus(m,C1)),Times(Sin(Plus(a,Times(b,x))),Power(Cos(Plus(a,Times(b,x))),Plus(n,Negate(C1)))),x),x))),And(And(And(And(FreeQ(List(a,b,c,d,m),x),IntegerQ(n)),Greater(n,C1)),RationalQ(m)),And(LessEqual(CN2,m),Less(m,CN1))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Sin(Plus(a,Times(b,x))),n),Power(Times(d,Plus(m,C1)),-1)),Times(CN1,b,n,Power(Plus(c,Times(d,x)),Plus(m,C2)),Cos(Plus(a,Times(b,x))),Power(Sin(Plus(a,Times(b,x))),Plus(n,Negate(C1))),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),-1)),Times(CN1,Sqr(b),Sqr(n),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C2)),Power(Sin(Plus(a,Times(b,x))),n)),x)),Times(Sqr(b),n,Plus(n,Negate(C1)),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C2)),Power(Sin(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x))),And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(m,n)),Greater(n,C1)),Less(m,CN2)))),
ISetDelayed(Int(Times(Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Cos(Plus(a,Times(b,x))),n),Power(Times(d,Plus(m,C1)),-1)),Times(b,n,Power(Plus(c,Times(d,x)),Plus(m,C2)),Sin(Plus(a,Times(b,x))),Power(Cos(Plus(a,Times(b,x))),Plus(n,Negate(C1))),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),-1)),Times(CN1,Sqr(b),Sqr(n),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C2)),Power(Cos(Plus(a,Times(b,x))),n)),x)),Times(Sqr(b),n,Plus(n,Negate(C1)),Power(Times(Sqr(d),Plus(m,C1),Plus(m,C2)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,C2)),Power(Cos(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x))),And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(m,n)),Greater(n,C1)),Less(m,CN2)))),
ISetDelayed(Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(Plus(c,Times(d,x)),Cos(Plus(a,Times(b,x))),Power(Sin(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),Times(CN1,d,Power(Sin(Plus(a,Times(b,x))),Plus(n,C2)),Power(Times(Sqr(b),Plus(n,C1),Plus(n,C2)),-1)),Times(Plus(n,C2),Power(Plus(n,C1),-1),Int(Times(Plus(c,Times(d,x)),Power(Sin(Plus(a,Times(b,x))),Plus(n,C2))),x))),And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(n)),Less(n,CN1)),Unequal(n,CN2)))),
ISetDelayed(Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(c,Times(d,x)),Sin(Plus(a,Times(b,x))),Power(Cos(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),Times(CN1,d,Power(Cos(Plus(a,Times(b,x))),Plus(n,C2)),Power(Times(Sqr(b),Plus(n,C1),Plus(n,C2)),-1)),Times(Plus(n,C2),Power(Plus(n,C1),-1),Int(Times(Plus(c,Times(d,x)),Power(Cos(Plus(a,Times(b,x))),Plus(n,C2))),x))),And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(n)),Less(n,CN1)),Unequal(n,CN2)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),m),Cos(Plus(a,Times(b,x))),Power(Sin(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),Times(CN1,d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Sin(Plus(a,Times(b,x))),Plus(n,C2)),Power(Times(Sqr(b),Plus(n,C1),Plus(n,C2)),-1)),Times(Plus(n,C2),Power(Plus(n,C1),-1),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(a,Times(b,x))),Plus(n,C2))),x)),Times(Sqr(d),m,Plus(m,Negate(C1)),Power(Times(Sqr(b),Plus(n,C1),Plus(n,C2)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Power(Sin(Plus(a,Times(b,x))),Plus(n,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(m,n)),Less(n,CN1)),Unequal(n,CN2)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(c,Times(d,x)),m),Sin(Plus(a,Times(b,x))),Power(Cos(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),Times(CN1,d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Cos(Plus(a,Times(b,x))),Plus(n,C2)),Power(Times(Sqr(b),Plus(n,C1),Plus(n,C2)),-1)),Times(Plus(n,C2),Power(Plus(n,C1),-1),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Cos(Plus(a,Times(b,x))),Plus(n,C2))),x)),Times(Sqr(d),m,Plus(m,Negate(C1)),Power(Times(Sqr(b),Plus(n,C1),Plus(n,C2)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Power(Cos(Plus(a,Times(b,x))),Plus(n,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(m,n)),Less(n,CN1)),Unequal(n,CN2)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN1,CI,Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(d,Plus(m,C1)),-1)),Times(C2,CI,Int(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(C1,Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x)))),-1)),x))),And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CI,Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(Times(d,Plus(m,C1)),-1)),Times(CN1,C2,CI,Int(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(C1,Negate(Power(E,Plus(Times(C2,CI,a),Times(C2,CI,b,x))))),-1)),x))),And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),m),Power(Tan(Plus(a,Times(b,x))),Plus(n,Negate(C1))),Power(Times(b,Plus(n,Negate(C1))),-1)),Times(CN1,d,m,Power(Times(b,Plus(n,Negate(C1))),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Tan(Plus(a,Times(b,x))),Plus(n,Negate(C1)))),x)),Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Tan(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x))),And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(m,n)),Greater(n,C1)),Greater(m,C0)))),
ISetDelayed(Int(Times(Power(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(c,Times(d,x)),m),Power(Cot(Plus(a,Times(b,x))),Plus(n,Negate(C1))),Power(Times(b,Plus(n,Negate(C1))),-1)),Times(d,m,Power(Times(b,Plus(n,Negate(C1))),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Cot(Plus(a,Times(b,x))),Plus(n,Negate(C1)))),x)),Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Cot(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x))),And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(m,n)),Greater(n,C1)),Greater(m,C0)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(CN2,CI,Power(Plus(c,Times(d,x)),m),ArcTan(Power(E,Plus(Times(CI,a),Times(CI,b,x)))),Power(b,-1)),Times(CN1,d,m,Power(b,-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Log(Plus(C1,Times(CN1,CI,Power(E,Times(CI,Plus(a,Times(b,x)))))))),x)),Times(d,m,Power(b,-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Log(Plus(C1,Times(CI,Power(E,Times(CI,Plus(a,Times(b,x)))))))),x))),And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN2,Power(Plus(c,Times(d,x)),m),ArcTanh(Power(E,Plus(Times(CI,a),Times(CI,b,x)))),Power(b,-1)),Times(CN1,d,m,Power(b,-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Log(Plus(C1,Negate(Power(E,Times(CI,Plus(a,Times(b,x)))))))),x)),Times(d,m,Power(b,-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Log(Plus(C1,Power(E,Times(CI,Plus(a,Times(b,x))))))),x))),And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),m),Tan(Plus(a,Times(b,x))),Power(b,-1)),Times(CN1,d,m,Power(b,-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Tan(Plus(a,Times(b,x)))),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(Sqr(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(c,Times(d,x)),m),Cot(Plus(a,Times(b,x))),Power(b,-1)),Times(d,m,Power(b,-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Cot(Plus(a,Times(b,x)))),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(Plus(c,Times(d,x)),Tan(Plus(a,Times(b,x))),Power(Sec(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Times(b,Plus(n,Negate(C1))),-1)),Times(CN1,d,Power(Sec(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Times(Sqr(b),Plus(n,Negate(C1)),Plus(n,Negate(C2))),-1)),Times(Plus(n,Negate(C2)),Power(Plus(n,Negate(C1)),-1),Int(Times(Plus(c,Times(d,x)),Power(Sec(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x))),And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(n)),Greater(n,C1)),Unequal(n,C2)))),
ISetDelayed(Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(c,Times(d,x)),Cot(Plus(a,Times(b,x))),Power(Csc(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Times(b,Plus(n,Negate(C1))),-1)),Times(CN1,d,Power(Csc(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Times(Sqr(b),Plus(n,Negate(C1)),Plus(n,Negate(C2))),-1)),Times(Plus(n,Negate(C2)),Power(Plus(n,Negate(C1)),-1),Int(Times(Plus(c,Times(d,x)),Power(Csc(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x))),And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(n)),Greater(n,C1)),Unequal(n,C2)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),m),Tan(Plus(a,Times(b,x))),Power(Sec(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Times(b,Plus(n,Negate(C1))),-1)),Times(CN1,d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Sec(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Times(Sqr(b),Plus(n,Negate(C1)),Plus(n,Negate(C2))),-1)),Times(Plus(n,Negate(C2)),Power(Plus(n,Negate(C1)),-1),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sec(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x)),Times(Sqr(d),m,Plus(m,Negate(C1)),Power(Times(Sqr(b),Plus(n,Negate(C1)),Plus(n,Negate(C2))),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Power(Sec(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(m,n)),Greater(n,C1)),Unequal(n,C2)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(c,Times(d,x)),m),Cot(Plus(a,Times(b,x))),Power(Csc(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Times(b,Plus(n,Negate(C1))),-1)),Times(CN1,d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Csc(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Times(Sqr(b),Plus(n,Negate(C1)),Plus(n,Negate(C2))),-1)),Times(Plus(n,Negate(C2)),Power(Plus(n,Negate(C1)),-1),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Csc(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x)),Times(Sqr(d),m,Plus(m,Negate(C1)),Power(Times(Sqr(b),Plus(n,Negate(C1)),Plus(n,Negate(C2))),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Power(Csc(Plus(a,Times(b,x))),Plus(n,Negate(C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(m,n)),Greater(n,C1)),Unequal(n,C2)),Greater(m,C1)))),
ISetDelayed(Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(d,Power(Sec(Plus(a,Times(b,x))),n),Power(Times(Sqr(b),Sqr(n)),-1)),Times(CN1,Plus(c,Times(d,x)),Sin(Plus(a,Times(b,x))),Power(Sec(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,n),-1)),Times(Plus(n,C1),Power(n,-1),Int(Times(Plus(c,Times(d,x)),Power(Sec(Plus(a,Times(b,x))),Plus(n,C2))),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(n)),Less(n,CN1)))),
ISetDelayed(Int(Times(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),Power(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(d,Power(Csc(Plus(a,Times(b,x))),n),Power(Times(Sqr(b),Sqr(n)),-1)),Times(Plus(c,Times(d,x)),Cos(Plus(a,Times(b,x))),Power(Csc(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,n),-1)),Times(Plus(n,C1),Power(n,-1),Int(Times(Plus(c,Times(d,x)),Power(Csc(Plus(a,Times(b,x))),Plus(n,C2))),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(n)),Less(n,CN1)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_),Power(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Plus(Times(d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Sec(Plus(a,Times(b,x))),n),Power(Times(Sqr(b),Sqr(n)),-1)),Times(CN1,Power(Plus(c,Times(d,x)),m),Sin(Plus(a,Times(b,x))),Power(Sec(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,n),-1)),Times(Plus(n,C1),Power(n,-1),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sec(Plus(a,Times(b,x))),Plus(n,C2))),x)),Times(CN1,Sqr(d),m,Plus(m,Negate(C1)),Power(Times(Sqr(b),Sqr(n)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Power(Sec(Plus(a,Times(b,x))),n)),x))),And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(m,n)),Less(n,CN1)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Times(d,m,Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Csc(Plus(a,Times(b,x))),n),Power(Times(Sqr(b),Sqr(n)),-1)),Times(Power(Plus(c,Times(d,x)),m),Cos(Plus(a,Times(b,x))),Power(Csc(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,n),-1)),Times(Plus(n,C1),Power(n,-1),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Csc(Plus(a,Times(b,x))),Plus(n,C2))),x)),Times(CN1,Sqr(d),m,Plus(m,Negate(C1)),Power(Times(Sqr(b),Sqr(n)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C2))),Power(Csc(Plus(a,Times(b,x))),n)),x))),And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(m,n)),Less(n,CN1)),Greater(m,C1)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_)),x_Symbol),
    Condition(Times(Power(Cos(Plus(a,Times(b,x))),n),Power(Sec(Plus(a,Times(b,x))),n),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Power(Cos(Plus(a,Times(b,x))),n),-1)),x)),And(FreeQ(List(a,b,c,d,m,n),x),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Power(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Sin(Plus(a,Times(b,x))),n),Power(Csc(Plus(a,Times(b,x))),n),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Power(Sin(Plus(a,Times(b,x))),n),-1)),x)),And(FreeQ(List(a,b,c,d,m,n),x),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Power(u_,m_DEFAULT),Power($($p("F"),v_),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(F(ExpandToSum(v,x)),n)),x),And(And(And(FreeQ(List(m,n),x),TrigQ($s("F"))),LinearQ(List(u,v),x)),Not(LinearMatchQ(List(u,v),x))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),Times(CN1,d,m,Power(Times(b,Plus(n,C1)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Sin(Plus(a,Times(b,x))),Plus(n,C1))),x))),And(And(FreeQ(List(a,b,c,d,n),x),PositiveIntegerQ(m)),NonzeroQ(Plus(n,C1))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(c,Times(d,x)),m),Power(Cos(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),Times(d,m,Power(Times(b,Plus(n,C1)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Cos(Plus(a,Times(b,x))),Plus(n,C1))),x))),And(And(FreeQ(List(a,b,c,d,n),x),PositiveIntegerQ(m)),NonzeroQ(Plus(n,C1))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),m),Times(Power(Sin(Plus(a,Times(b,x))),n),Power(Cos(Plus(a,Times(b,x))),p)),x),x),And(FreeQ(List(a,b,c,d,m),x),PositiveIntegerQ(n,p)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sin(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(a,Times(b,x))),n),Power(Tan(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sin(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Tan(Plus(a,Times(b,x))),p)),x)),And(FreeQ(List(a,b,c,d,m),x),PositiveIntegerQ(n,p)))),
ISetDelayed(Int(Times(Power(Cos(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Cos(Plus(a,Times(b,x))),n),Power(Cot(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Cos(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Cot(Plus(a,Times(b,x))),p)),x)),And(FreeQ(List(a,b,c,d,m),x),PositiveIntegerQ(n,p)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),m),Power(Sec(Plus(a,Times(b,x))),n),Power(Times(b,n),-1)),Times(CN1,d,m,Power(Times(b,n),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Sec(Plus(a,Times(b,x))),n)),x))),And(And(And(FreeQ(List(a,b,c,d,n),x),SameQ(p,C1)),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(Power(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(c,Times(d,x)),m),Power(Csc(Plus(a,Times(b,x))),n),Power(Times(b,n),-1)),Times(d,m,Power(Times(b,n),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Csc(Plus(a,Times(b,x))),n)),x))),And(And(And(FreeQ(List(a,b,c,d,n),x),SameQ(p,C1)),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sqr(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(c,Times(d,x)),m),Power(Tan(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),Times(CN1,d,m,Power(Times(b,Plus(n,C1)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Tan(Plus(a,Times(b,x))),Plus(n,C1))),x))),And(And(FreeQ(List(a,b,c,d,n),x),PositiveIntegerQ(m)),NonzeroQ(Plus(n,C1))))),
ISetDelayed(Int(Times(Sqr(Csc(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Cot(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(c,Times(d,x)),m),Power(Cot(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),Times(d,m,Power(Times(b,Plus(n,C1)),-1),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Cot(Plus(a,Times(b,x))),Plus(n,C1))),x))),And(And(FreeQ(List(a,b,c,d,n),x),PositiveIntegerQ(m)),NonzeroQ(Plus(n,C1))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Sec(Plus(a,Times(b,x))),Power(Tan(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sec(Plus(a,Times(b,x))),3),Power(Tan(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),And(FreeQ(List(a,b,c,d,m),x),PositiveIntegerQ(Times(C1D2,p))))),
ISetDelayed(Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sec(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Tan(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sec(Plus(a,Times(b,x))),n),Power(Tan(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sec(Plus(a,Times(b,x))),Plus(n,C2)),Power(Tan(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x)),And(FreeQ(List(a,b,c,d,m,n),x),PositiveIntegerQ(Times(C1D2,p)))))
  );
}
