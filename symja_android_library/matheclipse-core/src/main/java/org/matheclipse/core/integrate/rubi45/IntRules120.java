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
public class IntRules120 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n)),Times(CN1,b,c,n,Int(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x))),And(FreeQ(List(a,b,c),x),PositiveIntegerQ(n)))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n)),Times(CN1,b,c,n,Int(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x))),And(FreeQ(List(a,b,c),x),PositiveIntegerQ(n)))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_),x_Symbol),
    Condition($(Defer($s("Int")),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n),x),And(FreeQ(List(a,b,c,n),x),Not(PositiveIntegerQ(n))))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_),x_Symbol),
    Condition($(Defer($s("Int")),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n),x),And(FreeQ(List(a,b,c,n),x),Not(PositiveIntegerQ(n))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n),Log(Times(C2,d,Power(Plus(d,Times(e,x)),-1))),Power(e,-1)),Times(b,c,n,Power(e,-1),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,Negate(C1))),Log(Times(C2,d,Power(Plus(d,Times(e,x)),-1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x))),And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))))),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n),Log(Times(C2,d,Power(Plus(d,Times(e,x)),-1))),Power(e,-1)),Times(b,c,n,Power(e,-1),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,Negate(C1))),Log(Times(C2,d,Power(Plus(d,Times(e,x)),-1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x))),And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))))),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Times(a,Power(e,-1),Log(RemoveContent(Plus(d,Times(e,x)),x))),Times(C1D2,b,Int(Times(Log(Plus(C1,Times(c,x))),Power(Plus(d,Times(e,x)),-1)),x)),Times(CN1,C1D2,b,Int(Times(Log(Plus(C1,Times(CN1,c,x))),Power(Plus(d,Times(e,x)),-1)),x))),FreeQ(List(a,b,c,d,e),x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Times(a,Power(e,-1),Log(RemoveContent(Plus(d,Times(e,x)),x))),Times(C1D2,b,Int(Times(Log(Plus(C1,Power(Times(c,x),-1))),Power(Plus(d,Times(e,x)),-1)),x)),Times(CN1,C1D2,b,Int(Times(Log(Plus(C1,Negate(Power(Times(c,x),-1)))),Power(Plus(d,Times(e,x)),-1)),x))),FreeQ(List(a,b,c,d,e),x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,x)),Plus(p,C1)),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(e,Plus(p,C1)),-1)),Times(CN1,b,c,Power(Times(e,Plus(p,C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x))),And(FreeQ(List(a,b,c,d,e,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,x)),Plus(p,C1)),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(e,Plus(p,C1)),-1)),Times(CN1,b,c,Power(Times(e,Plus(p,C1)),-1),Int(Times(Power(Plus(d,Times(e,x)),Plus(p,C1)),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x))),And(FreeQ(List(a,b,c,d,e,p),x),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Power(x_,-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(C2,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n),ArcTanh(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,c,x)),-1))))),Times(CN1,C2,b,c,n,Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,Negate(C1))),ArcTanh(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,c,x)),-1)))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x))),And(And(FreeQ(List(a,b,c),x),IntegerQ(n)),Greater(n,C1)))),
