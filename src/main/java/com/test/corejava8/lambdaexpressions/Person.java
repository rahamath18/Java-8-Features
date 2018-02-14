package com.test.corejava8.lambdaexpressions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
//Suppose that members of this social networking application are represented by the following Person class:
public class Person {

	public enum Sex {  MALE, FEMALE }
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    int age;
    
    public Person() { }

    public Person(String name, int age, LocalDate birthday, Sex gender, String emailAddress) {
    	this.name = name;
    	this.age = age;
    	this.birthday = birthday;
    	this.gender = gender;
    	this.emailAddress = emailAddress;
    }
    
    
    public int getAge() {
    	return this.age;
    }

    public void printPerson() {
        System.out.println("name=" + this.name 
        		+ ", age=" + this.age 
        		+ ", birthday=" + this.birthday
        		+ ", gender=" + this.gender
        		+ ", emailAddress=" + this.emailAddress);
        
    }
    
    // Approach 1: Create Methods That Search for Members That Match One Characteristic
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
    
    //Approach 2: Create More Generalized Search Methods
    // The following method is more generic than printPersonsOlderThan; it prints members within a specified range of ages:
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
	    for (Person p : roster) {
	        if (low <= p.getAge() && p.getAge() < high) {
	            p.printPerson();
	        }
	    }
	}
    
    //Approach 3: Specify Search Criteria Code in a Local Class
    //The following method prints members that match search criteria that you specify:
    public static void printPersons(
	    List<Person> roster, CheckPerson tester) {
	    for (Person p : roster) {
	        if (tester.test(p)) {
	            p.printPerson();
	        }
	    }
	}
    
    public static void main(String[] args) {
    	
    	List<Person> roster = new ArrayList<Person>();
    	roster.add(new Person("aa", 20, LocalDate.now(), Sex.MALE, "aa@yahoo.com"));
    	roster.add(new Person("bb", 22, LocalDate.now(), Sex.MALE, "bb@yahoo.com"));
    	roster.add(new Person("cc", 35, LocalDate.now(), Sex.FEMALE, "cc@yahoo.com"));
    	roster.add(new Person("dd", 18, LocalDate.now(), Sex.MALE, "dd@yahoo.com"));
    	roster.add(new Person("ee", 45, LocalDate.now(), Sex.FEMALE, "ee@yahoo.com"));
    	
    	 
    	System.out.println("Search Criteria for Person: MALE && age >= 18 && <= 25");
    	System.out.println("------------------------------------------------------");
    	printPersons(roster, new CheckPersonEligibleForSelectiveService());
    	
    	System.out.println("\nSearch Criteria for Person: older than 35");
    	System.out.println("-------------------------------------------");
    	printPersonsOlderThan(roster, 35);
    	
    	System.out.println("\nSearch Criteria for Person: age range 18 to 35");
    	System.out.println("------------------------------------------------");
    	printPersonsWithinAgeRange(roster, 18, 35);
    	
	}
}

interface CheckPerson {
    boolean test(Person p);
}

class CheckPersonEligibleForSelectiveService implements CheckPerson {
    public boolean test(Person p) {
        return p.gender == Person.Sex.MALE &&
            p.getAge() >= 18 &&
            p.getAge() <= 25;
    }
}

/*
   Although this approach is less brittle—you don't have to rewrite methods if you change the structure of the 
   Person—you still have additional code: a new interface and a local class for each search you plan to 
   perform in your application. Because CheckPersonEligibleForSelectiveService implements an interface, 
   you can use an anonymous class instead of a local class and bypass the need to declare a new class for each search.
 */
