package com.test.corejava8.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * 
Functional interfaces have a single functionality to exhibit. For example, a Comparable interface with a 
single method �compareTo� is used for comparison purpose. Java 8 has defined a lot of functional interfaces 
to be used extensively in lambda expressions. Following is the list of functional interfaces 
defined in java.util.Function package.

*/
public class FunctionalInterfacesExample_1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Predicate<Integer> predicate = n -> true
		// n is passed as parameter to test method of Predicate interface
		// test method will always return true no matter what value n has.

		System.out.println("Print all numbers:");
		// pass n as parameter
		eval(list, n -> true);

		// Predicate<Integer> predicate1 = n -> n%2 == 0
		// n is passed as parameter to test method of Predicate interface
		// test method will return true if n%2 comes to be zero

		System.out.println("Print even numbers:");
		eval(list, n -> n % 2 == 0);

		// Predicate<Integer> predicate2 = n -> n > 3
		// n is passed as parameter to test method of Predicate interface
		// test method will return true if n is greater than 3.

		System.out.println("Print numbers greater than 3:");
		eval(list, n -> n > 3);
		
		
		System.out.println("Predicate -- String");
		List<String> listStr = Arrays.asList("a","b","c");
		// pass n as parameter
		eval1(listStr, n -> n.equals("a"));

	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer i : list) {

			if (predicate.test(i)) {
				System.out.println(i + " ");
			}
		}
	}
	
	public static void eval1(List<String> list, Predicate<String> predicate) {
		for (String i : list) {

			if (predicate.test(i)) {
				System.out.println(i + " ");
			}
		}
	}
}