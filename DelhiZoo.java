package com.java.oops;
import com.java.Deer;
import com.java.Elephant;
import com.java.Giraffe;
import com.java.Lion;
import com.java.Monkey;
import com.java.Tiger;

public class DelhiZoo {
	public static void main(String[] args) {
	System.out.println("-----------------------------------------------");
	Deer d=new Deer("golden",35.0,10);
	d.canClimb();
	d.isVegetarian();
	d.sound();
	System.out.println("-----------------------------------------------");
	Elephant e=new Elephant("Black",120.0,15);
	e.canClimb();
	e.isVegetarian();
	e.sound();
	System.out.println("-----------------------------------------------");
	Giraffe g=new Giraffe("golden",35.0,10);
	g.canClimb();
	g.isVegetarian();
	g.sound();
	System.out.println("-----------------------------------------------");
	Lion l=new Lion("Sandcolor",50.0,15);
	l.canClimb();
	l.isVegetarian();
	l.sound();
	System.out.println("-----------------------------------------------");
	Monkey m=new Monkey("grey",20.0,5);
	m.canClimb();
	m.isVegetarian();
	m.sound();
	System.out.println("-----------------------------------------------");
	Tiger t=new Tiger("Yellow",50.0,15);
	t.canClimb();
	t.isVegetarian();
	t.sound();
}

}
