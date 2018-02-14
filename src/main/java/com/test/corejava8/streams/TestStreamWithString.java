package com.test.corejava8.streams;

import java.util.ArrayList;
import java.util.List;

public class TestStreamWithString {

	public static void main(String[] args) {
		
		 String password = "password123";

	        password.chars() //IntStream
	                .mapToObj(x -> (char) x)//Stream<Character>
	                .forEach(System.out::println);
	        
	        password = "123456";

	        password.chars() //IntStream
	                .mapToObj(x -> (int) x)//Stream<Character>
	                .forEach(System.out::println);
	        
	        List<String> aList = new ArrayList<>();
	        for (String string : aList) {
				
			}
	}

}
