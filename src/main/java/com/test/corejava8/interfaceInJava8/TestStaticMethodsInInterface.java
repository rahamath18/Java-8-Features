package com.test.corejava8.interfaceInJava8;


interface AA {
	
	// static methods
	static void show(String s) {
		System.out.println("static method possible in Java8-" + s);
	}
}

public class TestStaticMethodsInInterface {

	public static void main(String[] args) {
		
		AA.show(" that's good");
	}

}
