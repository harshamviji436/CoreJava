package com.calculator.oops;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.addition(2, 2);
		cal.addition(2.9, 9.6);
		cal.addition(5.8, 6);
		cal.addition(6, 8.9);
		
		cal.difference(5, 4);
		cal.difference(7.9, 6.6);
		cal.difference(10.8, 4);
		cal.difference(5, 3.2);
		
		cal.multiplication(20, 9);
		cal.multiplication(2.6, 8.5);
		cal.multiplication(27.8, 9);
		cal.multiplication(2, 9.7);
		
        cal.division(10, 5);
        cal.division(10.9, 5.6);
        cal.division(10.8, 5);
        cal.division(10, 5.1);
	}

}


