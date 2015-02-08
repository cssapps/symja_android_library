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
public class IntRules137 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Plus($p("A",true),Times($p("B",true),x_),Times($p("C",true),Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($p("F"),Times(c_DEFAULT,Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2))))),n_DEFAULT)),x_Symbol),
    Condition(Times(g,Power($s("C"),-1),Subst(Int(Times(Power(Plus(a,Times(b,F(Times(c,x)))),n),Power(x,-1)),x),x,Times(Sqrt(Plus(d,Times(e,x))),Power(Plus(f,Times(g,x)),CN1D2)))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,$s("A"),$s("B"),$s("C"),$s("F")),x),ZeroQ(Plus(e,g))),ZeroQ(Plus(d,f,Negate(C2)))),ZeroQ(Plus(Times($s("A"),Sqr(e)),Times($s("C"),d,f)))),ZeroQ(Plus(Times(C2,$s("C"),Plus(d,Negate(C1))),Times(CN1,$s("B"),e)))))),
ISetDelayed(Int(Times(Power(Plus($p("A",true),Times($p("C",true),Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($p("F"),Times(c_DEFAULT,Sqrt(Plus(C1,Times(e_DEFAULT,x_))),Power(Plus(C1,Times(g_DEFAULT,x_)),CN1D2))))),n_DEFAULT)),x_Symbol),
    Condition(Times(g,Power($s("C"),-1),Subst(Int(Times(Power(Plus(a,Times(b,F(Times(c,x)))),n),Power(x,-1)),x),x,Times(Sqrt(Plus(C1,Times(e,x))),Power(Plus(C1,Times(g,x)),CN1D2)))),And(And(FreeQ(List(a,b,c,e,g,$s("A"),$s("C"),$s("F")),x),ZeroQ(Plus(e,g))),ZeroQ(Plus(Times($s("A"),Sqr(e)),$s("C")))))),
ISetDelayed(Int(Times(Power(Plus($p("A",true),Times($p("B",true),x_),Times($p("C",true),Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($p("F"),Times(c_DEFAULT,Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2))))),n_DEFAULT)),x_Symbol),
    Condition(Times(g,Power($s("C"),-1),Subst(Int(Times(Power(Plus(a,Times(b,Power($s("F"),Times(c,x)))),n),Power(x,-1)),x),x,Times(Sqrt(Plus(d,Times(e,x))),Power(Plus(f,Times(g,x)),CN1D2)))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,$s("A"),$s("B"),$s("C"),$s("F")),x),ZeroQ(Plus(e,g))),ZeroQ(Plus(d,f,Negate(C2)))),ZeroQ(Plus(Times($s("A"),Sqr(e)),Times($s("C"),d,f)))),ZeroQ(Plus(Times(C2,$s("C"),Plus(d,Negate(C1))),Times(CN1,$s("B"),e)))))),
ISetDelayed(Int(Times(Power(Plus($p("A",true),Times($p("C",true),Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($p("F"),Times(c_DEFAULT,Sqrt(Plus(C1,Times(e_DEFAULT,x_))),Power(Plus(C1,Times(g_DEFAULT,x_)),CN1D2))))),n_DEFAULT)),x_Symbol),
    Condition(Times(g,Power($s("C"),-1),Subst(Int(Times(Power(Plus(a,Times(b,Power($s("F"),Times(c,x)))),n),Power(x,-1)),x),x,Times(Sqrt(Plus(C1,Times(e,x))),Power(Plus(C1,Times(g,x)),CN1D2)))),And(And(FreeQ(List(a,b,c,e,g,$s("A"),$s("C"),$s("F")),x),ZeroQ(Plus(e,g))),ZeroQ(Plus(Times($s("A"),Sqr(e)),$s("C")))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(v,ExpandIntegrand(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),u,x))),Condition(Int(v,x),SumQ(v))),FreeQ(List(a,b,c,d,e,n,p),x))),
ISetDelayed(Int(Times(u_,Log(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)))),x_Symbol),
    Condition(Module(List(Set(v,ExpandIntegrand(Log(Times(c,Power(Plus(a,Times(b,Power(x,n))),p))),u,x))),Condition(Int(v,x),SumQ(v))),FreeQ(List(a,b,c,n,p),x))),
