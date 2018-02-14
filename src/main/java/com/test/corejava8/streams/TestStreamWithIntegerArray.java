package com.test.corejava8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestStreamWithIntegerArray {

	public static void main(String[] args) {

		Integer[] iArr = {1,2,3,4,5,6,7,8,9};
		Stream<Integer> stream = Arrays.stream(iArr);
		//stream.forEach(System.out::println);
		
		int sum = stream.filter(i -> 1 % 2 != 0)
			  .peek(System.out::println)
			  .mapToInt(i -> i.intValue())
			  .sum();
		System.out.println("sum="+sum);
			  
	}
}