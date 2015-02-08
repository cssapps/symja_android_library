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
public class IntRules28 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(p,q))),Plus($s("A"),Times($s("B"),Power(x,Plus(n,Negate(q))))),Power(Plus(a,Times(b,Power(x,Plus(n,Negate(q)))),Times(c,Power(x,Times(C2,Plus(n,Negate(q)))))),p)),x),And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),m,n,q),x),ZeroQ(Plus(r,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q)))))),IntegerQ(p)),PosQ(Plus(n,Negate(q)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(Times($s("A"),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times($s("B"),Plus(m,Times(p,q),C1),Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p),Power(Times(Plus(m,Times(p,q),C1),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1)),Times(Plus(n,Negate(q)),p,Power(Times(Plus(m,Times(p,q),C1),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1),Int(Times(Power(x,Plus(n,m)),Simp(Plus(Times(C2,a,$s("B"),Plus(m,Times(p,q),C1)),Times(CN1,$s("A"),b,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times(Plus(Times(b,$s("B"),Plus(m,Times(p,q),C1)),Times(CN1,C2,$s("A"),c,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1))),Power(x,Plus(n,Negate(q))))),x),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,Negate(C1)))),x))),And(And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B")),x),ZeroQ(Plus(r,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q)))))),Not(IntegerQ(p))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),PositiveIntegerQ(n)),RationalQ(m,p,q)),Greater(p,C0)),LessEqual(Plus(m,Times(p,q)),Negate(Plus(n,Negate(q))))),Unequal(Plus(m,Times(p,q),C1),C0)),Unequal(Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1),C0)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(n,Plus(q,r))),Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(Times($s("A"),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times($s("B"),Plus(m,Times(p,q),C1),Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p),Power(Times(Plus(m,Times(p,q),C1),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1)),Times(C2,Plus(n,Negate(q)),p,Power(Times(Plus(m,Times(p,q),C1),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1),Int(Times(Power(x,Plus(n,m)),Simp(Plus(Times(a,$s("B"),Plus(m,Times(p,q),C1)),Times(CN1,$s("A"),c,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1),Power(x,Plus(n,Negate(q))))),x),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,Negate(C1)))),x))),And(And(And(And(ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q))))),PositiveIntegerQ(n)),LessEqual(Plus(m,Times(p,q)),Negate(Plus(n,Negate(q))))),Unequal(Plus(m,Times(p,q),C1),C0)),Unequal(Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1),C0)))),And(And(And(FreeQ(List(a,c,$s("A"),$s("B")),x),Not(IntegerQ(p))),RationalQ(m,p,q)),Greater(p,C0)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Negate(n),C1)),Plus(Times($s("A"),b),Times(CN1,C2,a,$s("B")),Times(CN1,Plus(Times(b,$s("B")),Times(CN1,C2,$s("A"),c)),Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1)),Power(Times(Plus(n,Negate(q)),Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Times(Power(Times(Plus(n,Negate(q)),Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(x,Plus(m,Negate(n))),Simp(Plus(Times(Plus(m,Times(p,q),Negate(n),q,C1),Plus(Times(C2,a,$s("B")),Times(CN1,$s("A"),b))),Times(Plus(m,Times(p,q),Times(C2,Plus(n,Negate(q)),Plus(p,C1)),C1),Plus(Times(b,$s("B")),Times(CN1,C2,$s("A"),c)),Power(x,Plus(n,Negate(q))))),x),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B")),x),ZeroQ(Plus(r,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q)))))),Not(IntegerQ(p))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),PositiveIntegerQ(n)),RationalQ(m,p,q)),Less(p,CN1)),Greater(Plus(m,Times(p,q)),Plus(n,Negate(q),Negate(C1)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(n,Plus(q,r))),Condition(Plus(Times(Power(x,Plus(m,Negate(n),C1)),Plus(Times(a,$s("B")),Times(CN1,$s("A"),c,Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1)),Power(Times(C2,a,c,Plus(n,Negate(q)),Plus(p,C1)),-1)),Times(CN1,Power(Times(C2,a,c,Plus(n,Negate(q)),Plus(p,C1)),-1),Int(Times(Power(x,Plus(m,Negate(n))),Simp(Plus(Times(a,$s("B"),Plus(m,Times(p,q),Negate(n),q,C1)),Times(CN1,$s("A"),c,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),C2,Plus(p,C1)),C1),Power(x,Plus(n,Negate(q))))),x),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1))),x))),And(And(ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q))))),PositiveIntegerQ(n)),Greater(Plus(m,Times(p,q)),Plus(n,Negate(q),Negate(C1)))))),And(And(And(FreeQ(List(a,c,$s("A"),$s("B")),x),Not(IntegerQ(p))),RationalQ(m,p,q)),Less(p,CN1)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(Times(b,$s("B"),Plus(n,Negate(q)),p),Times($s("A"),c,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times($s("B"),c,Plus(m,Times(p,q),Times(C2,Plus(n,Negate(q)),p),C1),Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p),Power(Times(c,Plus(m,Times(p,Plus(Times(C2,n),Negate(q))),C1),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1)),Times(Plus(n,Negate(q)),p,Power(Times(c,Plus(m,Times(p,Plus(Times(C2,n),Negate(q))),C1),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1),Int(Times(Power(x,Plus(m,q)),Simp(Plus(Times(C2,a,$s("A"),c,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times(CN1,a,b,$s("B"),Plus(m,Times(p,q),C1)),Times(Plus(Times(C2,a,$s("B"),c,Plus(m,Times(p,q),Times(C2,Plus(n,Negate(q)),p),C1)),Times($s("A"),b,c,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times(CN1,Sqr(b),$s("B"),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),p),C1))),Power(x,Plus(n,Negate(q))))),x),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,Negate(C1)))),x))),And(And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B")),x),ZeroQ(Plus(r,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q)))))),Not(IntegerQ(p))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),PositiveIntegerQ(n)),RationalQ(m,p,q)),Greater(p,C0)),Greater(Plus(m,Times(p,q)),Plus(Negate(Plus(n,Negate(q))),Negate(C1)))),Unequal(Plus(m,Times(p,Plus(Times(C2,n),Negate(q))),C1),C0)),Unequal(Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1),C0)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(n,Plus(q,r))),Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(Times($s("A"),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times($s("B"),Plus(m,Times(p,q),Times(C2,Plus(n,Negate(q)),p),C1),Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p),Power(Times(Plus(m,Times(p,Plus(Times(C2,n),Negate(q))),C1),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1)),Times(Plus(n,Negate(q)),p,Power(Times(Plus(m,Times(p,Plus(Times(C2,n),Negate(q))),C1),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1),Int(Times(Power(x,Plus(m,q)),Simp(Plus(Times(C2,a,$s("A"),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),Times(C2,a,$s("B"),Plus(m,Times(p,q),Times(C2,Plus(n,Negate(q)),p),C1),Power(x,Plus(n,Negate(q))))),x),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,Negate(C1)))),x))),And(And(And(And(And(ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q))))),PositiveIntegerQ(n)),Greater(Plus(m,Times(p,q)),Negate(Plus(n,Negate(q))))),Unequal(Plus(m,Times(p,q),Times(C2,Plus(n,Negate(q)),p),C1),C0)),Unequal(Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1),C0)),Unequal(Plus(m,C1),n)))),And(And(And(FreeQ(List(a,c,$s("A"),$s("B")),x),Not(IntegerQ(p))),RationalQ(m,p,q)),Greater(p,C0)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,Plus(m,Negate(q),C1)),Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(CN1,C2,a,$s("A"),c),Times(Plus(Times($s("A"),b),Times(CN1,C2,a,$s("B"))),c,Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1)),Power(Times(a,Plus(n,Negate(q)),Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Times(Power(Times(a,Plus(n,Negate(q)),Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(x,Plus(m,Negate(q))),Simp(Plus(Times($s("A"),Sqr(b),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(p,C1)),C1)),Times(CN1,a,b,$s("B"),Plus(m,Times(p,q),C1)),Times(CN1,C2,a,$s("A"),c,Plus(m,Times(p,q),Times(C2,Plus(n,Negate(q)),Plus(p,C1)),C1)),Times(Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C3)),C1),Plus(Times($s("A"),b),Times(CN1,C2,a,$s("B"))),c,Power(x,Plus(n,Negate(q))))),x),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B")),x),ZeroQ(Plus(r,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q)))))),Not(IntegerQ(p))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),PositiveIntegerQ(n)),RationalQ(m,p,q)),Less(p,CN1)),Less(Plus(m,Times(p,q)),Plus(n,Negate(q),Negate(C1)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(n,Plus(q,r))),Condition(Plus(Times(CN1,Power(x,Plus(m,Negate(q),C1)),Plus(Times($s("A"),c),Times($s("B"),c,Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1)),Power(Times(C2,a,c,Plus(n,Negate(q)),Plus(p,C1)),-1)),Times(Power(Times(C2,a,c,Plus(n,Negate(q)),Plus(p,C1)),-1),Int(Times(Power(x,Plus(m,Negate(q))),Simp(Plus(Times($s("A"),c,Plus(m,Times(p,q),Times(C2,Plus(n,Negate(q)),Plus(p,C1)),C1)),Times($s("B"),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C3)),C1),c,Power(x,Plus(n,Negate(q))))),x),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1))),x))),And(And(ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q))))),PositiveIntegerQ(n)),Less(Plus(m,Times(p,q)),Plus(n,Negate(q),Negate(C1)))))),And(And(And(FreeQ(List(a,c,$s("A"),$s("B")),x),Not(IntegerQ(p))),RationalQ(m,p,q)),Less(p,CN1)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("B"),Power(x,Plus(m,Negate(n),C1)),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1)),Power(Times(c,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1)),Times(CN1,Power(Times(c,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1),Int(Times(Power(x,Plus(m,Negate(n),q)),Simp(Plus(Times(a,$s("B"),Plus(m,Times(p,q),Negate(n),q,C1)),Times(Plus(Times(b,$s("B"),Plus(m,Times(p,q),Times(Plus(n,Negate(q)),p),C1)),Times(CN1,$s("A"),c,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1))),Power(x,Plus(n,Negate(q))))),x),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p)),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B")),x),ZeroQ(Plus(r,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q)))))),Not(IntegerQ(p))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),PositiveIntegerQ(n)),RationalQ(m,p,q)),And(LessEqual(CN1,p),Less(p,C0))),GreaterEqual(Plus(m,Times(p,q)),Plus(n,Negate(q),Negate(C1)))),Unequal(Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1),C0)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(n,Plus(q,r))),Condition(Plus(Times($s("B"),Power(x,Plus(m,Negate(n),C1)),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1)),Power(Times(c,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1)),Times(CN1,Power(Times(c,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1)),-1),Int(Times(Power(x,Plus(m,Negate(n),q)),Simp(Plus(Times(a,$s("B"),Plus(m,Times(p,q),Negate(n),q,C1)),Times(CN1,$s("A"),c,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1),Power(x,Plus(n,Negate(q))))),x),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p)),x))),And(And(And(ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q))))),PositiveIntegerQ(n)),GreaterEqual(Plus(m,Times(p,q)),Plus(n,Negate(q),Negate(C1)))),Unequal(Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1),C0)))),And(And(And(FreeQ(List(a,c,$s("A"),$s("B")),x),Not(IntegerQ(p))),RationalQ(m,p,q)),And(LessEqual(CN1,p),Less(p,C0))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("A"),Power(x,Plus(m,Negate(q),C1)),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1)),Power(Times(a,Plus(m,Times(p,q),C1)),-1)),Times(Power(Times(a,Plus(m,Times(p,q),C1)),-1),Int(Times(Power(x,Plus(m,n,Negate(q))),Simp(Plus(Times(a,$s("B"),Plus(m,Times(p,q),C1)),Times(CN1,$s("A"),b,Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(p,C1)),C1)),Times(CN1,$s("A"),c,Plus(m,Times(p,q),Times(C2,Plus(n,Negate(q)),Plus(p,C1)),C1),Power(x,Plus(n,Negate(q))))),x),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p)),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B")),x),ZeroQ(Plus(r,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q)))))),Not(IntegerQ(p))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),PositiveIntegerQ(n)),RationalQ(m,p,q)),Or(And(LessEqual(CN1,p),Less(p,C0)),Equal(Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1),C0))),LessEqual(Plus(m,Times(p,q)),Negate(Plus(n,Negate(q))))),Unequal(Plus(m,Times(p,q),C1),C0)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(n,Plus(q,r))),Condition(Plus(Times($s("A"),Power(x,Plus(m,Negate(q),C1)),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),Plus(p,C1)),Power(Times(a,Plus(m,Times(p,q),C1)),-1)),Times(Power(Times(a,Plus(m,Times(p,q),C1)),-1),Int(Times(Power(x,Plus(m,n,Negate(q))),Simp(Plus(Times(a,$s("B"),Plus(m,Times(p,q),C1)),Times(CN1,$s("A"),c,Plus(m,Times(p,q),Times(C2,Plus(n,Negate(q)),Plus(p,C1)),C1),Power(x,Plus(n,Negate(q))))),x),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p)),x))),And(And(And(And(ZeroQ(Plus(j,Negate(Plus(Times(C2,n),Negate(q))))),PositiveIntegerQ(n)),Or(And(LessEqual(CN1,p),Less(p,C0)),Equal(Plus(m,Times(p,q),Times(Plus(n,Negate(q)),Plus(Times(C2,p),C1)),C1),C0))),LessEqual(Plus(m,Times(p,q)),Negate(Plus(n,Negate(q))))),Unequal(Plus(m,Times(p,q),C1),C0)))),And(And(FreeQ(List(a,c,$s("A"),$s("B")),x),Not(IntegerQ(p))),RationalQ(m,p,q)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,j_DEFAULT))),Power(x_,m_DEFAULT),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,r_DEFAULT))),CN1D2)),x_Symbol),
    Condition(Times(Power(x,Times(C1D2,q)),Sqrt(Plus(a,Times(b,Power(x,Plus(n,Negate(q)))),Times(c,Power(x,Times(C2,Plus(n,Negate(q))))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),CN1D2),Int(Times(Power(x,Plus(m,Times(CN1,C1D2,q))),Plus($s("A"),Times($s("B"),Power(x,Plus(n,Negate(q))))),Power(Plus(a,Times(b,Power(x,Plus(n,Negate(q)))),Times(c,Power(x,Times(C2,Plus(n,Negate(q)))))),CN1D2)),x)),And(And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),m,n,q),x),ZeroQ(Plus(j,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(r,Negate(Plus(Times(C2,n),Negate(q)))))),PosQ(Plus(n,Negate(q)))),Or(ZeroQ(Plus(m,Negate(C1D2))),ZeroQ(Plus(m,C1D2)))),ZeroQ(Plus(n,Negate(C3)))),ZeroQ(Plus(q,Negate(C1)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,q_))),Power(x_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,k_DEFAULT)),Times(c_DEFAULT,Power(x_,n_DEFAULT))),p_)),x_Symbol),
    Condition(Times(Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,k)),Times(c,Power(x,n))),p),Power(Times(Power(x,Times(j,p)),Power(Plus(a,Times(b,Power(x,Plus(k,Negate(j)))),Times(c,Power(x,Times(C2,Plus(k,Negate(j)))))),p)),-1),Int(Times(Power(x,Plus(m,Times(j,p))),Plus($s("A"),Times($s("B"),Power(x,Plus(k,Negate(j))))),Power(Plus(a,Times(b,Power(x,Plus(k,Negate(j)))),Times(c,Power(x,Times(C2,Plus(k,Negate(j)))))),p)),x)),And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),j,k,m,p),x),ZeroQ(Plus(q,Negate(Plus(k,Negate(j)))))),ZeroQ(Plus(n,Negate(Plus(Times(C2,k),Negate(j)))))),Not(IntegerQ(p))),PosQ(Plus(k,Negate(j)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(u_,j_DEFAULT))),Power(y_,m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(v_,q_DEFAULT)),Times(b_DEFAULT,Power(w_,n_DEFAULT)),Times(c_DEFAULT,Power(z_,r_DEFAULT))),p_)),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),-1),Subst(Int(Times(Power(x,m),Plus($s("A"),Times($s("B"),Power(x,Plus(n,Negate(q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Negate(q))))),p)),x),x,u)),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),m,n,p,q),x),ZeroQ(Plus(j,Negate(Plus(n,Negate(q)))))),ZeroQ(Plus(r,Negate(Plus(Times(C2,n),Negate(q)))))),ZeroQ(Plus(u,Negate(v)))),ZeroQ(Plus(u,Negate(w)))),ZeroQ(Plus(u,Negate(z)))),ZeroQ(Plus(u,Negate(y)))),LinearQ(u,x)),NonzeroQ(Plus(u,Negate(x)))))),
ISetDelayed(Int(Times(z_,Power(x_,m_DEFAULT),Power(u_,p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),ExpandToSum(z,x),Power(ExpandToSum(u,x),p)),x),And(And(And(And(FreeQ(List(m,p),x),BinomialQ(z,x)),GeneralizedTrinomialQ(u,x)),ZeroQ(Plus(BinomialDegree(z,x),Negate(GeneralizedTrinomialDegree(u,x))))),Not(And(BinomialMatchQ(z,x),GeneralizedTrinomialMatchQ(u,x))))))
  );
}
