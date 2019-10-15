package com.test.corejava8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_Feature_MethodReference {
	
	public static void main(String[] args) {
		
		List<MyMethodReference> input = Arrays.asList(
				new MyMethodReference("  apple  "),
				new MyMethodReference("  banana  "),
				new MyMethodReference("  carrot  "));
		
		List<MyMethodReference> output = input.stream()
				.map(obj -> obj.customTrim())  	  				// Instance method
				.map(MyMethodReference::customToUpperCase)     	// Static method
				.map(MyMethodReference::new)					// Constructor method
				.map(obj -> obj.customQualityCheck(obj.fruit))	// Instance method with param passing
				.collect(Collectors.toList());
		
		output.forEach(System.out::println);
		
	}
}

class MyMethodReference {
	
	String fruit;
	
	public MyMethodReference(String value) {
		this.fruit = value;
	}
	
	public MyMethodReference(MyMethodReference value) {
		this.fruit = value + " is a fruit";
	}
	
	public static MyMethodReference customToUpperCase(MyMethodReference value) {
		value.fruit = value.fruit.toUpperCase();		
		return value;
	}
	
	public MyMethodReference customTrim() {
		this.fruit = this.fruit.trim();
		return this;
	}
	
	public MyMethodReference customQualityCheck(String value) {
		this.fruit = value + " OK";
		return this;
	}

	@Override
	public String toString() {
		return fruit;
	} 
	
}