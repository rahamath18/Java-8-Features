package com.test.corejava8.interfaceInJava8;

interface A {
	default void print() { System.out.println("A"); }
}

interface B {
	default void print() { System.out.println("B"); }
}

class C implements A, B {
	
	public void print() {
		System.out.println("C"); 
	}
}

public class TestInterfaceInJava8 {

	public static void main(String[] args) {
		C obj = new C();
		obj.print(); // C
		
	}

}