ISetDelayed(Int(Times(u_,Power(Log(Times(e_DEFAULT,Power(Times($p("e1",true),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),$p("n1",true)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),$p("n2"))),n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(v,ExpandIntegrand(Power(Log(Times(e,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Plus(c,Times(d,x)),$s("n2"))),n))),p),u,x))),Condition(Int(v,x),SumQ(v))),FreeQ(List(a,b,c,d,e,n,$s("e1"),$s("n1"),p),x))),
ISetDelayed(Int(Times(u_,Power(y_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Power(y,Plus(m,C1)),Power(Plus(m,C1),-1)),Not(FalseQ(q)))),And(FreeQ(m,x),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(u_,Power(y_,m_DEFAULT),Power(z_,n_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(Times(y,z),Times(u,Power(z,Plus(n,Negate(m)))),x))),Condition(Times(q,Power(y,Plus(m,C1)),Power(z,Plus(m,C1)),Power(Plus(m,C1),-1)),Not(FalseQ(q)))),And(FreeQ(List(m,n),x),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(u_,x_Symbol),
    Module(List(Set(v,SimplifyIntegrand(u,x))),Condition(Int(v,x),SimplerIntegrandQ(v,u,x)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(Times(e_DEFAULT,Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))))),Times(f_DEFAULT,Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_DEFAULT)))))),m_)),x_Symbol),
    Condition(Times(Power(Plus(Times(a,Sqr(e)),Times(CN1,c,Sqr(f))),m),Int(ExpandIntegrand(Times(u,Power(Plus(Times(e,Sqrt(Plus(a,Times(b,Power(x,n))))),Times(CN1,f,Sqrt(Plus(c,Times(d,Power(x,n)))))),Negate(m))),x),x)),And(And(FreeQ(List(a,b,c,d,e,f,n),x),NegativeIntegerQ(m)),ZeroQ(Plus(Times(b,Sqr(e)),Times(CN1,d,Sqr(f))))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(Times(e_DEFAULT,Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))))),Times(f_DEFAULT,Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_DEFAULT)))))),m_)),x_Symbol),
    Condition(Times(Power(Plus(Times(b,Sqr(e)),Times(CN1,d,Sqr(f))),m),Int(ExpandIntegrand(Times(u,Power(x,Times(m,n)),Power(Plus(Times(e,Sqrt(Plus(a,Times(b,Power(x,n))))),Times(CN1,f,Sqrt(Plus(c,Times(d,Power(x,n)))))),Negate(m))),x),x)),And(And(FreeQ(List(a,b,c,d,e,f,n),x),NegativeIntegerQ(m)),ZeroQ(Plus(Times(a,Sqr(e)),Times(CN1,c,Sqr(f))))))),
ISetDelayed(Int(Times(Power(u_,m_DEFAULT),Power(Plus(v_,Times(a_DEFAULT,Power(u_,n_))),p_DEFAULT),w_),x_Symbol),
    Condition(Int(Times(Power(u,Plus(m,Times(n,p))),Power(Plus(a,Times(Power(u,Negate(n)),v)),p),w),x),And(And(And(FreeQ(List(a,m,n),x),IntegerQ(p)),Not(PositiveQ(n))),Not(FreeQ(v,x))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,y_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,v_)),n_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n)),x),x,y)),Not(FalseQ(q)))),And(FreeQ(List(a,b,c,d,m,n),x),ZeroQ(Plus(y,Negate(v)))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,y_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,v_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,w_)),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p)),x),x,y)),Not(FalseQ(q)))),And(And(FreeQ(List(a,b,c,d,e,f,m,n,p),x),ZeroQ(Plus(y,Negate(v)))),ZeroQ(Plus(y,Negate(w)))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,y_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,v_)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,w_)),p_DEFAULT),Power(Plus(g_DEFAULT,Times(h_DEFAULT,z_)),q_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(r,DerivativeDivides(y,u,x))),Condition(Times(r,Subst(Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n),Power(Plus(e,Times(f,x)),p),Power(Plus(g,Times(h,x)),q)),x),x,y)),Not(FalseQ(r)))),And(And(And(FreeQ(List(a,b,c,d,e,f,g,h,m,n,p,q),x),ZeroQ(Plus(y,Negate(v)))),ZeroQ(Plus(y,Negate(w)))),ZeroQ(Plus(y,Negate(z)))))),
