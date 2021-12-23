package com.java.oops;

public class Giraffe {
	String color;
	double weight;
	int age;
	public Giraffe(String color,double weight,int age){
		this.color=color;
		this.weight=weight;
		this.age=age;
	}
	public void isVegetarian() {
		System.out.println("Giraffe is  vegetarian");
	}
	public void canClimb() {
		System.out.println("Giraffe cannot climb");
	}
	public void sound() {
		System.out.println("Giraffe makes sound");
	}
}


