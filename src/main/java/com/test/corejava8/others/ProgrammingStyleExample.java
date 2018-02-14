package com.test.corejava8.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProgrammingStyleExample {

	public static void main(String[] args) {
		
	      List<String> names1 = new ArrayList<String>();
	      names1.add("aa ");
	      names1.add("bb ");
	      names1.add("cc ");
			
	      List<String> names2 = new ArrayList<String>();
	      names2.add("a ");
	      names2.add("b ");
	      names2.add("c ");
			
	      ProgrammingStyleExample tester = new ProgrammingStyleExample();
	      System.out.println("Sort using Java 7 syntax: ");
			
	      tester.sortUsingJava7(names1);
	      System.out.println(names1);
	      System.out.println("Sort using Java 8 syntax: ");
			
	      tester.sortUsingJava8(names2);
	      System.out.println(names2);
	      
	   }
	   
	   //sort using java 7
	   private void sortUsingJava7(List<String> names){   
	      Collections.sort(names, new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	            return s1.compareTo(s2);
	         }
	      });
	   }
	   
	   //sort using java 8
	   private void sortUsingJava8(List<String> names){
	      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	   }
	   
	   
	 //sort using java 7
	   private void sortUsingJava8_How(List<String> names){   
	      Collections.sort(names, /*new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	            return */ (s1, s2) /*s1.compareTo(s2);
	         }
	      }*/  -> s1.compareTo(s2));
	   }
	   
	}