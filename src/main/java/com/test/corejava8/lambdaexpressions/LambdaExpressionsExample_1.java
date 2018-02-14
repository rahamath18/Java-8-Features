package com.test.corejava8.lambdaexpressions;

public class LambdaExpressionsExample_1 {

	public static void main(String[] args) {
		
		LambdaExpressionsExample_1 tester = new LambdaExpressionsExample_1();
		
	      MathOperation addition = (a,b) -> a + b; // also can do sub, mul, div
	      int result = addition.operation(1, 2);
	      System.out.println(result);
			
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
	      greetService1.sayMessage("aaa");
	      
	   }
}

interface MathOperation {
    int operation(int a, int b);
 }
	
 interface GreetingService {
    void sayMessage(String message);
 }
 