ISetDelayed(Int(Times(Power(x_,-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(C2,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n),ArcCoth(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,c,x)),-1))))),Times(CN1,C2,b,c,n,Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,Negate(C1))),ArcCoth(Plus(C1,Times(CN1,C2,Power(Plus(C1,Times(CN1,c,x)),-1)))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x))),And(And(FreeQ(List(a,b,c),x),IntegerQ(n)),Greater(n,C1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n),Power(Plus(m,C1),-1)),Times(CN1,b,c,n,Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x))),And(And(And(FreeQ(List(a,b,c,m),x),IntegerQ(n)),Greater(n,C1)),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n),Power(Plus(m,C1),-1)),Times(CN1,b,c,n,Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x))),And(And(And(FreeQ(List(a,b,c,m),x),IntegerQ(n)),Greater(n,C1)),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),PositiveIntegerQ(n,p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),PositiveIntegerQ(n,p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(d,Times(e,x)),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n)),x),And(FreeQ(List(a,b,c,d,e,n,p),x),Not(PositiveIntegerQ(n))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(d,Times(e,x)),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n)),x),And(FreeQ(List(a,b,c,d,e,n,p),x),Not(PositiveIntegerQ(n))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Times(Power(e,-1),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n)),x)),Times(CN1,d,Power(e,-1),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n),Power(Plus(d,Times(e,x)),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))))),PositiveIntegerQ(n)),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Times(Power(e,-1),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n)),x)),Times(CN1,d,Power(e,-1),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n),Power(Plus(d,Times(e,x)),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))))),PositiveIntegerQ(n)),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Times(x_,Plus(d_,Times(e_DEFAULT,x_))),-1)),x_Symbol),
    Condition(Plus(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n),Log(Times(C2,e,x,Power(Plus(d,Times(e,x)),-1))),Power(d,-1)),Times(CN1,b,c,n,Power(d,-1),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,Negate(C1))),Log(Times(C2,e,x,Power(Plus(d,Times(e,x)),-1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x))),And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))))),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Times(x_,Plus(d_,Times(e_DEFAULT,x_))),-1)),x_Symbol),
    Condition(Plus(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n),Log(Times(C2,e,x,Power(Plus(d,Times(e,x)),-1))),Power(d,-1)),Times(CN1,b,c,n,Power(d,-1),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,Negate(C1))),Log(Times(C2,e,x,Power(Plus(d,Times(e,x)),-1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x))),And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))))),PositiveIntegerQ(n)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Times(Power(d,-1),Int(Times(Power(x,m),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n)),x)),Times(CN1,e,Power(d,-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n),Power(Plus(d,Times(e,x)),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))))),PositiveIntegerQ(n)),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Times(Power(d,-1),Int(Times(Power(x,m),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n)),x)),Times(CN1,e,Power(d,-1),Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n),Power(Plus(d,Times(e,x)),-1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),Sqr(d)),Negate(Sqr(e))))),PositiveIntegerQ(n)),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(d,Times(e,x)),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n)),x),x),And(And(And(FreeQ(List(a,b,c,d,e,m),x),IntegerQ(p)),PositiveIntegerQ(n)),Or(Or(Greater(p,C0),NonzeroQ(a)),IntegerQ(m))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(d,Times(e,x)),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n)),x),x),And(And(And(FreeQ(List(a,b,c,d,e,m),x),IntegerQ(p)),PositiveIntegerQ(n)),Or(Or(Greater(p,C0),NonzeroQ(a)),IntegerQ(m))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(d,Times(e,x)),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,m,n,p),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Plus(d,Times(e,x)),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,e,m,n,p),x))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(b,Power(Plus(d,Times(e,Sqr(x))),p),Power(Times(C2,c,p,Plus(Times(C2,p),C1)),-1)),Times(x,Power(Plus(d,Times(e,Sqr(x))),p),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Plus(Times(C2,p),C1),-1)),Times(C2,d,p,Power(Plus(Times(C2,p),C1),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1))),Plus(a,Times(b,ArcTanh(Times(c,x))))),x))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(p)),Greater(p,C0)))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(b,Power(Plus(d,Times(e,Sqr(x))),p),Power(Times(C2,c,p,Plus(Times(C2,p),C1)),-1)),Times(x,Power(Plus(d,Times(e,Sqr(x))),p),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Plus(Times(C2,p),C1),-1)),Times(C2,d,p,Power(Plus(Times(C2,p),C1),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1))),Plus(a,Times(b,ArcCoth(Times(c,x))))),x))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(p)),Greater(p,C0)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(b,n,Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(C2,c,p,Plus(Times(C2,p),C1)),-1)),Times(x,Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n),Power(Plus(Times(C2,p),C1),-1)),Times(C2,d,p,Power(Plus(Times(C2,p),C1),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n)),x)),Times(CN1,Sqr(b),d,n,Plus(n,Negate(C1)),Power(Times(C2,p,Plus(Times(C2,p),C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1))),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,Negate(C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(n,p)),Greater(p,C0)),Greater(n,C1)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(b,n,Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(C2,c,p,Plus(Times(C2,p),C1)),-1)),Times(x,Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n),Power(Plus(Times(C2,p),C1),-1)),Times(C2,d,p,Power(Plus(Times(C2,p),C1),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n)),x)),Times(CN1,Sqr(b),d,n,Plus(n,Negate(C1)),Power(Times(C2,p,Plus(Times(C2,p),C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1))),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,Negate(C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(n,p)),Greater(p,C0)),Greater(n,C1)))),
