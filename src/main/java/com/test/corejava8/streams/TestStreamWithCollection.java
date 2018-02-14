package com.test.corejava8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamWithCollection {

	public static void main(String[] args) {
		
		List<Integer> aList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
		aList
			.stream()
			.filter(a -> a >= 5 && a <= 9 || a==12)
			.forEach(System.out::println);
		
		
		List<String> aList1 = Arrays.asList("Apple", "Orange", "Banana", "Graps", "Guava");
		
		List<String> aList2 = aList1
			.stream()
			.filter(a -> a.indexOf("a") >= 0)
			.map(String::toLowerCase)
			.collect(Collectors.toList());
			//.forEach(System.out::println);
		
		aList2.forEach(System.out::println);
	}
}