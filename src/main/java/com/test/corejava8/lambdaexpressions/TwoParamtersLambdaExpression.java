package com.test.corejava8.lambdaexpressions;

// // Java traditional approach a interface with implementing class 
//interface A {
//	void print();
//}
//
//class B implements A {
//	public void print() {
//		System.out.println("Java traditional approach a interface with implementing class");
//	}
//}
//
//public class SimpleExampleForLambdaExpresion {
//	public static void main(String[] args) {
//		A obj1 = new B();
//		obj1.print();
//	}
//}

//  // Java Ananumous Class approach for a interface WITHOUT implementation class
//interface A {
//	void print();
//}
//
//public class SimpleExampleForLambdaExpresion {
//	public static void main(String[] args) {
//		
//		A obj2 = new A() {
//			public void print() {
//				System.out.println("Java Anonymous  Class approach for a interface WITHOUT implementation class");
//			}
//		};
//		obj2.print();
//		
//	}
//}

//Java 8 LAMBDA expression approach eradicate even Anonymous class
interface A {
	void print(int a, int b);
}

public class TwoParamtersLambdaExpression {
	public static void main(String[] args) {
		
		// format 1
		A obj22 = (int a, int b) -> {
			System.out.println("Java 8 LAMBDA expression approach eradicate even Anonymous class = " + (a+b));
		};
		
		// format 2
		A obj2 = (a, b) -> System.out.println("Java 8 LAMBDA expression approach eradicate even Anonymous class = " + (a+b));
		obj2.print(1,2);
		
		obj22.print(3, 4);
	}
}