ISetDelayed(Int(Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),Plus(d_,Times(e_DEFAULT,Sqr(x_)))),-1),x_Symbol),
    Condition(Times(Log(RemoveContent(Plus(a,Times(b,ArcTanh(Times(c,x)))),x)),Power(Times(b,c,d),-1)),And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))))),
ISetDelayed(Int(Power(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),Plus(d_,Times(e_DEFAULT,Sqr(x_)))),-1),x_Symbol),
    Condition(Times(Log(RemoveContent(Plus(a,Times(b,ArcCoth(Times(c,x)))),x)),Power(Times(b,c,d),-1)),And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,d,Plus(n,C1)),-1)),And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),NonzeroQ(Plus(n,C1))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,d,Plus(n,C1)),-1)),And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),NonzeroQ(Plus(n,C1))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Times(CN2,Plus(a,Times(b,ArcTanh(Times(c,x)))),ArcTan(Times(Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),Times(CN1,CI,b,PolyLog(C2,Times(CN1,CI,Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),Times(CI,b,PolyLog(C2,Times(CI,Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1))),And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Times(CN2,Plus(a,Times(b,ArcCoth(Times(c,x)))),ArcTan(Times(Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),Times(CN1,CI,b,PolyLog(C2,Times(CN1,CI,Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1)),Times(CI,b,PolyLog(C2,Times(CI,Sqrt(Plus(C1,Times(CN1,c,x))),Power(Plus(C1,Times(c,x)),CN1D2))),Power(Times(c,Sqrt(d)),-1))),And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveQ(d)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Power(Times(c,Sqrt(d)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Sech(x)),x),x,ArcTanh(Times(c,x)))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveIntegerQ(n)),PositiveQ(d)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(CN1,x,Sqrt(Plus(C1,Negate(Power(Times(Sqr(c),Sqr(x)),-1)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Csch(x)),x),x,ArcCoth(Times(c,x)))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveIntegerQ(n)),PositiveQ(d)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x)),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveIntegerQ(n)),Not(PositiveQ(d))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),CN1D2)),x)),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),PositiveIntegerQ(n)),Not(PositiveQ(d))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2)),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n),Power(Times(C2,d,Plus(d,Times(e,Sqr(x)))),-1)),Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,C1)),Power(Times(C2,b,c,Sqr(d),Plus(n,C1)),-1)),Times(CN1,b,c,C1D2,n,Int(Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-2)),x))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(n)),Greater(n,C0)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-2)),x_Symbol),
    Condition(Plus(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n),Power(Times(C2,d,Plus(d,Times(e,Sqr(x)))),-1)),Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,C1)),Power(Times(C2,b,c,Sqr(d),Plus(n,C1)),-1)),Times(CN1,b,c,C1D2,n,Int(Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(d,Times(e,Sqr(x))),-2)),x))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(n)),Greater(n,C0)))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Times(c,d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),Times(x,Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1))),And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Times(c,d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),Times(x,Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1))),And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Times(C4,c,d,Sqr(Plus(p,C1))),-1)),Times(CN1,x,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcTanh(Times(c,x)))),Power(Times(C2,d,Plus(p,C1)),-1)),Times(Plus(Times(C2,p),C3),Power(Times(C2,d,Plus(p,C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcTanh(Times(c,x))))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(p)),Less(p,CN1)),Unequal(p,QQ(-3L,2L))))),
