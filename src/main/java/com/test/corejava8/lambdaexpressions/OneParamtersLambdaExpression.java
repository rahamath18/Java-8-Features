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
interface AAA {
	void print(int a);
}

public class OneParamtersLambdaExpression {
	public static void main(String[] args) {
		
		// format 1
		AAA obj1 = (int a) -> {
			System.out.println("Java 8 LAMBDA expression approach eradicate even Anonymous class = " + a);
		};
		obj1.print(5);
		
		// format 2
		AAA obj2 = (a) -> System.out.println("Java 8 LAMBDA expression approach eradicate even Anonymous class = " + a);
		obj2.print(10);

		// format 3
		AAA obj3 = a -> System.out.println("Java 8 LAMBDA expression approach eradicate even Anonymous class = " + a);
		obj3.print(15);
		
	}
}