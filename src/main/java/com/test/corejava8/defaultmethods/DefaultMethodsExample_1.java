package com.test.corejava8.defaultmethods;

import java.util.ArrayList;
import java.util.List;

public class DefaultMethodsExample_1 {

	public static void main(String args[]) {
	    
		Vehicle vehicle = new Car();
	    vehicle.print();
	   
	   }
	}

	interface Vehicle {
	   default void print() {
	      System.out.println("I am a vehicle!");
	   }
		
	   static void blowHorn() {
	      System.out.println("Blowing Vehicle horn");
	   }
	   
	   default int print1() {
	      System.out.println("I am a vehicle!");
	      return 1;
	   }
		
	   static List<Long> blowHorn1() {
	      System.out.println("Blowing Vehicle horn1");
	      return null;
	   }
	}

	interface FourWheeler {
	   default void print() {
	      System.out.println("I am a four wheeler!");
	   }
	}

	class Car implements Vehicle, FourWheeler {
	   public void print() {
	      Vehicle.super.print();
	      FourWheeler.super.print();
	      Vehicle.blowHorn();
	      System.out.println("I am a car!");
	   }
	}