ISetDelayed(Int(Times(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Times(C4,c,d,Sqr(Plus(p,C1))),-1)),Times(CN1,x,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCoth(Times(c,x)))),Power(Times(C2,d,Plus(p,C1)),-1)),Times(Plus(Times(C2,p),C3),Power(Times(C2,d,Plus(p,C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Plus(a,Times(b,ArcCoth(Times(c,x))))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(p)),Less(p,CN1)),Unequal(p,QQ(-3L,2L))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Times(CN1,b,n,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(c,d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),Times(x,Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),Times(Sqr(b),n,Plus(n,Negate(C1)),Int(Times(Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),QQ(-3L,2L))),x))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(n)),Greater(n,C1)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Times(CN1,b,n,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(c,d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),Times(x,Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),Times(Sqr(b),n,Plus(n,Negate(C1)),Int(Times(Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,Negate(C2))),Power(Plus(d,Times(e,Sqr(x))),QQ(-3L,2L))),x))),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(n)),Greater(n,C1)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,b,n,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(C4,c,d,Sqr(Plus(p,C1))),-1)),Times(CN1,x,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n),Power(Times(C2,d,Plus(p,C1)),-1)),Times(Plus(Times(C2,p),C3),Power(Times(C2,d,Plus(p,C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n)),x)),Times(Sqr(b),n,Plus(n,Negate(C1)),Power(Times(C4,Sqr(Plus(p,C1))),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,Negate(C2)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(n,p)),Less(p,CN1)),Greater(n,C1)),Unequal(p,QQ(-3L,2L))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,b,n,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(C4,c,d,Sqr(Plus(p,C1))),-1)),Times(CN1,x,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n),Power(Times(C2,d,Plus(p,C1)),-1)),Times(Plus(Times(C2,p),C3),Power(Times(C2,d,Plus(p,C1)),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),n)),x)),Times(Sqr(b),n,Plus(n,Negate(C1)),Power(Times(C4,Sqr(Plus(p,C1))),-1),Int(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,Negate(C2)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(n,p)),Less(p,CN1)),Greater(n,C1)),Unequal(p,QQ(-3L,2L))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,d,Plus(n,C1)),-1)),Times(C2,c,Plus(p,C1),Power(Times(b,Plus(n,C1)),-1),Int(Times(x,Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(n,p)),Less(p,CN1)),Less(n,CN1)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,d,Plus(n,C1)),-1)),Times(C2,c,Plus(p,C1),Power(Times(b,Plus(n,C1)),-1),Int(Times(x,Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCoth(Times(c,x)))),Plus(n,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Times(Sqr(c),d),e))),RationalQ(n,p)),Less(p,CN1)),Less(n,CN1)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(Power(d,p),Power(c,-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Power(Cosh(x),Times(C2,Plus(p,C1))),-1)),x),x,ArcTanh(Times(c,x)))),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),NegativeIntegerQ(Times(C2,Plus(p,C1)))),Or(IntegerQ(p),PositiveQ(d))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcTanh(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(Power(d,Plus(p,C1D2)),Sqrt(Plus(C1,Times(CN1,Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2),Int(Times(Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),p),Power(Plus(a,Times(b,ArcTanh(Times(c,x)))),n)),x)),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),NegativeIntegerQ(Times(C2,Plus(p,C1)))),Not(Or(IntegerQ(p),PositiveQ(d)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(CN1,Power(Negate(d),p),Power(c,-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Power(Sinh(x),Times(C2,Plus(p,C1))),-1)),x),x,ArcCoth(Times(c,x)))),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),NegativeIntegerQ(Times(C2,Plus(p,C1)))),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCoth(Times(c_DEFAULT,x_)))),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(CN1,Power(Negate(d),Plus(p,C1D2)),x,Sqrt(Times(Plus(Times(Sqr(c),Sqr(x)),Negate(C1)),Power(Times(Sqr(c),Sqr(x)),-1))),Power(Plus(d,Times(e,Sqr(x))),CN1D2),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Power(Sinh(x),Times(C2,Plus(p,C1))),-1)),x),x,ArcCoth(Times(c,x)))),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(Times(Sqr(c),d),e))),NegativeIntegerQ(Times(C2,Plus(p,C1)))),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(ArcTanh(Times(c_DEFAULT,x_)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(Plus(C1,Times(c,x))),Power(Plus(d,Times(e,Sqr(x))),-1)),x)),Times(CN1,C1D2,Int(Times(Log(Plus(C1,Times(CN1,c,x))),Power(Plus(d,Times(e,Sqr(x))),-1)),x))),FreeQ(List(c,d,e),x))),
ISetDelayed(Int(Times(ArcCoth(Times(c_DEFAULT,x_)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Log(Plus(C1,Power(Times(c,x),-1))),Power(Plus(d,Times(e,Sqr(x))),-1)),x)),Times(CN1,C1D2,Int(Times(Log(Plus(C1,Negate(Power(Times(c,x),-1)))),Power(Plus(d,Times(e,Sqr(x))),-1)),x))),FreeQ(List(c,d,e),x)))
  );
}