ISetDelayed(Int(Times(u_DEFAULT,Plus(a_,Times(b_DEFAULT,Power(y_,n_)))),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Plus(Times(a,Int(u,x)),Times(b,q,Subst(Int(Power(x,n),x),x,y))),Not(FalseQ(q)))),FreeQ(List(a,b,n),x))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(y_,n_))),p_)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Power(Plus(a,Times(b,Power(x,n))),p),x),x,y)),Not(FalseQ(q)))),FreeQ(List(a,b,n,p),x))),
ISetDelayed(Int(Times(u_DEFAULT,Power(v_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(y_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(q,r),Condition(Times(q,r,Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p)),x),x,y)),And(Not(FalseQ(Set(r,Divides(Power(y,m),Power(v,m),x)))),Not(FalseQ(Set(q,DerivativeDivides(y,u,x))))))),FreeQ(List(a,b,m,n,p),x))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(y_,n_)),Times(c_DEFAULT,Power(v_,j_DEFAULT))),p_)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),x),x,y)),Not(FalseQ(q)))),And(And(FreeQ(List(a,b,c,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(y,Negate(v)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(Plus($p("A"),Times($p("B",true),Power(y_,n_))),Plus(a_DEFAULT,Times(b_DEFAULT,Power(v_,n_)),Times(c_DEFAULT,Power(w_,j_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Times(Plus($s("A"),Times($s("B"),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x,y)),Not(FalseQ(q)))),And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(y,Negate(v)))),ZeroQ(Plus(y,Negate(w)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(Plus($p("A"),Times($p("B",true),Power(y_,n_))),Plus(a_DEFAULT,Times(c_DEFAULT,Power(w_,j_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Times(Plus($s("A"),Times($s("B"),Power(x,n))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),x,y)),Not(FalseQ(q)))),And(And(FreeQ(List(a,c,$s("A"),$s("B"),n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(y,Negate(w)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(v_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(y_,n_)),Times(c_DEFAULT,Power(w_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(q,r),Condition(Times(q,r,Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x,y)),And(Not(FalseQ(Set(r,Divides(Power(y,m),Power(v,m),x)))),Not(FalseQ(Set(q,DerivativeDivides(y,u,x))))))),And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(y,Negate(w)))))),
ISetDelayed(Int(Times(u_DEFAULT,Plus($p("A"),Times($p("B",true),Power(y_,n_))),Power(z_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(v_,n_)),Times(c_DEFAULT,Power(w_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(q,r),Condition(Times(q,r,Subst(Int(Times(Power(x,m),Plus($s("A"),Times($s("B"),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x,y)),And(Not(FalseQ(Set(r,Divides(Power(y,m),Power(z,m),x)))),Not(FalseQ(Set(q,DerivativeDivides(y,u,x))))))),And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(y,Negate(v)))),ZeroQ(Plus(y,Negate(w)))))),
ISetDelayed(Int(Times(u_DEFAULT,Plus($p("A"),Times($p("B",true),Power(y_,n_))),Power(z_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Power(w_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(q,r),Condition(Times(q,r,Subst(Int(Times(Power(x,m),Plus($s("A"),Times($s("B"),Power(x,n))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),x,y)),And(Not(FalseQ(Set(r,Divides(Power(y,m),Power(z,m),x)))),Not(FalseQ(Set(q,DerivativeDivides(y,u,x))))))),And(And(FreeQ(List(a,c,$s("A"),$s("B"),m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(y,Negate(w)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(y_,n_))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(v_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Times(Power(Plus(a,Times(b,Power(x,n))),m),Power(Plus(c,Times(d,Power(x,n))),p)),x),x,y)),Not(FalseQ(q)))),And(FreeQ(List(a,b,c,d,m,n,p),x),ZeroQ(Plus(y,Negate(v)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(y_,n_))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(v_,n_))),p_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,Power(w_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(r,DerivativeDivides(y,u,x))),Condition(Times(r,Subst(Int(Times(Power(Plus(a,Times(b,Power(x,n))),m),Power(Plus(c,Times(d,Power(x,n))),p),Power(Plus(e,Times(f,Power(x,n))),q)),x),x,y)),Not(FalseQ(r)))),And(And(FreeQ(List(a,b,c,d,e,f,m,n,p,q),x),ZeroQ(Plus(y,Negate(v)))),ZeroQ(Plus(y,Negate(w)))))),
ISetDelayed(Int(Times(u_,Power($p("F"),v_)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(v,u,x))),Condition(Times(q,Power($s("F"),v),Power(Log($s("F")),-1)),Not(FalseQ(q)))),FreeQ($s("F"),x))),
ISetDelayed(Int(Times(u_,Power(w_,m_DEFAULT),Power($p("F"),v_)),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(v,u,x))),Condition(Times(q,Subst(Int(Times(Power(x,m),Power($s("F"),x)),x),x,v)),Not(FalseQ(q)))),And(FreeQ(List($s("F"),m),x),ZeroQ(Plus(w,Negate(v)))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_,Times(b_DEFAULT,Power(v_,p_DEFAULT),Power(w_,p_DEFAULT))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(w,D(v,x)),Times(v,D(w,x))),-1))))),Condition(Times(c,Subst(Int(Power(Plus(a,Times(b,Power(x,p))),m),x),x,Times(v,w))),FreeQ(c,x))),And(FreeQ(List(a,b,m,p),x),IntegerQ(p)))),
ISetDelayed(Int(Times(u_,Power(v_,r_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(v_,p_DEFAULT),Power(w_,q_DEFAULT))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(p,w,D(v,x)),Times(q,v,D(w,x))),-1))))),Condition(Times(c,p,Power(Plus(r,C1),-1),Subst(Int(Power(Plus(a,Times(b,Power(x,Times(p,Power(Plus(r,C1),-1))))),m),x),x,Times(Power(v,Plus(r,C1)),w))),FreeQ(c,x))),And(And(And(FreeQ(List(a,b,m,p,q,r),x),ZeroQ(Plus(p,Times(CN1,q,Plus(r,C1))))),NonzeroQ(Plus(r,C1))),IntegerQ(Times(p,Power(Plus(r,C1),-1)))))),
ISetDelayed(Int(Times(u_,Power(v_,r_DEFAULT),Power(w_,s_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(v_,p_DEFAULT),Power(w_,q_DEFAULT))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(p,w,D(v,x)),Times(q,v,D(w,x))),-1))))),Condition(Times(c,p,Power(Plus(r,C1),-1),Subst(Int(Power(Plus(a,Times(b,Power(x,Times(p,Power(Plus(r,C1),-1))))),m),x),x,Times(Power(v,Plus(r,C1)),Power(w,Plus(s,C1))))),FreeQ(c,x))),And(And(And(FreeQ(List(a,b,m,p,q,r,s),x),ZeroQ(Plus(Times(p,Plus(s,C1)),Times(CN1,q,Plus(r,C1))))),NonzeroQ(Plus(r,C1))),IntegerQ(Times(p,Power(Plus(r,C1),-1)))))),
ISetDelayed(Int(Times(u_,Power(Plus(Times(a_DEFAULT,Power(v_,p_DEFAULT)),Times(b_DEFAULT,Power(w_,q_DEFAULT))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(p,w,D(v,x)),Times(CN1,q,v,D(w,x))),-1))))),Condition(Times(c,p,Subst(Int(Power(Plus(b,Times(a,Power(x,p))),m),x),x,Times(v,Power(w,Plus(Times(m,q),C1))))),FreeQ(c,x))),And(And(And(FreeQ(List(a,b,m,p,q),x),ZeroQ(Plus(p,Times(q,Plus(Times(m,p),C1))))),IntegerQ(p)),IntegerQ(m)))),
ISetDelayed(Int(Times(u_,Power(Plus(Times(a_DEFAULT,Power(v_,p_DEFAULT)),Times(b_DEFAULT,Power(w_,q_DEFAULT))),m_DEFAULT),Power(v_,r_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(p,w,D(v,x)),Times(CN1,q,v,D(w,x))),-1))))),Condition(Times(CN1,c,q,Subst(Int(Power(Plus(a,Times(b,Power(x,q))),m),x),x,Times(Power(v,Plus(Times(m,p),r,C1)),w))),FreeQ(c,x))),And(And(And(FreeQ(List(a,b,m,p,q,r),x),ZeroQ(Plus(p,Times(q,Plus(Times(m,p),r,C1))))),IntegerQ(q)),IntegerQ(m)))),
ISetDelayed(Int(Times(u_,Power(Plus(Times(a_DEFAULT,Power(v_,p_DEFAULT)),Times(b_DEFAULT,Power(w_,q_DEFAULT))),m_DEFAULT),Power(w_,s_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(p,w,D(v,x)),Times(CN1,q,v,D(w,x))),-1))))),Condition(Times(CN1,c,q,Power(Plus(s,C1),-1),Subst(Int(Power(Plus(a,Times(b,Power(x,Times(q,Power(Plus(s,C1),-1))))),m),x),x,Times(Power(v,Plus(Times(m,p),C1)),Power(w,Plus(s,C1))))),FreeQ(c,x))),And(And(And(And(FreeQ(List(a,b,m,p,q,s),x),ZeroQ(Plus(Times(p,Plus(s,C1)),Times(q,Plus(Times(m,p),C1))))),NonzeroQ(Plus(s,C1))),IntegerQ(Times(q,Power(Plus(s,C1),-1)))),IntegerQ(m)))),
ISetDelayed(Int(Times(u_,Power(v_,r_DEFAULT),Power(w_,s_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(v_,p_DEFAULT)),Times(b_DEFAULT,Power(w_,q_DEFAULT))),m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(p,w,D(v,x)),Times(CN1,q,v,D(w,x))),-1))))),Condition(Times(CN1,c,q,Power(Plus(s,C1),-1),Subst(Int(Power(Plus(a,Times(b,Power(x,Times(q,Power(Plus(s,C1),-1))))),m),x),x,Times(Power(v,Plus(Times(m,p),r,C1)),Power(w,Plus(s,C1))))),FreeQ(c,x))),And(And(And(And(FreeQ(List(a,b,m,p,q,r,s),x),ZeroQ(Plus(Times(p,Plus(s,C1)),Times(q,Plus(Times(m,p),r,C1))))),NonzeroQ(Plus(s,C1))),IntegerQ(Times(q,Power(Plus(s,C1),-1)))),IntegerQ(m)))),
ISetDelayed(Int(Times(u_,Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(m,C1),-1),Subst(Int(SubstFor(Power(x,Plus(m,C1)),u,x),x),x,Power(x,Plus(m,C1)))),And(And(FreeQ(m,x),NonzeroQ(Plus(m,C1))),FunctionOfQ(Power(x,Plus(m,C1)),u,x)))),
ISetDelayed(Int(u_,x_Symbol),
    Module(List(Set($s("lst"),SubstForFractionalPowerOfLinear(u,x))),Condition(Times(Part($s("lst"),C2),Part($s("lst"),C4),Subst(Int(Part($s("lst"),C1),x),x,Power(Part($s("lst"),C3),Power(Part($s("lst"),C2),-1)))),And(NotFalseQ($s("lst")),SubstForFractionalPowerQ(u,Part($s("lst"),C3),x))))),
