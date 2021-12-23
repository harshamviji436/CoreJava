package com.java.oops;

public class Tiger {
		String color;
		double weight;
		int age;
		public Tiger(String color,double weight,int age){
			this.color=color;
			this.weight=weight;
			this.age=age;
		}
		public void isVegetarian() {
			System.out.println("Tiger is not vegetarian");
		}
		public void canClimb() {
			System.out.println("Tiger cannot climb");
		}
		public void sound() {
			System.out.println("Tiger Roar");
		}
	
}
