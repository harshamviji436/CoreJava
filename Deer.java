package com.java.oops;

public class Deer {
	String color;
	 double weight;
	 int age;
	 public Deer(String color,double weight,int age){
			this.color=color;
			this.weight=weight;
			this.age=age;
		}
	public void isVegetarian() {
		System.out.println("Deer is  vegetarian");
	}
	public void canClimb() {
		System.out.println("Deer cannot climb");
	}
	public void sound() {
		System.out.println("Deer makes sound");
	}
}