ISetDelayed(Int(u_,x_Symbol),
    Module(List(Set($s("lst"),SubstForFractionalPowerOfQuotientOfLinears(u,x))),Condition(Times(Part($s("lst"),C2),Part($s("lst"),C4),Subst(Int(Part($s("lst"),C1),x),x,Power(Part($s("lst"),C3),Power(Part($s("lst"),C2),-1)))),NotFalseQ($s("lst"))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(a_,v_),p_)),x_Symbol),
    Condition(Times(Power(a,Plus(p,Negate(C1D2))),Sqrt(Times(a,v)),Power(v,CN1D2),Int(Times(u,Power(v,p)),x)),And(FreeQ(a,x),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(a_,v_),p_)),x_Symbol),
    Condition(Times(Power(a,Plus(p,C1D2)),Sqrt(v),Power(Times(a,v),CN1D2),Int(Times(u,Power(v,p)),x)),And(FreeQ(a,x),NegativeIntegerQ(Plus(p,Negate(C1D2)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(a_,v_),p_)),x_Symbol),
    Condition(Times(Power(Times(a,v),p),Power(Power(v,p),-1),Int(Times(u,Power(v,p)),x)),And(FreeQ(List(a,p),x),Not(IntegerQ(Times(C2,p)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Power(v_,m_),p_)),x_Symbol),
    Condition(Times(Sqrt(Power(v,m)),Power(Power(v,Times(C1D2,m)),-1),Int(Times(u,Power(v,Times(m,p))),x)),And(FreeQ(m,x),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Power(v_,m_),p_)),x_Symbol),
    Condition(Times(Power(v,Times(C1D2,m)),Power(Power(v,m),CN1D2),Int(Times(u,Power(v,Times(m,p))),x)),And(FreeQ(m,x),NegativeIntegerQ(Plus(p,Negate(C1D2)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Power(v_,m_),p_)),x_Symbol),
    Condition(Times(Power(Power(v,m),p),Power(Power(v,Times(m,p)),-1),Int(Times(u,Power(v,Times(m,p))),x)),And(FreeQ(List(m,p),x),Not(IntegerQ(Times(C2,p)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(Power(v_,m_DEFAULT),Power(w_,n_DEFAULT)),p_)),x_Symbol),
    Condition(Times(Sqrt(Times(Power(v,m),Power(w,n))),Power(Times(Power(v,Times(C1D2,m)),Power(w,Times(C1D2,n))),-1),Int(Times(u,Power(v,Times(m,p)),Power(w,Times(n,p))),x)),And(FreeQ(List(m,n),x),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(Power(v_,m_DEFAULT),Power(w_,n_DEFAULT)),p_)),x_Symbol),
    Condition(Times(Power(v,Times(C1D2,m)),Power(w,Times(C1D2,n)),Power(Times(Power(v,m),Power(w,n)),CN1D2),Int(Times(u,Power(v,Times(m,p)),Power(w,Times(n,p))),x)),And(FreeQ(List(m,n),x),NegativeIntegerQ(Plus(p,Negate(C1D2)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(Power(v_,m_DEFAULT),Power(w_,n_DEFAULT)),p_)),x_Symbol),
    Condition(Times(Power(Times(Power(v,m),Power(w,n)),p),Power(Times(Power(v,Times(m,p)),Power(w,Times(n,p))),-1),Int(Times(u,Power(v,Times(m,p)),Power(w,Times(n,p))),x)),And(FreeQ(List(m,n,p),x),Not(IntegerQ(Times(C2,p)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Times(Power(v_,m_DEFAULT),Power(w_,n_DEFAULT),Power(z_,q_DEFAULT)),p_)),x_Symbol),
    Condition(Times(Power(Times(Power(v,m),Power(w,n),Power(z,q)),p),Power(Times(Power(v,Times(m,p)),Power(w,Times(n,p)),Power(z,Times(p,q))),-1),Int(Times(u,Power(v,Times(m,p)),Power(w,Times(n,p)),Power(z,Times(p,q))),x)),And(FreeQ(List(m,n,p,q),x),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Times(FullSimplify(Times(Sqrt(Plus(a,Times(b,Power(x,n)))),Power(Times(Power(x,Times(C1D2,n)),Sqrt(Plus(b,Times(a,Power(Power(x,n),-1))))),-1))),Int(Times(u,Power(x,Times(n,p)),Power(Plus(b,Times(a,Power(x,Negate(n)))),p)),x)),And(And(And(FreeQ(List(a,b,p),x),IntegerQ(Plus(p,C1D2))),NegativeIntegerQ(n)),Not(RationalFunctionQ(u,x))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(v_,n_))),p_)),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,Power(v,n))),p),Power(Times(Power(v,Times(n,p)),Power(Plus(b,Times(a,Power(v,Negate(n)))),p)),-1),Int(Times(u,Power(v,Times(n,p)),Power(Plus(b,Times(a,Power(v,Negate(n)))),p)),x)),And(And(And(And(FreeQ(List(a,b,p),x),Not(IntegerQ(p))),NegativeIntegerQ(n)),BinomialQ(v,x)),Not(LinearQ(v,x))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,m_DEFAULT),Power(v_,n_))),p_)),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,Power(x,m),Power(v,n))),p),Power(Times(Power(v,Times(n,p)),Power(Plus(Times(b,Power(x,m)),Times(a,Power(v,Negate(n)))),p)),-1),Int(Times(u,Power(v,Times(n,p)),Power(Plus(Times(b,Power(x,m)),Times(a,Power(v,Negate(n)))),p)),x)),And(And(And(FreeQ(List(a,b,m,p),x),Not(IntegerQ(p))),NegativeIntegerQ(n)),BinomialQ(v,x)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power(x_,r_DEFAULT)),Times(b_DEFAULT,Power(x_,s_DEFAULT))),m_)),x_Symbol),
    Condition(Times(Power(Plus(Times(a,Power(x,r)),Times(b,Power(x,s))),m),Power(Times(Power(x,Times(m,r)),Power(Plus(a,Times(b,Power(x,Plus(s,Negate(r))))),m)),-1),Int(Times(u,Power(x,Times(m,r)),Power(Plus(a,Times(b,Power(x,Plus(s,Negate(r))))),m)),x)),And(And(FreeQ(List(a,b,m,r,s),x),Not(IntegerQ(m))),PosQ(Plus(s,Negate(r)))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition(Int(RationalFunctionExpand(Times(u,Power(Plus(a,Times(b,Power(x,n))),-1)),x),x),And(FreeQ(List(a,b),x),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(u_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),-1),Int(Times(u,Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),IntegerQ(p)),Not(AlgebraicFunctionQ(u,x))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_)),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,p)),-1),Int(Times(u,Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),Not(IntegerQ(p))),Not(AlgebraicFunctionQ(u,x))))),
