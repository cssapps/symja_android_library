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
public class IntRules19 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Times(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Times(CN2,$s("A"),Subst(Int(Power(Plus(Times(b,d),Times(CN1,a,e),Times(CN1,b,Sqr(x))),-1),x),x,Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x)))))),And(And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),ZeroQ(Plus(Times(c,e),Times(CN1,b,f)))),ZeroQ(Plus(Times($s("B"),e),Times(CN1,C2,$s("A"),f)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Times(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times($s("B"),e),Times(CN1,C2,$s("A"),f)),Power(Times(C2,f),-1),Int(Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1),x)),Times($s("B"),Power(Times(C2,f),-1),Int(Times(Plus(e,Times(C2,f,x)),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),ZeroQ(Plus(Times(c,e),Times(CN1,b,f)))),NonzeroQ(Plus(Times($s("B"),e),Times(CN1,C2,$s("A"),f)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Times(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Times($s("A"),Subst(Int(Power(Plus(a,Times(Plus(Times(c,d),Times(CN1,a,f)),Sqr(x))),-1),x),x,Times(x,Power(Plus(d,Times(e,x),Times(f,Sqr(x))),CN1D2)))),And(And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),ZeroQ(Plus(Times(b,d),Times(CN1,a,e)))),ZeroQ(Plus(Times(C2,$s("B"),d),Times(CN1,$s("A"),e)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Times(C2,$s("A"),Plus(Times(C2,$s("B"),d),Times(CN1,$s("A"),e)),Subst(Int(Power(Simp(Plus(Times($s("A"),Plus(Times(C2,$s("B"),d),Times(CN1,$s("A"),e)),Plus(Sqr(e),Times(CN1,C4,d,f))),Times(CN1,Plus(Times(b,d),Times(CN1,a,e)),Sqr(x))),x),-1),x),x,Times(Simp(Plus(Times(C2,$s("B"),d),Times(CN1,$s("A"),e),Times(Plus(Times($s("B"),e),Times(CN1,C2,$s("A"),f)),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2)))),And(And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(e),Times(CN1,C4,d,f)))),NonzeroQ(Plus(Times(b,d),Times(CN1,a,e)))),ZeroQ(Plus(Times(Sqr($s("A")),Plus(Times(c,e),Times(CN1,b,f))),Times(Sqr($s("B")),Plus(Times(b,d),Times(CN1,a,e))),Times(CN1,C2,$s("A"),$s("B"),Plus(Times(c,d),Times(CN1,a,f)))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Times(Plus(d_,Times(f_DEFAULT,Sqr(x_))),Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Times(CN2,$s("A"),$s("B"),Subst(Int(Power(Plus(Times(C2,$s("A"),$s("B"),d,f),Times(b,Sqr(x))),-1),x),x,Times(Plus(Times($s("B"),d),Times(CN1,$s("A"),f,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2)))),And(FreeQ(List(a,b,c,d,f,$s("A"),$s("B")),x),ZeroQ(Plus(Times(Sqr($s("A")),b,f),Times(CN1,b,Sqr($s("B")),d),Times(C2,$s("A"),$s("B"),Plus(Times(c,d),Times(CN1,a,f)))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(c_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Times(C2,$s("A"),Plus(Times(C2,$s("B"),d),Times(CN1,$s("A"),e)),Subst(Int(Power(Simp(Plus(Times($s("A"),Plus(Times(C2,$s("B"),d),Times(CN1,$s("A"),e)),Plus(Sqr(e),Times(CN1,C4,d,f))),Times(a,e,Sqr(x))),x),-1),x),x,Times(Simp(Plus(Times(C2,$s("B"),d),Times(CN1,$s("A"),e),Times(Plus(Times($s("B"),e),Times(CN1,C2,$s("A"),f)),x)),x),Power(Plus(a,Times(c,Sqr(x))),CN1D2)))),And(And(FreeQ(List(a,c,d,e,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(e),Times(CN1,C4,d,f)))),ZeroQ(Plus(Times(Sqr($s("A")),c,e),Times(CN1,Sqr($s("B")),a,e),Times(CN1,C2,$s("A"),$s("B"),Plus(Times(c,d),Times(CN1,a,f)))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Module(List($s("R"),$s("S"),Set($s("lst"),Solve(List(Equal(Plus(Times(Sqr($s("R")),Plus(Times(c,e),Times(CN1,b,f))),Times(Sqr($s("S")),Plus(Times(b,d),Times(CN1,a,e))),Times(CN1,C2,$s("R"),$s("S"),Plus(Times(c,d),Times(CN1,a,f)))),C0),Equal(Plus(Times(Sqr(Plus($s("A"),Negate($s("R")))),Plus(Times(c,e),Times(CN1,b,f))),Times(Sqr(Plus($s("B"),Negate($s("S")))),Plus(Times(b,d),Times(CN1,a,e))),Times(CN1,C2,Plus($s("A"),Negate($s("R"))),Plus($s("B"),Negate($s("S"))),Plus(Times(c,d),Times(CN1,a,f)))),C0)),List($s("R"),$s("S"))))),Condition(Plus(Int(Times(Simp(Plus(Part($s("lst"),C1,C1,C2),Times(Part($s("lst"),C1,C2,C2),x)),x),Power(Times(Plus(d,Times(e,x),Times(f,Sqr(x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),-1)),x),Int(Times(Simp(Plus($s("A"),Negate(Part($s("lst"),C1,C1,C2)),Times(Plus($s("B"),Negate(Part($s("lst"),C1,C2,C2))),x)),x),Power(Times(Plus(d,Times(e,x),Times(f,Sqr(x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),-1)),x)),Equal(Length($s("lst")),C2))),And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(e),Times(CN1,C4,d,f)))),NonzeroQ(Plus(Times(b,d),Times(CN1,a,e)))),NonzeroQ(Plus(Times(Sqr($s("A")),Plus(Times(c,e),Times(CN1,b,f))),Times(Sqr($s("B")),Plus(Times(b,d),Times(CN1,a,e))),Times(CN1,C2,$s("A"),$s("B"),Plus(Times(c,d),Times(CN1,a,f)))))),RationalQ(a,b,c)),NegQ(Plus(Sqr(e),Times(CN1,C4,d,f)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Times(Plus(d_,Times(f_DEFAULT,Sqr(x_))),Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Module(List($s("R"),$s("S"),Set($s("lst"),Solve(List(Equal(Plus(Times(Sqr($s("R")),b,f),Times(CN1,Sqr($s("S")),b,d),Times(C2,$s("R"),$s("S"),Plus(Times(c,d),Times(CN1,a,f)))),C0),Equal(Plus(Times(Sqr(Plus($s("A"),Negate($s("R")))),b,f),Times(CN1,Sqr(Plus($s("B"),Negate($s("S")))),b,d),Times(C2,Plus($s("A"),Negate($s("R"))),Plus($s("B"),Negate($s("S"))),Plus(Times(c,d),Times(CN1,a,f)))),C0)),List($s("R"),$s("S"))))),Condition(Plus(Int(Times(Simp(Plus(Part($s("lst"),C1,C1,C2),Times(Part($s("lst"),C1,C2,C2),x)),x),Power(Times(Plus(d,Times(f,Sqr(x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),-1)),x),Int(Times(Simp(Plus($s("A"),Negate(Part($s("lst"),C1,C1,C2)),Times(Plus($s("B"),Negate(Part($s("lst"),C1,C2,C2))),x)),x),Power(Times(Plus(d,Times(f,Sqr(x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),-1)),x)),Equal(Length($s("lst")),C2))),And(And(And(FreeQ(List(a,b,c,d,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Times(Sqr($s("A")),b,f),Times(CN1,b,Sqr($s("B")),d),Times(C2,$s("A"),$s("B"),Plus(Times(c,d),Times(CN1,a,f)))))),RationalQ(a,b,c)),PosQ(Times(d,f))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),Sqrt(Plus(a_,Times(c_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Module(List($s("R"),$s("S"),Set($s("lst"),Solve(List(Equal(Plus(Times(Sqr($s("R")),c,e),Times(CN1,Sqr($s("S")),a,e),Times(CN1,C2,$s("R"),$s("S"),Plus(Times(c,d),Times(CN1,a,f)))),C0),Equal(Plus(Times(Sqr(Plus($s("A"),Negate($s("R")))),c,e),Times(CN1,Sqr(Plus($s("B"),Negate($s("S")))),a,e),Times(CN1,C2,Plus($s("A"),Negate($s("R"))),Plus($s("B"),Negate($s("S"))),Plus(Times(c,d),Times(CN1,a,f)))),C0)),List($s("R"),$s("S"))))),Condition(Plus(Int(Times(Simp(Plus(Part($s("lst"),C1,C1,C2),Times(Part($s("lst"),C1,C2,C2),x)),x),Power(Times(Plus(d,Times(e,x),Times(f,Sqr(x))),Sqrt(Plus(a,Times(c,Sqr(x))))),-1)),x),Int(Times(Simp(Plus($s("A"),Negate(Part($s("lst"),C1,C1,C2)),Times(Plus($s("B"),Negate(Part($s("lst"),C1,C2,C2))),x)),x),Power(Times(Plus(d,Times(e,x),Times(f,Sqr(x))),Sqrt(Plus(a,Times(c,Sqr(x))))),-1)),x)),Equal(Length($s("lst")),C2))),And(And(And(And(FreeQ(List(a,c,d,e,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(e),Times(CN1,C4,d,f)))),NonzeroQ(Plus(Times(Sqr($s("A")),c,e),Times(CN1,Sqr($s("B")),a,e),Times(CN1,C2,$s("A"),$s("B"),Plus(Times(c,d),Times(CN1,a,f)))))),RationalQ(a,c)),NegQ(Plus(Sqr(e),Times(CN1,C4,d,f)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Times(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Times(Plus(Times(C2,c,$s("A")),Times(CN1,$s("B"),Plus(b,Negate(q)))),Power(q,-1),Int(Power(Times(Plus(b,Negate(q),Times(C2,c,x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1),x)),Times(CN1,Plus(Times(C2,c,$s("A")),Times(CN1,$s("B"),Plus(b,q))),Power(q,-1),Int(Power(Times(Plus(b,q,Times(C2,c,x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1),x)))),And(And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Times(C2,c,$s("A")),Times(CN1,b,$s("B"))))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),NonzeroQ(Plus(Times(c,Sqr($s("A"))),Times(CN1,b,$s("A"),$s("B")),Times(a,Sqr($s("B")))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Times(Plus(a_,Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Times(CN1,a,c),C2))),Plus(Times(Plus(Times(C1D2,$s("B")),Times(c,$s("A"),Power(Times(C2,q),-1))),Int(Power(Times(Plus(Negate(q),Times(c,x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1),x)),Times(Plus(Times(C1D2,$s("B")),Times(CN1,c,$s("A"),Power(Times(C2,q),-1))),Int(Power(Times(Plus(q,Times(c,x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1),x)))),And(FreeQ(List(a,c,d,e,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Times(c,Sqr($s("A"))),Times(a,Sqr($s("B")))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Times(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_,Times(f_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Times(Plus(Times(C2,c,$s("A")),Times(CN1,$s("B"),Plus(b,Negate(q)))),Power(q,-1),Int(Power(Times(Plus(b,Negate(q),Times(C2,c,x)),Sqrt(Plus(d,Times(f,Sqr(x))))),-1),x)),Times(CN1,Plus(Times(C2,c,$s("A")),Times(CN1,$s("B"),Plus(b,q))),Power(q,-1),Int(Power(Times(Plus(b,q,Times(C2,c,x)),Sqrt(Plus(d,Times(f,Sqr(x))))),-1),x)))),And(And(And(FreeQ(List(a,b,c,d,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Times(C2,c,$s("A")),Times(CN1,b,$s("B"))))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),NonzeroQ(Plus(Times(c,Sqr($s("A"))),Times(CN1,b,$s("A"),$s("B")),Times(a,Sqr($s("B")))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Times(Plus(a_,Times(c_DEFAULT,Sqr(x_))),Sqrt(Plus(d_,Times(f_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Times(CN1,a,c),C2))),Plus(Times(Plus(Times(c,$s("A")),Times($s("B"),q)),Power(Times(C2,q),-1),Int(Power(Times(Plus(Negate(q),Times(c,x)),Sqrt(Plus(d,Times(f,Sqr(x))))),-1),x)),Times(CN1,Plus(Times(c,$s("A")),Times(CN1,$s("B"),q)),Power(Times(C2,q),-1),Int(Power(Times(Plus(q,Times(c,x)),Sqrt(Plus(d,Times(f,Sqr(x))))),-1),x)))),And(And(FreeQ(List(a,c,d,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Times(c,Sqr($s("A"))),Times(a,Sqr($s("B")))))),Not(NegativeQ(Times(CN1,a,c)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Times(Sqr(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(e,Plus(Times($s("A"),b),Times(CN1,C2,a,$s("B")))),Times(CN1,b,Plus(Times($s("B"),e),Times(CN1,C2,$s("A"),f)),x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x)))),Power(Times(Plus(Times(b,d),Times(CN1,a,e)),Plus(Times(b,e),Times(CN1,C4,a,f)),Plus(a,Times(b,x),Times(c,Sqr(x)))),-1)),Times(CN1,Power(Times(C2,Plus(Times(b,d),Times(CN1,a,e)),Plus(Times(b,e),Times(CN1,C4,a,f))),-1),Int(Times(Simp(Plus(Times(C2,a,e,Plus(Times($s("B"),e),Times(CN1,C4,$s("A"),f))),Times(CN1,b,Plus(Times(C2,$s("B"),d,e),Times(CN1,$s("A"),Plus(Sqr(e),Times(C4,d,f))))),Times($s("B"),e,Plus(Times(b,e),Times(CN1,C4,a,f)),x)),x),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),ZeroQ(Plus(Times(c,e),Times(CN1,b,f)))),NonzeroQ(Plus(Times(b,d),Times(CN1,a,e)))),NonzeroQ(Plus(Times(b,e),Times(CN1,C4,a,f)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Times(Sqr(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(b,Plus(Times($s("B"),d,Plus(Times(C2,c,d),Times(CN1,b,e))),Times(CN1,$s("A"),e,Plus(Times(C3,c,d),Times(CN1,b,e))))),Times(CN1,c,e,Plus(Times(b,$s("B"),d),Times($s("A"),Plus(Times(C2,c,d),Times(CN1,b,e)))),x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x)))),Power(Times(a,d,Plus(Times(c,e),Times(CN1,b,f)),Plus(Times(C4,c,d),Times(CN1,b,e)),Plus(a,Times(b,x),Times(c,Sqr(x)))),-1)),Times(e,Power(Times(C2,a,d,Plus(Times(c,e),Times(CN1,b,f)),Plus(Times(C4,c,d),Times(CN1,b,e))),-1),Int(Times(Simp(Plus(Times(Plus(Times(C4,c,d),Times(CN1,b,e)),Plus(Times($s("A"),Plus(Times(c,d),Times(b,e),Times(CN1,C2,a,f))),Times(CN1,b,$s("B"),d))),Times(c,Plus(Times($s("A"),e,Plus(Times(C2,c,d),Times(CN1,b,e),Times(C2,a,f))),Times($s("B"),d,Plus(Times(b,e),Times(CN1,C4,a,f)))),x)),x),Power(Times(Plus(a,Times(b,x),Times(c,Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B")),x),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),ZeroQ(Plus(Times(b,d),Times(CN1,a,e)))),NonzeroQ(Plus(Times(c,e),Times(CN1,b,f)))),NonzeroQ(Plus(Times(C4,c,d),Times(CN1,b,e)))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,3))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(a,Power(b,-1)),C3))),Set(s,Denominator(Rt(Times(a,Power(b,-1)),C3)))),Plus(Times(r,Power(Times(C3,a),-1),Int(Power(Times(Plus(r,Times(s,x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1),x)),Times(r,Power(Times(C3,a),-1),Int(Times(Plus(Times(C2,r),Times(CN1,s,x)),Power(Times(Plus(Sqr(r),Times(CN1,r,s,x),Times(Sqr(s),Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1)),x)))),And(FreeQ(List(a,b,d,e,f),x),PosQ(Times(a,Power(b,-1)))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,3))),Sqrt(Plus(d_DEFAULT,Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(a,Power(b,-1)),C3))),Set(s,Denominator(Rt(Times(a,Power(b,-1)),C3)))),Plus(Times(r,Power(Times(C3,a),-1),Int(Power(Times(Plus(r,Times(s,x)),Sqrt(Plus(d,Times(f,Sqr(x))))),-1),x)),Times(r,Power(Times(C3,a),-1),Int(Times(Plus(Times(C2,r),Times(CN1,s,x)),Power(Times(Plus(Sqr(r),Times(CN1,r,s,x),Times(Sqr(s),Sqr(x))),Sqrt(Plus(d,Times(f,Sqr(x))))),-1)),x)))),And(FreeQ(List(a,b,d,f),x),PosQ(Times(a,Power(b,-1)))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,3))),Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,-1)),C3))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,-1)),C3)))),Plus(Times(r,Power(Times(C3,a),-1),Int(Power(Times(Plus(r,Times(CN1,s,x)),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1),x)),Times(r,Power(Times(C3,a),-1),Int(Times(Plus(Times(C2,r),Times(s,x)),Power(Times(Plus(Sqr(r),Times(r,s,x),Times(Sqr(s),Sqr(x))),Sqrt(Plus(d,Times(e,x),Times(f,Sqr(x))))),-1)),x)))),And(FreeQ(List(a,b,d,e,f),x),NegQ(Times(a,Power(b,-1)))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,Power(x_,3))),Sqrt(Plus(d_DEFAULT,Times(f_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,-1)),C3))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,-1)),C3)))),Plus(Times(r,Power(Times(C3,a),-1),Int(Power(Times(Plus(r,Times(CN1,s,x)),Sqrt(Plus(d,Times(f,Sqr(x))))),-1),x)),Times(r,Power(Times(C3,a),-1),Int(Times(Plus(Times(C2,r),Times(s,x)),Power(Times(Plus(Sqr(r),Times(r,s,x),Times(Sqr(s),Sqr(x))),Sqrt(Plus(d,Times(f,Sqr(x))))),-1)),x)))),And(FreeQ(List(a,b,d,f),x),NegQ(Times(a,Power(b,-1)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Plus($s("A"),Times($s("B"),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B"),p),x),Or(IntegersQ(m,p),PositiveIntegerQ(m))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Plus($s("A"),Times($s("B"),x)),Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),p)),x),x),And(FreeQ(List(a,c,d,e,f,$s("A"),$s("B"),p),x),Or(Or(IntegersQ(m,p),PositiveIntegerQ(m)),PositiveIntegerQ(p))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Plus($s("A"),Times($s("B"),x)),Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(f,Sqr(x))),p)),x),x),And(FreeQ(List(a,c,d,f,$s("A"),$s("B"),p),x),Or(IntegersQ(m,p),PositiveIntegerQ(m))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(c,-2),Int(Times(Simp(Plus(Times($s("A"),c,f),Times($s("B"),Plus(Times(c,e),Times(CN1,b,f))),Times($s("B"),c,f,x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(m,C1)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(p,Negate(C1)))),x)),Times(Power(c,-2),Int(Times(Simp(Plus(Times($s("A"),c,Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,a,$s("B"),Plus(Times(c,e),Times(CN1,b,f))),Times(Plus(Times($s("A"),c,Plus(Times(c,e),Times(CN1,b,f))),Times($s("B"),Plus(Times(c,Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,b,Plus(Times(c,e),Times(CN1,b,f)))))),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(p,Negate(C1)))),x))),And(And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B")),x),RationalQ(m,p)),LessEqual(m,CN1)),Greater(p,C0)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(c,-1),Int(Times(Simp(Plus(Times($s("A"),f),Times($s("B"),e),Times($s("B"),f,x)),x),Power(Plus(a,Times(c,Sqr(x))),Plus(m,C1)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(p,Negate(C1)))),x)),Times(Power(c,-1),Int(Times(Simp(Plus(Times($s("A"),Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,a,$s("B"),e),Times(Plus(Times($s("A"),c,e),Times($s("B"),Plus(Times(c,d),Times(CN1,a,f)))),x)),x),Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(p,Negate(C1)))),x))),And(And(And(FreeQ(List(a,c,d,e,f,$s("A"),$s("B")),x),RationalQ(m,p)),LessEqual(m,CN1)),Greater(p,C0)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(c,-2),Int(Times(Simp(Plus(Times($s("A"),c,f),Times(CN1,b,$s("B"),f),Times($s("B"),c,f,x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(m,C1)),Power(Plus(d,Times(f,Sqr(x))),Plus(p,Negate(C1)))),x)),Times(Power(c,-2),Int(Times(Simp(Plus(Times($s("A"),c,Plus(Times(c,d),Times(CN1,a,f))),Times(a,b,$s("B"),f),Times(Plus(Times(CN1,$s("A"),b,c,f),Times($s("B"),Plus(Times(c,Plus(Times(c,d),Times(CN1,a,f))),Times(Sqr(b),f)))),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),m),Power(Plus(d,Times(f,Sqr(x))),Plus(p,Negate(C1)))),x))),And(And(And(FreeQ(List(a,b,c,d,f,$s("A"),$s("B")),x),RationalQ(m,p)),LessEqual(m,CN1)),Greater(p,C0)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(c,-1),Int(Times(Simp(Plus(Times($s("A"),f),Times($s("B"),f,x)),x),Power(Plus(a,Times(c,Sqr(x))),Plus(m,C1)),Power(Plus(d,Times(f,Sqr(x))),Plus(p,Negate(C1)))),x)),Times(Power(c,-1),Int(Times(Simp(Plus(Times($s("A"),Plus(Times(c,d),Times(CN1,a,f))),Times($s("B"),Plus(Times(c,d),Times(CN1,a,f)),x)),x),Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(f,Sqr(x))),Plus(p,Negate(C1)))),x))),And(And(And(FreeQ(List(a,c,d,f,$s("A"),$s("B")),x),RationalQ(m,p)),LessEqual(m,CN1)),Greater(p,C0)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(Times(c,Plus(Times(c,Sqr(d)),Times(CN1,e,Plus(Times(b,d),Times(CN1,a,e))))),Times(CN1,Plus(Times(C2,a,c,d),Times(CN1,b,Plus(Times(b,d),Times(CN1,a,e)))),f),Times(Sqr(a),Sqr(f))),-1),Int(Times(Simp(Plus(Times($s("B"),d,Plus(Times(c,e),Times(CN1,b,f))),Times($s("A"),Plus(Times(f,Plus(Times(b,e),Times(CN1,a,f))),Times(CN1,c,Plus(Sqr(e),Times(CN1,d,f))))),Times(f,Plus(Times($s("B"),Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,$s("A"),Plus(Times(c,e),Times(CN1,b,f)))),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(m,C1)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),p)),x)),Times(Power(Plus(Times(c,Plus(Times(c,Sqr(d)),Times(CN1,e,Plus(Times(b,d),Times(CN1,a,e))))),Times(CN1,Plus(Times(C2,a,c,d),Times(CN1,b,Plus(Times(b,d),Times(CN1,a,e)))),f),Times(Sqr(a),Sqr(f))),-1),Int(Times(Simp(Plus(Times(a,$s("B"),Plus(Times(c,e),Times(CN1,b,f))),Times($s("A"),Plus(Times(Sqr(b),f),Times(c,Plus(Times(c,d),Times(CN1,b,e),Times(CN1,a,f))))),Times(c,Plus(Times($s("B"),Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,$s("A"),Plus(Times(c,e),Times(CN1,b,f)))),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(p,C1))),x))),And(And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B")),x),RationalQ(m,p)),LessEqual(m,CN1)),LessEqual(p,CN1)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(Times(c,Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),Times(CN1,C2,a,c,d,f),Times(Sqr(a),Sqr(f))),-1),Int(Times(Simp(Plus(Times($s("B"),c,d,e),Times($s("A"),Plus(Times(CN1,a,Sqr(f)),Times(CN1,c,Plus(Sqr(e),Times(CN1,d,f))))),Times(f,Plus(Times($s("B"),Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,$s("A"),c,e)),x)),x),Power(Plus(a,Times(c,Sqr(x))),Plus(m,C1)),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),p)),x)),Times(Power(Plus(Times(c,Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),Times(CN1,C2,a,c,d,f),Times(Sqr(a),Sqr(f))),-1),Int(Times(Simp(Plus(Times(a,$s("B"),c,e),Times($s("A"),c,Plus(Times(c,d),Times(CN1,a,f))),Times(c,Plus(Times($s("B"),Plus(Times(c,d),Times(CN1,a,f))),Times(CN1,$s("A"),c,e)),x)),x),Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),Plus(p,C1))),x))),And(And(And(FreeQ(List(a,c,d,e,f,$s("A"),$s("B")),x),RationalQ(m,p)),LessEqual(m,CN1)),LessEqual(p,CN1)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(Times(Sqr(c),Sqr(d)),Times(CN1,Plus(Times(C2,a,c,d),Times(CN1,Sqr(b),d)),f),Times(Sqr(a),Sqr(f))),-1),Int(Times(Simp(Plus(Times(CN1,$s("B"),b,d,f),Times($s("A"),Plus(Times(CN1,a,Sqr(f)),Times(c,d,f))),Times(f,Plus(Times($s("B"),Plus(Times(c,d),Times(CN1,a,f))),Times($s("A"),b,f)),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(m,C1)),Power(Plus(d,Times(f,Sqr(x))),p)),x)),Times(Power(Plus(Times(Sqr(c),Sqr(d)),Times(CN1,Plus(Times(C2,a,c,d),Times(CN1,Sqr(b),d)),f),Times(Sqr(a),Sqr(f))),-1),Int(Times(Simp(Plus(Times(CN1,a,b,$s("B"),f),Times($s("A"),Plus(Times(Sqr(b),f),Times(c,Plus(Times(c,d),Times(CN1,a,f))))),Times(c,Plus(Times($s("B"),Plus(Times(c,d),Times(CN1,a,f))),Times($s("A"),b,f)),x)),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),m),Power(Plus(d,Times(f,Sqr(x))),Plus(p,C1))),x))),And(And(And(FreeQ(List(a,b,c,d,f,$s("A"),$s("B")),x),RationalQ(m,p)),LessEqual(m,CN1)),LessEqual(p,CN1)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(Times(Sqr(c),Sqr(d)),Times(CN1,C2,a,c,d,f),Times(Sqr(a),Sqr(f))),-1),Int(Times(Simp(Plus(Times($s("A"),Plus(Times(CN1,a,Sqr(f)),Times(c,d,f))),Times(f,$s("B"),Plus(Times(c,d),Times(CN1,a,f)),x)),x),Power(Plus(a,Times(c,Sqr(x))),Plus(m,C1)),Power(Plus(d,Times(f,Sqr(x))),p)),x)),Times(Power(Plus(Times(Sqr(c),Sqr(d)),Times(CN1,C2,a,c,d,f),Times(Sqr(a),Sqr(f))),-1),Int(Times(Simp(Plus(Times($s("A"),c,Plus(Times(c,d),Times(CN1,a,f))),Times(c,$s("B"),Plus(Times(c,d),Times(CN1,a,f)),x)),x),Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(f,Sqr(x))),Plus(p,C1))),x))),And(And(And(FreeQ(List(a,c,d,f,$s("A"),$s("B")),x),RationalQ(m,p)),LessEqual(m,CN1)),LessEqual(p,CN1)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("A"),Int(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),p)),x)),Times($s("B"),Int(Times(x,Power(Plus(a,Times(b,x),Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),p)),x))),FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B"),m,p),x))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("A"),Int(Times(Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),p)),x)),Times($s("B"),Int(Times(x,Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),p)),x))),FreeQ(List(a,c,d,e,f,$s("A"),$s("B"),m,p),x))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),x_)),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_,Times(f_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("A"),Int(Times(Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(f,Sqr(x))),p)),x)),Times($s("B"),Int(Times(x,Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(f,Sqr(x))),p)),x))),FreeQ(List(a,c,d,f,$s("A"),$s("B"),m,p),x))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),y_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,u_),Times(c_DEFAULT,Sqr(v_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,w_),Times(f_DEFAULT,Sqr(z_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),-1),Subst(Int(Times(Plus($s("A"),Times($s("B"),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),p)),x),x,u)),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,$s("A"),$s("B"),m,p),x),ZeroQ(Plus(u,Negate(v)))),ZeroQ(Plus(u,Negate(w)))),ZeroQ(Plus(u,Negate(z)))),ZeroQ(Plus(u,Negate(y)))),LinearQ(u,x)),NonzeroQ(Plus(u,Negate(x)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),u_)),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(v_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,w_),Times(f_DEFAULT,Sqr(z_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),-1),Subst(Int(Times(Plus($s("A"),Times($s("B"),x)),Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqr(x))),p)),x),x,u)),And(And(And(And(And(FreeQ(List(a,c,d,e,f,$s("A"),$s("B"),m,p),x),ZeroQ(Plus(u,Negate(v)))),ZeroQ(Plus(u,Negate(w)))),ZeroQ(Plus(u,Negate(z)))),LinearQ(u,x)),NonzeroQ(Plus(u,Negate(x)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),u_)),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(v_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(f_DEFAULT,Sqr(w_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),-1),Subst(Int(Times(Plus($s("A"),Times($s("B"),x)),Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(f,Sqr(x))),p)),x),x,u)),And(And(And(And(FreeQ(List(a,c,d,f,$s("A"),$s("B"),m,p),x),ZeroQ(Plus(u,Negate(v)))),ZeroQ(Plus(u,Negate(w)))),LinearQ(u,x)),NonzeroQ(Plus(u,Negate(x)))))),
ISetDelayed(Int(Times(z_,Power(u_,m_DEFAULT),Power(v_,p_DEFAULT)),x_Symbol),
    Condition(Int(Times(ExpandToSum(z,x),Power(ExpandToSum(u,x),m),Power(ExpandToSum(v,x),p)),x),And(And(And(FreeQ(List(m,p),x),LinearQ(z,x)),QuadraticQ(List(u,v),x)),Not(And(LinearMatchQ(z,x),QuadraticMatchQ(List(u,v),x))))))
  );
}
