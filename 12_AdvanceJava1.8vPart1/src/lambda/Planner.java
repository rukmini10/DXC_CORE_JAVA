package lambda;

public class Planner {}
/*
Lambda expression consists of following components:
1.Argument list/paramenter list:it can be blank or having some parameters
2.Arrow token(->): it is used to link parameters list with expression body
3.lambda body: it contains statement for lambda


1. if there is no parameter with lambda then
() -> {....}
  
2. if there is one parameter with lambda then
(para1) -> {......}

3.if there are multiple parameters list with lambda then
(para1,para2.....paraN) -> {.....}


4. neither getting values for user nor returning
() -> sysout("welcome");
 
 5.getting values from user and returning values too
 (num) -> num*num;
 
 or
 
functional interface-having single method/interface
,need not to create class , method and alll


where to use lambdas?
if code is required single time then no use of lambda

where ever required functional interface ,
 override a abstract method having no parameter
 
 
 
 
 practise questions
 
 1.create pojo class having info 
 productId
 productName
 productQuantity
 productPrice
 calcTotalPrice()
 display all data with lambda
*/