ISetDelayed(Int(Times(u_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),-1)),x_Symbol),
    Condition(Int(RationalFunctionExpand(Times(u,Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),-1)),x),x),And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(u_,Power(v_,p_)),x_Symbol),
    Condition(Module(List(Set(m,Exponent(u,x)),Set(n,Exponent(v,x))),Condition(Module(List(Set(c,Times(Coefficient(u,x,m),Power(Times(Coefficient(v,x,n),Plus(m,C1,Times(n,p))),-1))),w),CompoundExpression(CompoundExpression(Set(c,Times(Coefficient(u,x,m),Power(Times(Coefficient(v,x,n),Plus(m,C1,Times(n,p))),-1))),Set(w,Apart(Plus(u,Times(CN1,c,Power(x,Plus(m,Negate(n))),Plus(Times(Plus(m,Negate(n),C1),v),Times(Plus(p,C1),x,D(v,x))))),x))),If(ZeroQ(w),Times(c,Power(x,Plus(m,Negate(n),C1)),Power(v,Plus(p,C1))),Plus(Times(c,Power(x,Plus(m,Negate(n),C1)),Power(v,Plus(p,C1))),Int(Times(w,Power(v,p)),x))))),And(And(And(GreaterEqual(Plus(m,C1),n),Greater(n,C1)),Less(Plus(m,Times(n,p)),CN1)),FalseQ(DerivativeDivides(v,u,x))))),And(And(And(And(And(And(RationalQ(p),Less(p,CN1)),PolynomialQ(u,x)),PolynomialQ(v,x)),SumQ(v)),Not(And(MonomialQ(u,x),BinomialQ(v,x)))),Not(And(ZeroQ(Coefficient(u,x,C0)),ZeroQ(Coefficient(v,x,C0))))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power(x_,m_DEFAULT)),Times(b_DEFAULT,Sqrt(Times(c_DEFAULT,Power(x_,n_))))),-1)),x_Symbol),
    Condition(Int(Times(u,Plus(Times(a,Power(x,m)),Times(CN1,b,Sqrt(Times(c,Power(x,n))))),Power(Plus(Times(Sqr(a),Power(x,Times(C2,m))),Times(CN1,Sqr(b),c,Power(x,n))),-1)),x),FreeQ(List(a,b,c,m,n),x))),
ISetDelayed(Int(u_,x_Symbol),
    Module(List(Set($s("lst"),FunctionOfLinear(u,x))),Condition(Dist(Power(Part($s("lst"),C3),-1),Subst(Int(Part($s("lst"),C1),x),x,Plus(Part($s("lst"),C2),Times(Part($s("lst"),C3),x))),x),Not(FalseQ($s("lst"))))))
  );
}
