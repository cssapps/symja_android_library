package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;

import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
/** 
 * UtilityFunctions rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class UtilityFunctions3 { 
  public static IAST RULES = List( 
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Power($($s("§csc"),v_),n_DEFAULT))),-1),Power($($s("§csc"),v_),n_DEFAULT))),
    Condition(Times(u,Power(Plus(b,Times(a,Power(Sin(v),n))),-1)),And(PositiveIntegerQ(n),NonsumQ(a)))),
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Power($($s("§sec"),v_),n_DEFAULT))),-1),Power($($s("§tan"),v_),n_DEFAULT))),
    Condition(Times(u,Power(Sin(v),n),Power(Plus(b,Times(a,Power(Cos(v),n))),-1)),And(PositiveIntegerQ(n),NonsumQ(a)))),
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Power($($s("§csc"),v_),n_DEFAULT))),-1),Power($($s("§cot"),v_),n_DEFAULT))),
    Condition(Times(u,Power(Cos(v),n),Power(Plus(b,Times(a,Power(Sin(v),n))),-1)),And(PositiveIntegerQ(n),NonsumQ(a)))),
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power($($s("§sec"),v_),n_DEFAULT)),Times(b_DEFAULT,Power($($s("§tan"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(Times(u,Power(Sec(v),Times(n,p)),Power(Plus(a,Times(b,Power(Sin(v),n))),p)),IntegersQ(n,p))),
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(b_DEFAULT,Power($($s("§cot"),v_),n_DEFAULT)),Times(a_DEFAULT,Power($($s("§csc"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(Times(u,Power(Csc(v),Times(n,p)),Power(Plus(a,Times(b,Power(Cos(v),n))),p)),IntegersQ(n,p))),
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(b_DEFAULT,Power($($s("§sin"),v_),n_DEFAULT)),Times(a_DEFAULT,Power($($s("§tan"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(Times(u,Power(Tan(v),Times(n,p)),Power(Plus(a,Times(b,Power(Cos(v),n))),p)),IntegersQ(n,p))),
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(b_DEFAULT,Power($($s("§cos"),v_),n_DEFAULT)),Times(a_DEFAULT,Power($($s("§cot"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(Times(u,Power(Cot(v),Times(n,p)),Power(Plus(a,Times(b,Power(Sin(v),n))),p)),IntegersQ(n,p))),
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§tan"),v_),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sec"),v_),n_DEFAULT))),p_DEFAULT),Power($($s("§cos"),v_),m_DEFAULT))),
    Condition(Times(u,Power(Cos(v),Plus(m,Times(CN1,n,p))),Power(Plus(c,Times(b,Power(Sin(v),n)),Times(a,Power(Cos(v),n))),p)),IntegersQ(m,n,p))),
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§tan"),v_),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§sec"),v_),n_DEFAULT))),p_DEFAULT),Power($($s("§sec"),v_),m_DEFAULT))),
    Condition(Times(u,Power(Sec(v),Plus(m,Times(n,p))),Power(Plus(c,Times(b,Power(Sin(v),n)),Times(a,Power(Cos(v),n))),p)),IntegersQ(m,n,p))),
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§cot"),v_),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§csc"),v_),n_DEFAULT))),p_DEFAULT),Power($($s("§sin"),v_),m_DEFAULT))),
    Condition(Times(u,Power(Sin(v),Plus(m,Times(CN1,n,p))),Power(Plus(c,Times(b,Power(Cos(v),n)),Times(a,Power(Sin(v),n))),p)),IntegersQ(m,n,p))),
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power($($s("§cot"),v_),n_DEFAULT)),Times(c_DEFAULT,Power($($s("§csc"),v_),n_DEFAULT))),p_DEFAULT),Power($($s("§csc"),v_),m_DEFAULT))),
    Condition(Times(u,Power(Csc(v),Plus(m,Times(n,p))),Power(Plus(c,Times(b,Power(Cos(v),n)),Times(a,Power(Sin(v),n))),p)),IntegersQ(m,n,p))),
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power($($s("§csc"),v_),m_DEFAULT)),Times(b_DEFAULT,Power($($s("§sin"),v_),n_DEFAULT))),p_DEFAULT))),
    Condition(If(And(ZeroQ(Plus(m,n,Negate(C2))),ZeroQ(Plus(a,b))),Times(u,Power(Times(a,Sqr(Cos(v)),Power(Power(Sin(v),m),-1)),p)),Times(u,Power(Times(Plus(a,Times(b,Power(Sin(v),Plus(m,n)))),Power(Power(Sin(v),m),-1)),p))),IntegersQ(m,n))),
ISetDelayed(TrigSimplifyAux(Times(u_DEFAULT,Power(Plus(Times(b_DEFAULT,Power($($s("§cos"),v_),n_DEFAULT)),Times(a_DEFAULT,Power($($s("§sec"),v_),m_DEFAULT))),p_DEFAULT))),
    Condition(If(And(ZeroQ(Plus(m,n,Negate(C2))),ZeroQ(Plus(a,b))),Times(u,Power(Times(a,Sqr(Sin(v)),Power(Power(Cos(v),m),-1)),p)),Times(u,Power(Times(Plus(a,Times(b,Power(Cos(v),Plus(m,n)))),Power(Power(Cos(v),m),-1)),p))),IntegersQ(m,n))),
ISetDelayed(TrigSimplifyAux(u_),
    u),
ISetDelayed(RemoveContent($p("expn"),x_Symbol),
    Module(List(Set(u,NonfreeFactors(ContentFactor($s("expn")),x))),If(And(SumQ(u),NegQ(First(u))),Negate(u),u))),
ISetDelayed(ContentFactor($p("expn")),
    TimeConstrained(ContentFactorAux($s("expn")),$s("§timelimit"),$s("expn"))),
ISetDelayed(ContentFactorAux($p("expn")),
    If(AtomQ($s("expn")),$s("expn"),If(IntegerPowerQ($s("expn")),If(And(SumQ(Part($s("expn"),C1)),Less(NumericFactor(Part($s("expn"),C1,C1)),C0)),Times(Power(CN1,Part($s("expn"),C2)),Power(ContentFactorAux(Negate(Part($s("expn"),C1))),Part($s("expn"),C2))),Power(ContentFactorAux(Part($s("expn"),C1)),Part($s("expn"),C2))),If(ProductQ($s("expn")),Module(List(Set($s("num"),C1),$s("tmp")),CompoundExpression(Set($s("tmp"),Map(Function(If(And(SumQ(Slot1),Less(NumericFactor(Part(Slot1,C1)),C0)),CompoundExpression(Set($s("num"),Negate($s("num"))),ContentFactorAux(Negate(Slot1))),ContentFactorAux(Slot1))),$s("expn"))),Times($s("num"),UnifyNegativeBaseFactors($s("tmp"))))),If(SumQ($s("expn")),Module(List(Set($s("lst"),CommonFactors(Apply($s("List"),$s("expn"))))),If(Or(SameQ(Part($s("lst"),C1),C1),SameQ(Part($s("lst"),C1),CN1)),$s("expn"),Times(Part($s("lst"),C1),Apply(Plus,Rest($s("lst")))))),$s("expn")))))),
ISetDelayed(UnifyNegativeBaseFactors(Times(u_DEFAULT,Power(Negate(v_),m_),Power(v_,n_DEFAULT))),
    Condition(UnifyNegativeBaseFactors(Times(Power(CN1,n),u,Power(Negate(v),Plus(m,n)))),IntegerQ(n))),
ISetDelayed(UnifyNegativeBaseFactors(u_),
    u),
ISetDelayed(CommonFactors($p("lst")),
    Module(List($s("lst1"),$s("lst2"),$s("lst3"),$s("lst4"),$s("common"),$s("base"),$s("num")),CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set($s("lst1"),Map($s("Integrate::NonabsurdNumberFactors"),$s("lst"))),Set($s("lst2"),Map($s("Integrate::AbsurdNumberFactors"),$s("lst")))),Set($s("num"),Apply($s("Integrate::AbsurdNumberGCD"),$s("lst2")))),Set($s("common"),$s("num"))),Set($s("lst2"),Map(Function(Times(Slot1,Power($s("num"),-1))),$s("lst2")))),While(True,CompoundExpression(CompoundExpression(Set($s("lst3"),Map($s("Integrate::LeadFactor"),$s("lst1"))),If(Apply($s("SameQ"),$s("lst3")),CompoundExpression(Set($s("common"),Times($s("common"),Part($s("lst3"),C1))),Set($s("lst1"),Map($s("Integrate::RemainingFactors"),$s("lst1")))),If(And(MapAnd(Function(And(And(LogQ(Slot1),IntegerQ(First(Slot1))),Greater(First(Slot1),C0))),$s("lst3")),MapAnd($s("Integrate::RationalQ"),Set($s("lst4"),Map(Function(FullSimplify(Times(Slot1,Power(First($s("lst3")),-1)))),$s("lst3"))))),CompoundExpression(CompoundExpression(CompoundExpression(Set($s("num"),Apply($s("GCD"),$s("lst4"))),Set($s("common"),Times($s("common"),Log(Power(Part(First($s("lst3")),C1),$s("num")))))),Set($s("lst2"),Map2(Function(Times(Slot1,Slot2,Power($s("num"),-1))),$s("lst2"),$s("lst4")))),Set($s("lst1"),Map($s("Integrate::RemainingFactors"),$s("lst1")))),CompoundExpression(Set($s("lst4"),Map($s("Integrate::LeadDegree"),$s("lst1"))),If(And(Apply($s("SameQ"),Map($s("Integrate::LeadBase"),$s("lst1"))),MapAnd($s("Integrate::RationalQ"),$s("lst4"))),CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set($s("num"),Smallest($s("lst4"))),Set($s("base"),LeadBase(Part($s("lst1"),C1)))),If(Unequal($s("num"),C0),Set($s("common"),Times($s("common"),Power($s("base"),$s("num")))))),Set($s("lst2"),Map2(Function(Times(Slot1,Power($s("base"),Plus(Slot2,Negate($s("num")))))),$s("lst2"),$s("lst4")))),Set($s("lst1"),Map($s("Integrate::RemainingFactors"),$s("lst1")))),If(And(And(And(And(Equal(Length($s("lst1")),C2),ZeroQ(Plus(LeadBase(Part($s("lst1"),C1)),LeadBase(Part($s("lst1"),C2))))),NonzeroQ(Plus(Part($s("lst1"),C1),Negate(C1)))),IntegerQ(Part($s("lst4"),C1))),FractionQ(Part($s("lst4"),C2))),CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set($s("num"),Min($s("lst4"))),Set($s("base"),LeadBase(Part($s("lst1"),C2)))),If(Unequal($s("num"),C0),Set($s("common"),Times($s("common"),Power($s("base"),$s("num")))))),Set($s("lst2"),List(Times(Part($s("lst2"),C1),Power(CN1,Part($s("lst4"),C1))),Part($s("lst2"),C2)))),Set($s("lst2"),Map2(Function(Times(Slot1,Power($s("base"),Plus(Slot2,Negate($s("num")))))),$s("lst2"),$s("lst4")))),Set($s("lst1"),Map($s("Integrate::RemainingFactors"),$s("lst1")))),If(And(And(And(And(Equal(Length($s("lst1")),C2),ZeroQ(Plus(LeadBase(Part($s("lst1"),C1)),LeadBase(Part($s("lst1"),C2))))),NonzeroQ(Plus(Part($s("lst1"),C2),Negate(C1)))),IntegerQ(Part($s("lst4"),C2))),FractionQ(Part($s("lst4"),C1))),CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set($s("num"),Min($s("lst4"))),Set($s("base"),LeadBase(Part($s("lst1"),C1)))),If(Unequal($s("num"),C0),Set($s("common"),Times($s("common"),Power($s("base"),$s("num")))))),Set($s("lst2"),List(Part($s("lst2"),C1),Times(Part($s("lst2"),C2),Power(CN1,Part($s("lst4"),C2)))))),Set($s("lst2"),Map2(Function(Times(Slot1,Power($s("base"),Plus(Slot2,Negate($s("num")))))),$s("lst2"),$s("lst4")))),Set($s("lst1"),Map($s("Integrate::RemainingFactors"),$s("lst1")))),CompoundExpression(CompoundExpression(Set($s("num"),MostMainFactorPosition($s("lst3"))),Set($s("lst2"),ReplacePart($s("lst2"),Times(Part($s("lst3"),$s("num")),Part($s("lst2"),$s("num"))),$s("num")))),Set($s("lst1"),ReplacePart($s("lst1"),RemainingFactors(Part($s("lst1"),$s("num"))),$s("num"))))))))))),If(MapAnd(Function(SameQ(Slot1,C1)),$s("lst1")),Return(Prepend($s("lst2"),$s("common"))))))))),
ISetDelayed(MostMainFactorPosition($p("lst",$s("List"))),
    Module(List(Set($s("§factor"),C1),Set($s("num"),C1),i),CompoundExpression(Do(If(Greater(FactorOrder(Part($s("lst"),i),$s("§factor")),C0),CompoundExpression(Set($s("§factor"),Part($s("lst"),i)),Set($s("num"),i))),List(i,Length($s("lst")))),$s("num")))),
ISetDelayed(FactorOrder(u_,v_),
    If(SameQ(u,C1),If(SameQ(v,C1),C0,CN1),If(SameQ(v,C1),C1,Order(u,v)))),
ISetDelayed(Smallest($p("num1"),$p("num2")),
    If(Greater($s("num1"),C0),If(Greater($s("num2"),C0),Min($s("num1"),$s("num2")),C0),If(Greater($s("num2"),C0),C0,Max($s("num1"),$s("num2"))))),
ISetDelayed(Smallest($p("lst",$s("List"))),
    Module(List(Set($s("num"),Part($s("lst"),C1))),CompoundExpression(Scan(Function(Set($s("num"),Smallest($s("num"),Slot1))),Rest($s("lst"))),$s("num")))),
ISetDelayed(MonomialFactor(u_,x_Symbol),
    If(AtomQ(u),If(SameQ(u,x),List(C1,C1),List(C0,u)),If(PowerQ(u),If(IntegerQ(Part(u,C2)),Module(List(Set($s("lst"),MonomialFactor(Part(u,C1),x))),List(Times(Part($s("lst"),C1),Part(u,C2)),Power(Part($s("lst"),C2),Part(u,C2)))),If(And(SameQ(Part(u,C1),x),FreeQ(Part(u,C2),x)),List(Part(u,C2),C1),List(C0,u))),If(ProductQ(u),Module(List(Set($s("lst1"),MonomialFactor(First(u),x)),Set($s("lst2"),MonomialFactor(Rest(u),x))),List(Plus(Part($s("lst1"),C1),Part($s("lst2"),C1)),Times(Part($s("lst1"),C2),Part($s("lst2"),C2)))),If(SumQ(u),Module(List($s("lst"),$s("deg")),CompoundExpression(CompoundExpression(CompoundExpression(Set($s("lst"),Map(Function(MonomialFactor(Slot1,x)),Apply($s("List"),u))),Set($s("deg"),Part($s("lst"),C1,C1))),Scan(Function(Set($s("deg"),MinimumDegree($s("deg"),Part(Slot1,C1)))),Rest($s("lst")))),If(Or(ZeroQ($s("deg")),And(RationalQ($s("deg")),Less($s("deg"),C0))),List(C0,u),List($s("deg"),Apply(Plus,Map(Function(Times(Power(x,Plus(Part(Slot1,C1),Negate($s("deg")))),Part(Slot1,C2))),$s("lst"))))))),List(C0,u)))))),
ISetDelayed(MinimumDegree($p("deg1"),$p("deg2")),
    If(RationalQ($s("deg1")),If(RationalQ($s("deg2")),Min($s("deg1"),$s("deg2")),$s("deg1")),If(RationalQ($s("deg2")),$s("deg2"),Module(List(Set($s("deg"),Simplify(Plus($s("deg1"),Negate($s("deg2")))))),If(RationalQ($s("deg")),If(Greater($s("deg"),C0),$s("deg2"),$s("deg1")),If(OrderedQ(List($s("deg1"),$s("deg2"))),$s("deg1"),$s("deg2"))))))),
ISetDelayed(ConstantFactor(u_,x_Symbol),
    If(FreeQ(u,x),List(u,C1),If(AtomQ(u),List(C1,u),If(And(PowerQ(u),FreeQ(Part(u,C2),x)),Module(List(Set($s("lst"),ConstantFactor(Part(u,C1),x)),$s("tmp")),If(IntegerQ(Part(u,C2)),List(Power(Part($s("lst"),C1),Part(u,C2)),Power(Part($s("lst"),C2),Part(u,C2))),CompoundExpression(Set($s("tmp"),PositiveFactors(Part($s("lst"),C1))),If(SameQ($s("tmp"),C1),List(C1,u),List(Power($s("tmp"),Part(u,C2)),Power(Times(NonpositiveFactors(Part($s("lst"),C1)),Part($s("lst"),C2)),Part(u,C2))))))),If(ProductQ(u),Module(List(Set($s("lst"),Map(Function(ConstantFactor(Slot1,x)),Apply($s("List"),u)))),List(Apply(Times,Map($s("First"),$s("lst"))),Apply(Times,Map(Function(Part(Slot1,C2)),$s("lst"))))),If(SumQ(u),Module(List(Set($s("lst1"),Map(Function(ConstantFactor(Slot1,x)),Apply($s("List"),u)))),If(Apply($s("SameQ"),Map(Function(Part(Slot1,C2)),$s("lst1"))),List(Apply(Plus,Map($s("First"),$s("lst1"))),Part($s("lst1"),C1,C2)),Module(List(Set($s("lst2"),CommonFactors(Map($s("First"),$s("lst1"))))),List(First($s("lst2")),Apply(Plus,Map2(Times,Rest($s("lst2")),Map(Function(Part(Slot1,C2)),$s("lst1")))))))),List(C1,u))))))),
ISetDelayed(PositiveFactors(u_),
    If(ZeroQ(u),C1,If(RationalQ(u),Abs(u),If(PositiveQ(u),u,If(ProductQ(u),Map($s("Integrate::PositiveFactors"),u),C1))))),
ISetDelayed(NonpositiveFactors(u_),
    If(ZeroQ(u),u,If(RationalQ(u),Sign(u),If(PositiveQ(u),C1,If(ProductQ(u),Map($s("Integrate::NonpositiveFactors"),u),u))))),
ISetDelayed(PolynomialInQ(u_,v_,x_Symbol),
    PolynomialInAuxQ(u,NonfreeFactors(NonfreeTerms(v,x),x),x)),
ISetDelayed(PolynomialInAuxQ(u_,v_,x_),
    If(SameQ(u,v),True,If(AtomQ(u),UnsameQ(u,x),If(PowerQ(u),If(And(PowerQ(v),SameQ(Part(u,C1),Part(v,C1))),PositiveIntegerQ(Times(Part(u,C2),Power(Part(v,C2),-1))),And(PositiveIntegerQ(Part(u,C2)),PolynomialInAuxQ(Part(u,C1),v,x))),If(Or(SumQ(u),ProductQ(u)),Catch(CompoundExpression(Scan(Function(If(Not(PolynomialInAuxQ(Slot1,v,x)),Throw(False))),u),True)),False))))),
ISetDelayed(ExponentIn(u_,v_,x_Symbol),
    ExponentInAux(u,NonfreeFactors(NonfreeTerms(v,x),x),x)),
ISetDelayed(ExponentInAux(u_,v_,x_),
    If(SameQ(u,v),C1,If(AtomQ(u),C0,If(PowerQ(u),If(And(PowerQ(v),SameQ(Part(u,C1),Part(v,C1))),Times(Part(u,C2),Power(Part(v,C2),-1)),Times(Part(u,C2),ExponentInAux(Part(u,C1),v,x))),If(ProductQ(u),Apply(Plus,Map(Function(ExponentInAux(Slot1,v,x)),Apply($s("List"),u))),Apply($s("Max"),Map(Function(ExponentInAux(Slot1,v,x)),Apply($s("List"),u)))))))),
ISetDelayed(PolynomialInSubst(u_,v_,x_Symbol),
    Module(List(Set(w,NonfreeTerms(v,x))),ReplaceAll(PolynomialInSubstAux(u,NonfreeFactors(w,x),x),List(Rule(x,Times(Plus(x,Negate(FreeTerms(v,x))),Power(FreeFactors(w,x),-1))))))),
ISetDelayed(PolynomialInSubstAux(u_,v_,x_),
    If(SameQ(u,v),x,If(AtomQ(u),u,If(PowerQ(u),If(And(PowerQ(v),SameQ(Part(u,C1),Part(v,C1))),Power(x,Times(Part(u,C2),Power(Part(v,C2),-1))),Power(PolynomialInSubstAux(Part(u,C1),v,x),Part(u,C2))),Map(Function(PolynomialInSubstAux(Slot1,v,x)),u))))),
ISetDelayed(PolynomialDivide(u_,v_,x_Symbol),
    Module(List(Set($s("quo"),PolynomialQuotient(u,v,x)),Set($s("rem"),PolynomialRemainder(u,v,x)),$s("free"),$s("monomial")),CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set($s("quo"),Apply(Plus,Map(Function(Simp(Together(Times(Coefficient($s("quo"),x,Slot1),Power(x,Slot1))),x)),Exponent($s("quo"),x,$s("List"))))),Set($s("rem"),Together($s("rem")))),Set($s("free"),FreeFactors($s("rem"),x))),Set($s("rem"),NonfreeFactors($s("rem"),x))),Set($s("monomial"),Power(x,Exponent($s("rem"),x,$s("Min"))))),If(NegQ(Coefficient($s("rem"),x,C0)),Set($s("monomial"),Negate($s("monomial"))))),Set($s("rem"),Apply(Plus,Map(Function(Simp(Together(Times(Coefficient($s("rem"),x,Slot1),Power(x,Slot1),Power($s("monomial"),-1))),x)),Exponent($s("rem"),x,$s("List")))))),If(BinomialQ(v,x),Plus($s("quo"),Times($s("free"),$s("monomial"),$s("rem"),Power(ExpandToSum(v,x),-1))),Plus($s("quo"),Times($s("free"),$s("monomial"),$s("rem"),Power(v,-1))))))),
ISetDelayed(PolynomialDivide(u_,v_,w_,x_Symbol),
    ReplaceAll(PolynomialDivide(PolynomialInSubst(u,w,x),PolynomialInSubst(v,w,x),x),List(Rule(x,w)))),
ISetDelayed(ExpandToSum(u_,v_,x_Symbol),
    Module(List(Set(w,ExpandToSum(v,x)),r),CompoundExpression(Set(r,NonfreeTerms(w,x)),If(SumQ(r),Plus(Times(u,FreeTerms(w,x)),Map(Function(MergeMonomials(Times(u,Slot1),x)),r)),Plus(Times(u,FreeTerms(w,x)),MergeMonomials(Times(u,r),x)))))),
ISetDelayed(ExpandToSum(u_,x_Symbol),
    If(PolynomialQ(u,x),Apply(Plus,Map(Function(Times(Coefficient(u,x,Slot1),Power(x,Slot1))),Exponent(u,x,$s("List")))),If(BinomialQ(u,x),$(Function(Plus(Part(Slot1,C1),Times(Part(Slot1,C2),Power(x,Part(Slot1,C3))))),BinomialTest(u,x)),If(TrinomialQ(u,x),$(Function(Plus(Part(Slot1,C1),Times(Part(Slot1,C2),Power(x,Part(Slot1,C4))),Times(Part(Slot1,C3),Power(x,Times(C2,Part(Slot1,C4)))))),TrinomialTest(u,x)),If(GeneralizedBinomialQ(u,x),$(Function(Plus(Times(Part(Slot1,C1),Power(x,Part(Slot1,C4))),Times(Part(Slot1,C2),Power(x,Part(Slot1,C3))))),GeneralizedBinomialTest(u,x)),If(GeneralizedTrinomialQ(u,x),$(Function(Plus(Times(Part(Slot1,C1),Power(x,Part(Slot1,C5))),Times(Part(Slot1,C2),Power(x,Part(Slot1,C4))),Times(Part(Slot1,C3),Power(x,Plus(Times(C2,Part(Slot1,C4)),Negate(Part(Slot1,C5))))))),GeneralizedTrinomialTest(u,x)),CompoundExpression(Print(stringx("Warning: Unrecognized expression for expansion "),u),Expand(u,x)))))))),
ISetDelayed(ExpandTrig(u_,x_Symbol),
    ActivateTrig(ExpandIntegrand(u,x))),
ISetDelayed(ExpandTrig(u_,v_,x_Symbol),
    Module(List(Set(w,ExpandTrig(v,x)),Set(z,ActivateTrig(u))),If(SumQ(w),Map(Function(Times(z,Slot1)),w),Times(z,w)))),
ISetDelayed(ExpandIntegrand(u_,v_,x_Symbol),
    Module(List(Set(w,ExpandIntegrand(v,x)),r),CompoundExpression(Set(r,NonfreeTerms(w,x)),If(SumQ(r),Plus(Times(u,FreeTerms(w,x)),Map(Function(MergeMonomials(Times(u,Slot1),x)),r)),Plus(Times(u,FreeTerms(w,x)),MergeMonomials(Times(u,r),x)))))),
ISetDelayed(ExpandIntegrand(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Power(f_,Times(e_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Module(List(Set($s("tmp"),Plus(Times(a,h),Times(CN1,b,g)))),Plus(Times(SimplifyTerm(Times(Power($s("tmp"),m),Power(Power(h,m),-1)),x),Power(f,Times(e,Power(Plus(c,Times(d,x)),n))),Power(Plus(g,Times(h,x)),-1)),Sum(Times(SimplifyTerm(Times(b,Power($s("tmp"),Plus(k,Negate(C1))),Power(Power(h,k),-1)),x),Power(f,Times(e,Power(Plus(c,Times(d,x)),n))),Power(Plus(a,Times(b,x)),Plus(m,Negate(k)))),List(k,C1,m)))),And(And(FreeQ(List(a,b,c,d,e,f,g,h),x),PositiveIntegerQ(m)),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
ISetDelayed(ExpandIntegrand(Times(Power(x_,m_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,x_)),p_DEFAULT),Power($p("F"),Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT)))),x_Symbol),
    Condition(If(And(And(PositiveIntegerQ(m,p),LessEqual(m,p)),Or(OneQ(n),ZeroQ(Plus(Times(d,e),Times(CN1,c,f))))),ExpandLinearProduct(Times(Power(Plus(e,Times(f,x)),p),Power($s("F"),Times(b,Power(Plus(c,Times(d,x)),n)))),Power(x,m),e,f,x),If(PositiveIntegerQ(p),Distribute(Times(Power(x,m),Power($s("F"),Times(b,Power(Plus(c,Times(d,x)),n))),Expand(Power(Plus(e,Times(f,x)),p),x)),Plus,Times),ExpandIntegrand(Power($s("F"),Times(b,Power(Plus(c,Times(d,x)),n))),Times(Power(x,m),Power(Plus(e,Times(f,x)),p)),x))),FreeQ(List($s("F"),b,c,d,e,f,m,n,p),x))),
ISetDelayed(ExpandIntegrand(Times(Power(x_,m_DEFAULT),Power(Plus(e_,Times(f_DEFAULT,x_)),p_DEFAULT),Power($p("F"),Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT))))),x_Symbol),
    Condition(If(And(And(PositiveIntegerQ(m,p),LessEqual(m,p)),Or(OneQ(n),ZeroQ(Plus(Times(d,e),Times(CN1,c,f))))),ExpandLinearProduct(Times(Power(Plus(e,Times(f,x)),p),Power($s("F"),Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),Power(x,m),e,f,x),If(PositiveIntegerQ(p),Distribute(Times(Power(x,m),Power($s("F"),Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Expand(Power(Plus(e,Times(f,x)),p),x)),Plus,Times),ExpandIntegrand(Power($s("F"),Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Times(Power(x,m),Power(Plus(e,Times(f,x)),p)),x))),FreeQ(List($s("F"),a,b,c,d,e,f,m,n,p),x))),
ISetDelayed(ExpandIntegrand(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Power($p("F"),v_))),m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Power($p("F"),v_))),n_)),x_Symbol),
    Condition(Module(List(Set(w,ReplaceAll(ExpandIntegrand(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n)),x),Rule(x,Power($s("F"),v))))),Condition(Map(Function(Times(u,Slot1)),w),SumQ(w))),And(And(FreeQ(List($s("F"),a,b,c,d),x),IntegersQ(m,n)),Less(n,C0)))),
ISetDelayed(ExpandIntegrand(Times(u_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Power(f_,Times(e_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT)))),x_Symbol),
    Condition(Module(List(Set(v,ExpandIntegrand(Times(u,Power(Plus(a,Times(b,x)),m)),x))),Condition(Distribute(Times(Power(f,Times(e,Power(Plus(c,Times(d,x)),n))),v),Plus,Times),SumQ(v))),And(FreeQ(List(a,b,c,d,e,f,m,n),x),PolynomialQ(u,x)))),
ISetDelayed(ExpandIntegrand(Times(u_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),m_DEFAULT),Log(Times(c_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)))),x_Symbol),
    Condition(ExpandIntegrand(Log(Times(c,Power(Plus(d,Times(e,Power(x,n))),p))),Times(u,Power(Plus(a,Times(b,x)),m)),x),And(FreeQ(List(a,b,c,d,e,m,n,p),x),PolynomialQ(u,x)))),
ISetDelayed(ExpandIntegrand(Times(u_,Power(f_,Times(e_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_DEFAULT)))),x_Symbol),
    Condition(If(OneQ(n),ExpandIntegrand(Power(f,Times(e,Power(Plus(c,Times(d,x)),n))),u,x),ExpandLinearProduct(Power(f,Times(e,Power(Plus(c,Times(d,x)),n))),u,c,d,x)),And(FreeQ(List(c,d,e,f,n),x),PolynomialQ(u,x)))),
ISetDelayed(ExpandIntegrand(Times(Power(Plus(a_,Times(b_DEFAULT,$($p("G"),u_))),n_DEFAULT),Power($($p("F"),u_),m_DEFAULT)),x_Symbol),
    Condition(ReplaceAll(ExpandIntegrand(Times(Power(Plus(a,Times(b,x)),n),Power(Power(x,m),-1)),x),Rule(x,G(u))),And(And(FreeQ(List(a,b),x),IntegersQ(m,n)),SameQ(Times(F(u),G(u)),C1)))),
ISetDelayed(ExpandIntegrand(Times(u_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))))),p_)),x_Symbol),
    Condition(ExpandLinearProduct(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),u,d,e,x),And(FreeQ(List(a,b,c,d,e,n,p),x),PolynomialQ(u,x)))),
ISetDelayed(ExpandIntegrand(Times(u_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($p("F"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(ExpandLinearProduct(Power(Plus(a,Times(b,F(Plus(c,Times(d,x))))),n),u,c,d,x),And(And(FreeQ(List(a,b,c,d,n),x),PolynomialQ(u,x)),MemberQ(List($s("ArcSin"),$s("ArcCos"),$s("ArcSinh"),$s("ArcCosh")),$s("F"))))),
ISetDelayed(ExpandIntegrand(Times(u_DEFAULT,Power(Plus(Times(a_DEFAULT,Power(x_,n_)),Times(b_DEFAULT,Sqrt(Plus(c_,Times(d_DEFAULT,Power(x_,j_)))))),-1)),x_Symbol),
    Condition(ExpandIntegrand(Times(u,Plus(Times(a,Power(x,n)),Times(CN1,b,Sqrt(Plus(c,Times(d,Power(x,Times(C2,n))))))),Power(Plus(Times(CN1,Sqr(b),c),Times(Plus(Sqr(a),Times(CN1,Sqr(b),d)),Power(x,Times(C2,n)))),-1)),x),And(FreeQ(List(a,b,c,d,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))))),
ISetDelayed(ExpandIntegrand(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),m_),Power(Plus(c_,Times(d_DEFAULT,x_)),-1)),x_Symbol),
    Condition(If(RationalQ(a,b,c,d),ExpandExpression(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),-1)),x),Module(List(Set($s("tmp"),Plus(Times(a,d),Times(CN1,b,c)))),Plus(Times(SimplifyTerm(Times(Power($s("tmp"),m),Power(Power(d,m),-1)),x),Power(Plus(c,Times(d,x)),-1)),Sum(Times(SimplifyTerm(Times(b,Power($s("tmp"),Plus(k,Negate(C1))),Power(Power(d,k),-1)),x),Power(Plus(a,Times(b,x)),Plus(m,Negate(k)))),List(k,C1,m))))),And(FreeQ(List(a,b,c,d),x),PositiveIntegerQ(m)))),
ISetDelayed(ExpandIntegrand(Times(Power(Plus(a_,Times(b_DEFAULT,x_)),m_DEFAULT),Plus($p("A"),Times($p("B",true),x_)),Power(Plus(c_,Times(d_DEFAULT,x_)),-1)),x_Symbol),
    Condition(If(RationalQ(a,b,c,d,$s("A"),$s("B")),ExpandExpression(Times(Power(Plus(a,Times(b,x)),m),Plus($s("A"),Times($s("B"),x)),Power(Plus(c,Times(d,x)),-1)),x),Module(List($s("tmp1"),$s("tmp2")),CompoundExpression(CompoundExpression(CompoundExpression(Set($s("tmp1"),Times(Plus(Times($s("A"),d),Times(CN1,$s("B"),c)),Power(d,-1))),Set($s("tmp2"),ExpandIntegrand(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),-1)),x))),Set($s("tmp2"),If(SumQ($s("tmp2")),Map(Function(SimplifyTerm(Times($s("tmp1"),Slot1),x)),$s("tmp2")),SimplifyTerm(Times($s("tmp1"),$s("tmp2")),x)))),Plus(Times(SimplifyTerm(Times($s("B"),Power(d,-1)),x),Power(Plus(a,Times(b,x)),m)),$s("tmp2"))))),And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),PositiveIntegerQ(m)))),
ISetDelayed(ExpandIntegrand(Times(u_,Power(Plus(a_,Times(b_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Module(List($s("tmp1"),$s("tmp2")),CompoundExpression(Set($s("tmp1"),ExpandLinearProduct(Power(Plus(a,Times(b,x)),m),u,a,b,x)),If(Not(IntegerQ(m)),$s("tmp1"),CompoundExpression(Set($s("tmp2"),ExpandExpression(Times(u,Power(Plus(a,Times(b,x)),m)),x)),If(And(SumQ($s("tmp2")),LessEqual(LeafCount($s("tmp2")),Plus(LeafCount($s("tmp1")),C2))),$s("tmp2"),$s("tmp1")))))),And(And(FreeQ(List(a,b,m),x),PolynomialQ(u,x)),Not(And(PositiveIntegerQ(m),MatchQ(u,Condition(Times(w_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x)),p_)),And(And(FreeQ(List(c,d),x),IntegerQ(p)),Greater(p,m))))))))),
ISetDelayed(ExpandIntegrand(Times(u_,Power(v_,n_),Power(Plus(a_,Times(b_DEFAULT,x_)),m_)),x_Symbol),
    Condition($(Function(Plus(ExpandIntegrand(Times(Part(Slot1,C1),Power(Plus(a,Times(b,x)),FractionalPart(m))),x),ExpandIntegrand(Times(Part(Slot1,C2),Power(v,n),Power(Plus(a,Times(b,x)),m)),x))),PolynomialQuotientRemainder(u,Times(Power(v,Negate(n)),Power(Plus(a,Times(b,x)),Negate(IntegerPart(m)))),x)),And(And(And(And(And(And(And(FreeQ(List(a,b,m),x),NegativeIntegerQ(n)),Not(IntegerQ(m))),PolynomialQ(u,x)),PolynomialQ(v,x)),RationalQ(m)),Less(m,CN1)),GreaterEqual(Exponent(u,x),Times(CN1,Plus(n,IntegerPart(m)),Exponent(v,x)))))),
ISetDelayed(ExpandIntegrand(Times(u_,Power(v_,n_),Power(Plus(a_,Times(b_DEFAULT,x_)),m_)),x_Symbol),
    Condition($(Function(Plus(ExpandIntegrand(Times(Part(Slot1,C1),Power(Plus(a,Times(b,x)),m)),x),ExpandIntegrand(Times(Part(Slot1,C2),Power(v,n),Power(Plus(a,Times(b,x)),m)),x))),PolynomialQuotientRemainder(u,Power(v,Negate(n)),x)),And(And(And(And(And(FreeQ(List(a,b,m),x),NegativeIntegerQ(n)),Not(IntegerQ(m))),PolynomialQ(u,x)),PolynomialQ(v,x)),GreaterEqual(Exponent(u,x),Times(CN1,n,Exponent(v,x)))))),
ISetDelayed(ExpandIntegrand(Power(Plus(a_,Times(b_DEFAULT,Power(u_,n_))),-1),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,-1)),C2))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,-1)),C2)))),Plus(Times(r,Power(Times(C2,a,Plus(r,Times(CN1,s,Power(u,Times(C1D2,n))))),-1)),Times(r,Power(Times(C2,a,Plus(r,Times(s,Power(u,Times(C1D2,n))))),-1)))),And(FreeQ(List(a,b),x),PositiveIntegerQ(Times(C1D4,n))))),
ISetDelayed(ExpandIntegrand(Power(Plus(a_,Times(b_DEFAULT,Power(u_,n_))),-1),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,-1)),n))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,-1)),n)))),Sum(Times(r,Power(Times(a,n,Plus(r,Times(CN1,Power(CN1,Times(C2,k,Power(n,-1))),s,u))),-1)),List(k,C1,n))),And(And(FreeQ(List(a,b),x),IntegerQ(n)),Greater(n,C1)))),
ISetDelayed(ExpandIntegrand(Times(Power(u_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(u_,n_))),-1)),x_Symbol),
    Condition(Module(List(Set(g,GCD(m,n)),Set(r,Numerator(Rt(Times(a,Power(b,-1)),Times(n,Power(GCD(m,n),-1))))),Set(s,Denominator(Rt(Times(a,Power(b,-1)),Times(n,Power(GCD(m,n),-1)))))),If(CoprimeQ(Plus(m,g),n),Sum(Times(r,Power(Times(CN1,r,Power(s,-1)),Times(m,Power(g,-1))),Power(CN1,Times(CN2,k,m,Power(n,-1))),Power(Times(a,n,Plus(r,Times(Power(CN1,Times(C2,k,g,Power(n,-1))),s,Power(u,g)))),-1)),List(k,C1,Times(n,Power(g,-1)))),Sum(Times(r,Power(Times(CN1,r,Power(s,-1)),Times(m,Power(g,-1))),Power(CN1,Times(C2,k,Plus(m,g),Power(n,-1))),Power(Times(a,n,Plus(Times(Power(CN1,Times(C2,k,g,Power(n,-1))),r),Times(s,Power(u,g)))),-1)),List(k,C1,Times(n,Power(g,-1)))))),And(And(And(And(FreeQ(List(a,b),x),IntegersQ(m,n)),Less(Less(C0,m),n)),OddQ(Times(n,Power(GCD(m,n),-1)))),PosQ(Times(a,Power(b,-1)))))),
ISetDelayed(ExpandIntegrand(Times(Power(u_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(u_,n_))),-1)),x_Symbol),
    Condition(Module(List(Set(g,GCD(m,n)),Set(r,Numerator(Rt(Times(CN1,a,Power(b,-1)),Times(n,Power(GCD(m,n),-1))))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,-1)),Times(n,Power(GCD(m,n),-1)))))),If(Equal(Times(n,Power(g,-1)),C2),Plus(Times(s,Power(Times(C2,b,Plus(r,Times(s,Power(u,g)))),-1)),Times(CN1,s,Power(Times(C2,b,Plus(r,Times(CN1,s,Power(u,g)))),-1))),If(CoprimeQ(Plus(m,g),n),Sum(Times(r,Power(Times(r,Power(s,-1)),Times(m,Power(g,-1))),Power(CN1,Times(CN2,k,m,Power(n,-1))),Power(Times(a,n,Plus(r,Times(CN1,Power(CN1,Times(C2,k,g,Power(n,-1))),s,Power(u,g)))),-1)),List(k,C1,Times(n,Power(g,-1)))),Sum(Times(r,Power(Times(r,Power(s,-1)),Times(m,Power(g,-1))),Power(CN1,Times(C2,k,Plus(m,g),Power(n,-1))),Power(Times(a,n,Plus(Times(Power(CN1,Times(C2,k,g,Power(n,-1))),r),Times(CN1,s,Power(u,g)))),-1)),List(k,C1,Times(n,Power(g,-1))))))),And(And(FreeQ(List(a,b),x),IntegersQ(m,n)),Less(Less(C0,m),n)))),
ISetDelayed(ExpandIntegrand(Times(Plus(c_,Times(d_DEFAULT,Power(u_,m_DEFAULT))),Power(Plus(a_,Times(b_DEFAULT,Power(u_,n_))),-1)),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,-1)),n))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,-1)),n)))),Sum(Times(Plus(Times(r,c),Times(r,d,Power(Times(r,Power(s,-1)),m),Power(CN1,Times(CN2,k,m,Power(n,-1))))),Power(Times(a,n,Plus(r,Times(CN1,Power(CN1,Times(C2,k,Power(n,-1))),s,u))),-1)),List(k,C1,n))),And(And(FreeQ(List(a,b,c,d),x),IntegersQ(m,n)),Less(Less(C0,m),n)))),
ISetDelayed(ExpandIntegrand(Times(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,m_DEFAULT)),Times(e_DEFAULT,Power(u_,p_))),Power(Plus(a_,Times(b_DEFAULT,Power(u_,n_))),-1)),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,-1)),n))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,-1)),n)))),Sum(Times(Plus(Times(r,c),Times(r,d,Power(Times(r,Power(s,-1)),m),Power(CN1,Times(CN2,k,m,Power(n,-1)))),Times(r,e,Power(Times(r,Power(s,-1)),p),Power(CN1,Times(CN2,k,p,Power(n,-1))))),Power(Times(a,n,Plus(r,Times(CN1,Power(CN1,Times(C2,k,Power(n,-1))),s,u))),-1)),List(k,C1,n))),And(And(FreeQ(List(a,b,c,d,e),x),IntegersQ(m,n,p)),Less(Less(Less(C0,m),p),n)))),
ISetDelayed(ExpandIntegrand(Times(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,m_DEFAULT)),Times(e_DEFAULT,Power(u_,p_)),Times(f_DEFAULT,Power(u_,q_))),Power(Plus(a_,Times(b_DEFAULT,Power(u_,n_))),-1)),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,-1)),n))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,-1)),n)))),Sum(Times(Plus(Times(r,c),Times(r,d,Power(Times(r,Power(s,-1)),m),Power(CN1,Times(CN2,k,m,Power(n,-1)))),Times(r,e,Power(Times(r,Power(s,-1)),p),Power(CN1,Times(CN2,k,p,Power(n,-1)))),Times(r,f,Power(Times(r,Power(s,-1)),q),Power(CN1,Times(CN2,k,q,Power(n,-1))))),Power(Times(a,n,Plus(r,Times(CN1,Power(CN1,Times(C2,k,Power(n,-1))),s,u))),-1)),List(k,C1,n))),And(And(FreeQ(List(a,b,c,d,e,f),x),IntegersQ(m,n,p,q)),Less(Less(Less(Less(C0,m),p),q),n)))),
ISetDelayed(ExpandIntegrand(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,n_DEFAULT)),Times(c_DEFAULT,Power(u_,j_DEFAULT))),-1),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Times(C2,c,Power(Times(q,Plus(b,Negate(q),Times(C2,c,Power(u,n)))),-1)),Times(CN1,C2,c,Power(Times(q,Plus(b,q,Times(C2,c,Power(u,n)))),-1)))),And(And(FreeQ(List(a,b,c,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
ISetDelayed(ExpandIntegrand(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,n_DEFAULT)),Times(c_DEFAULT,Power(u_,j_DEFAULT))),-1)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2))),Plus(Times(C2,c,Power(u,m),Power(Times(q,Plus(b,Negate(q),Times(C2,c,Power(u,n)))),-1)),Times(CN1,C2,c,Power(u,m),Power(Times(q,Plus(b,q,Times(C2,c,Power(u,n)))),-1)))),And(And(And(And(And(FreeQ(List(a,b,c),x),IntegersQ(m,n,j)),Equal(j,Times(C2,n))),Less(Less(C0,m),Times(C2,n))),Unequal(m,n)),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
ISetDelayed(ExpandIntegrand(Times(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_DEFAULT))),Power(Plus(a_,Times(b_DEFAULT,Power(u_,j_DEFAULT))),-1)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Times(CN1,a,Power(b,-1)),C2))),Plus(Times(CN1,Plus(c,Times(CN1,d,q)),Power(Times(C2,b,q,Plus(q,Power(u,n))),-1)),Times(CN1,Plus(c,Times(d,q)),Power(Times(C2,b,q,Plus(q,Negate(Power(u,n)))),-1)))),And(FreeQ(List(a,b,c,d,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))))),
ISetDelayed(ExpandIntegrand(Times(Plus(d_DEFAULT,Times(e_DEFAULT,Power(u_,n_DEFAULT))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,n_DEFAULT)),Times(c_DEFAULT,Power(u_,j_DEFAULT))),-1)),x_Symbol),
    Condition(Module(List(Set(q,Rt(Plus(Sqr(b),Times(CN1,C4,a,c)),C2)),r),CompoundExpression(Set(r,TogetherSimplify(Times(Plus(Times(C2,c,d),Times(CN1,b,e)),Power(q,-1)))),Plus(Times(Plus(e,r),Power(Plus(b,Negate(q),Times(C2,c,Power(u,n))),-1)),Times(Plus(e,Negate(r)),Power(Plus(b,q,Times(C2,c,Power(u,n))),-1))))),And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))))),
ISetDelayed(ExpandIntegrand(Times(u_,Power(v_,-1)),x_Symbol),
    Condition(Module(List(Set($s("lst"),CoefficientList(u,x))),Plus(Times(Part($s("lst"),CN1),Power(x,Exponent(u,x)),Power(v,-1)),Times(Sum(Times(Part($s("lst"),i),Power(x,Plus(i,Negate(C1)))),List(i,C1,Exponent(u,x))),Power(v,-1)))),And(And(And(PolynomialQ(u,x),PolynomialQ(v,x)),BinomialQ(v,x)),GreaterEqual(Equal(Exponent(u,x),Plus(Exponent(v,x),Negate(C1))),C2)))),
ISetDelayed(ExpandIntegrand(Times(u_,Power(v_,-1)),x_Symbol),
    Condition(PolynomialDivide(u,v,x),And(And(PolynomialQ(u,x),PolynomialQ(v,x)),GreaterEqual(Exponent(u,x),Exponent(v,x))))),
ISetDelayed(ExpandIntegrand(Times(u_,Power(Times(a_DEFAULT,x_),p_)),x_Symbol),
    Condition(ExpandToSum(Power(Times(a,x),p),u,x),And(Not(IntegerQ(p)),PolynomialQ(u,x)))),
ISetDelayed(ExpandIntegrand(Times(u_DEFAULT,Power(v_,p_)),x_Symbol),
    Condition(ExpandIntegrand(NormalizeIntegrand(Power(v,p),x),u,x),Not(IntegerQ(p)))),
ISetDelayed(ExpandIntegrand(u_,x_Symbol),
    ExpandExpression(u,x)),
ISetDelayed(ExpandExpression(u_,x_Symbol),
    Module(List(v,w),CompoundExpression(Set(v,If(And(AlgebraicFunctionQ(u,x),Not(RationalFunctionQ(u,x))),ExpandAlgebraicFunction(u,x),C0)),If(SumQ(v),ExpandCleanup(v,x),CompoundExpression(Set(v,SmartApart(u,x)),If(SumQ(v),ExpandCleanup(v,x),CompoundExpression(Set(v,SmartApart(RationalFunctionFactors(u,x),x,x)),If(SumQ(v),CompoundExpression(Set(w,NonrationalFunctionFactors(u,x)),ExpandCleanup(Map(Function(Times(Slot1,w)),v),x)),CompoundExpression(Set(v,Expand(u,x)),If(SumQ(v),ExpandCleanup(v,x),CompoundExpression(Set(v,Expand(u)),If(SumQ(v),ExpandCleanup(v,x),SimplifyTerm(u,x))))))))))))),
ISetDelayed(ExpandCleanup(u_,x_Symbol),
    Module(List(v),CompoundExpression(Set(v,CollectReciprocals(u,x)),If(SumQ(v),CompoundExpression(Set(v,Map(Function(SimplifyTerm(Slot1,x)),v)),If(SumQ(v),UnifySum(v,x),v)),v)))),
ISetDelayed(CollectReciprocals(Plus(u_DEFAULT,Times(e_,Power(Plus(a_,Times(b_DEFAULT,x_)),-1)),Times(f_,Power(Plus(c_,Times(d_DEFAULT,x_)),-1))),x_Symbol),
    Condition(CollectReciprocals(Plus(u,Times(Plus(Times(c,e),Times(a,f)),Power(Plus(Times(a,c),Times(b,d,Sqr(x))),-1))),x),And(And(FreeQ(List(a,b,c,d,e,f),x),ZeroQ(Plus(Times(b,c),Times(a,d)))),ZeroQ(Plus(Times(d,e),Times(b,f)))))),
ISetDelayed(CollectReciprocals(Plus(u_DEFAULT,Times(e_,Power(Plus(a_,Times(b_DEFAULT,x_)),-1)),Times(f_,Power(Plus(c_,Times(d_DEFAULT,x_)),-1))),x_Symbol),
    Condition(CollectReciprocals(Plus(u,Times(Plus(Times(d,e),Times(b,f)),x,Power(Plus(Times(a,c),Times(b,d,Sqr(x))),-1))),x),And(And(FreeQ(List(a,b,c,d,e,f),x),ZeroQ(Plus(Times(b,c),Times(a,d)))),ZeroQ(Plus(Times(c,e),Times(a,f)))))),
ISetDelayed(CollectReciprocals(u_,x_Symbol),
    u),
ISetDelayed(SmartApart(u_,x_Symbol),
    Module(List(Set($s("alst"),MakeAssocList(u,x))),KernelSubst(Apart(GensymSubst(u,x,$s("alst"))),x,$s("alst")))),
ISetDelayed(SmartApart(u_,v_,x_Symbol),
    Module(List(Set($s("alst"),MakeAssocList(u,x))),KernelSubst(Apart(GensymSubst(u,x,$s("alst")),v),x,$s("alst")))),
ISetDelayed(MakeAssocList(u_,x_Symbol),
    If(AtomQ(u),List(),If(IntegerPowerQ(u),MakeAssocList(Part(u,C1),x,List()),If(Or(ProductQ(u),SumQ(u)),MakeAssocList(Rest(u),x,MakeAssocList(First(u),x,List())),If(FreeQ(u,x),Module(List(Set($s("tmp"),Select(List(),Function(SameQ(Part(Slot1,C2),u)),C1))),If(SameQ($s("tmp"),List()),Append(List(),List(Unique(stringx("Rubi")),u)),List())),List()))))),
ISetDelayed(MakeAssocList(u_,x_Symbol,$p("alst",$s("List"))),
    If(AtomQ(u),$s("alst"),If(IntegerPowerQ(u),MakeAssocList(Part(u,C1),x,$s("alst")),If(Or(ProductQ(u),SumQ(u)),MakeAssocList(Rest(u),x,MakeAssocList(First(u),x,$s("alst"))),If(FreeQ(u,x),Module(List(Set($s("tmp"),Select($s("alst"),Function(SameQ(Part(Slot1,C2),u)),C1))),If(SameQ($s("tmp"),List()),Append($s("alst"),List(Unique(stringx("Rubi")),u)),$s("alst"))),$s("alst")))))),
ISetDelayed(GensymSubst(u_,x_Symbol,$p("alst",$s("List"))),
    If(AtomQ(u),u,If(IntegerPowerQ(u),Power(GensymSubst(Part(u,C1),x,$s("alst")),Part(u,C2)),If(Or(ProductQ(u),SumQ(u)),Map(Function(GensymSubst(Slot1,x,$s("alst"))),u),If(FreeQ(u,x),Module(List(Set($s("tmp"),Select($s("alst"),Function(SameQ(Part(Slot1,C2),u)),C1))),If(SameQ($s("tmp"),List()),u,Part($s("tmp"),C1,C1))),u))))),
ISetDelayed(KernelSubst(u_,x_Symbol,$p("alst",$s("List"))),
    If(AtomQ(u),Module(List(Set($s("tmp"),Select($s("alst"),Function(SameQ(Part(Slot1,C1),u)),C1))),If(SameQ($s("tmp"),List()),u,Part($s("tmp"),C1,C2))),If(IntegerPowerQ(u),Power(KernelSubst(Part(u,C1),x,$s("alst")),Part(u,C2)),If(Or(ProductQ(u),SumQ(u)),Map(Function(KernelSubst(Slot1,x,$s("alst"))),u),u)))),
ISetDelayed(ExpandAlgebraicFunction(Times($p(u,Plus),v_),x_Symbol),
    Condition(Map(Function(Times(Slot1,v)),u),Not(FreeQ(u,x)))),
ISetDelayed(ExpandAlgebraicFunction(Times(v_DEFAULT,Power($p(u,Plus),n_)),x_Symbol),
    Condition(Module(List(Set(w,Expand(Power(u,n),x))),Condition(Map(Function(Times(Slot1,v)),w),SumQ(w))),And(PositiveIntegerQ(n),Not(FreeQ(u,x))))),
ISetDelayed(UnifySum(u_,x_Symbol),
    If(SumQ(u),Apply(Plus,UnifyTerms(Apply($s("List"),u),x)),SimplifyTerm(u,x))),
ISetDelayed(UnifyTerms($p("lst"),x_),
    If(SameQ($s("lst"),List()),$s("lst"),UnifyTerm(First($s("lst")),UnifyTerms(Rest($s("lst")),x),x))),
ISetDelayed(UnifyTerm($p("term"),$p("lst"),x_),
    If(SameQ($s("lst"),List()),List($s("term")),Module(List(Set($s("tmp"),Simplify(Times(First($s("lst")),Power($s("term"),-1))))),If(FreeQ($s("tmp"),x),Prepend(Rest($s("lst")),Times(Plus(C1,$s("tmp")),$s("term"))),Prepend(UnifyTerm($s("term"),Rest($s("lst")),x),First($s("lst")))))))
  );
}
