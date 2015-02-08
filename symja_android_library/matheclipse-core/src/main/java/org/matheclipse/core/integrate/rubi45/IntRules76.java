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
public class IntRules76 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("C"),d,Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(b,f,Plus(m,n,C1)),-1)),Times(d,Power(Times(b,Plus(m,n,C1)),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(a,$s("C"),Plus(n,Negate(C1))),Times(Plus(Times($s("A"),b,Plus(m,n,C1)),Times(b,$s("C"),Plus(m,n))),Sec(Plus(e,Times(f,x)))),Times(Plus(Times(b,$s("B"),Plus(m,n,C1)),Times(CN1,a,$s("C"),n)),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,d,e,f,$s("A"),$s("B"),$s("C"),m),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Greater(n,C0)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,$s("C"),d,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(b,f,Plus(m,n,C1)),-1)),Times(d,Power(Times(b,Plus(m,n,C1)),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(a,$s("C"),Plus(n,Negate(C1))),Times(Plus(Times($s("A"),b,Plus(m,n,C1)),Times(b,$s("C"),Plus(m,n))),Csc(Plus(e,Times(f,x)))),Times(Plus(Times(b,$s("B"),Plus(m,n,C1)),Times(CN1,a,$s("C"),n)),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,d,e,f,$s("A"),$s("B"),$s("C"),m),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Greater(n,C0)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Times($s("C"),d,Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(b,f,Plus(m,n,C1)),-1)),Times(d,Power(Times(b,Plus(m,n,C1)),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(a,$s("C"),Plus(n,Negate(C1))),Times(Plus(Times($s("A"),b,Plus(m,n,C1)),Times(b,$s("C"),Plus(m,n))),Sec(Plus(e,Times(f,x)))),Times(CN1,a,$s("C"),n,Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,d,e,f,$s("A"),$s("C"),m),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Greater(n,C0)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Times(CN1,$s("C"),d,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(b,f,Plus(m,n,C1)),-1)),Times(d,Power(Times(b,Plus(m,n,C1)),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(a,$s("C"),Plus(n,Negate(C1))),Times(Plus(Times($s("A"),b,Plus(m,n,C1)),Times(b,$s("C"),Plus(m,n))),Csc(Plus(e,Times(f,x)))),Times(CN1,a,$s("C"),n,Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,d,e,f,$s("A"),$s("C"),m),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Greater(n,C0)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,$s("A"),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),-1)),Times(Power(Times(a,d,n),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(a,$s("B"),n),Times(CN1,$s("A"),b,Plus(m,n,C1)),Times(a,Plus($s("A"),Times($s("A"),n),Times($s("C"),n)),Sec(Plus(e,Times(f,x)))),Times($s("A"),b,Plus(m,n,C2),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,d,e,f,$s("A"),$s("B"),$s("C"),m),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),LessEqual(n,CN1)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times($s("A"),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),-1)),Times(Power(Times(a,d,n),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(a,$s("B"),n),Times(CN1,$s("A"),b,Plus(m,n,C1)),Times(a,Plus($s("A"),Times($s("A"),n),Times($s("C"),n)),Csc(Plus(e,Times(f,x)))),Times($s("A"),b,Plus(m,n,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,d,e,f,$s("A"),$s("B"),$s("C"),m),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),LessEqual(n,CN1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Times(CN1,$s("A"),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),-1)),Times(Power(Times(a,d,n),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(CN1,$s("A"),b,Plus(m,n,C1)),Times(a,Plus($s("A"),Times($s("A"),n),Times($s("C"),n)),Sec(Plus(e,Times(f,x)))),Times($s("A"),b,Plus(m,n,C2),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,d,e,f,$s("A"),$s("C"),m),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),LessEqual(n,CN1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Times($s("A"),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),-1)),Times(Power(Times(a,d,n),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(CN1,$s("A"),b,Plus(m,n,C1)),Times(a,Plus($s("A"),Times($s("A"),n),Times($s("C"),n)),Csc(Plus(e,Times(f,x)))),Times($s("A"),b,Plus(m,n,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,d,e,f,$s("A"),$s("C"),m),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),LessEqual(n,CN1)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Plus(Times(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))),Power(Times(Sqr(a),Sqr(d)),-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),-1)),x)),Times(Power(a,-2),Int(Times(Plus(Times(a,$s("A")),Times(CN1,Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Sec(Plus(e,Times(f,x))))),Power(Times(d,Sec(Plus(e,Times(f,x)))),CN1D2)),x))),And(FreeQ(List(a,b,d,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Plus(Times(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))),Power(Times(Sqr(a),Sqr(d)),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),-1)),x)),Times(Power(a,-2),Int(Times(Plus(Times(a,$s("A")),Times(CN1,Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Csc(Plus(e,Times(f,x))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x))),And(FreeQ(List(a,b,d,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Plus(Times(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))),Power(Times(Sqr(a),Sqr(d)),-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),-1)),x)),Times(Power(a,-2),Int(Times(Plus(Times(a,$s("A")),Times(CN1,$s("A"),b,Sec(Plus(e,Times(f,x))))),Power(Times(d,Sec(Plus(e,Times(f,x)))),CN1D2)),x))),And(FreeQ(List(a,b,d,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Plus(Times(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))),Power(Times(Sqr(a),Sqr(d)),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),-1)),x)),Times(Power(a,-2),Int(Times(Plus(Times(a,$s("A")),Times(CN1,$s("A"),b,Csc(Plus(e,Times(f,x))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x))),And(FreeQ(List(a,b,d,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Plus(Times($s("C"),Power(d,-2),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x)),Int(Times(Plus($s("A"),Times($s("B"),Sec(Plus(e,Times(f,x))))),Power(Times(Sqrt(Times(d,Sec(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))))),-1)),x)),And(FreeQ(List(a,b,d,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Plus(Times($s("C"),Power(d,-2),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x)),Int(Times(Plus($s("A"),Times($s("B"),Csc(Plus(e,Times(f,x))))),Power(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),-1)),x)),And(FreeQ(List(a,b,d,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Plus(Times($s("C"),Power(d,-2),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x)),Times($s("A"),Int(Power(Times(Sqrt(Times(d,Sec(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))))),-1),x))),And(FreeQ(List(a,b,d,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Plus(Times($s("C"),Power(d,-2),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x)),Times($s("A"),Int(Power(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))))),-1),x))),And(FreeQ(List(a,b,d,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),n),Plus($s("A"),Times($s("B"),Sec(Plus(e,Times(f,x)))),Times($s("C"),Sqr(Sec(Plus(e,Times(f,x))))))),x),And(FreeQ(List(a,b,d,e,f,$s("A"),$s("B"),$s("C"),m,n),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Plus($s("A"),Times($s("B"),Csc(Plus(e,Times(f,x)))),Times($s("C"),Sqr(Csc(Plus(e,Times(f,x))))))),x),And(FreeQ(List(a,b,d,e,f,$s("A"),$s("B"),$s("C"),m,n),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),n),Plus($s("A"),Times($s("C"),Sqr(Sec(Plus(e,Times(f,x))))))),x),And(FreeQ(List(a,b,d,e,f,$s("A"),$s("C"),m,n),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Plus($s("A"),Times($s("C"),Sqr(Csc(Plus(e,Times(f,x))))))),x),And(FreeQ(List(a,b,d,e,f,$s("A"),$s("C"),m,n),x),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b)))))))
  );
}
