package com.shape.oops;

public class Shape {
	int area,perimeter;
	public void area(int side) {
		area=side*side;
		System.out.println("Area of Squre is "+area);
		
	}
	
	public void area(int length,int width) {
		area=length*width;
		System.out.println("Area of Rectangle is "+area);
	}
	
    public void perimeter(int side)
    {
    	perimeter=4*side;
    	System.out.println("Perimeter of Spuare is "+perimeter);
    }
    
    public void perimeter(int length,int width) {
    	perimeter=2*(length+width);
    	System.out.println("Perimeter of Rectangle is "+perimeter);
    }
}


