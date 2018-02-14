package com.test.corejava8.methodreference;

import java.util.ArrayList;
import java.util.List;

/*
Method references help to point to methods by their names. 
A method reference is described using :: (double colon) symbol. 
A method reference can be used to point the following types of methods −

    Static methods
    Instance methods
    Constructors using new operator (TreeSet::new)

*/

public class MethodReferenceExample_1 {

	public static void main(String[] args) {

		List names = new ArrayList(); 
		
		names.add("aaa");
		names.add("bbb");
		names.add("ccc");
		names.forEach(System.out::println);
	}
}