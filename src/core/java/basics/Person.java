package core.java.basics;

import java.lang.System;

public class Person extends Object{
	
	static double varC = 100;
	int varA;
	boolean cond;
	float varB;
	
	
	static byte varE = (byte) 130;
	static byte varF = 127;
	
	int varG = 100;
	long varH = varG;
	
	int varI =  (int) varH;
	
	public Person() {
		
	}
	
	public static void display() {
		
		int varD = 0;
		System.out.println("Inside Method" + varD);
	}


	public String display1() {
		
		return "Returning Msg";
	}
	
	public static void show() {
		System.out.println("I'm a static method");
	}

	public static void main(String[] args) {
		
		//To create a object for Person class
		Person p1 = new Person();
		Person person = new Person();
		
		System.out.println("Value of VarA: " + p1.varA);
		System.out.println("Value of VarA: " + person.cond);
		System.out.println("Value of varB: " + person.varB);
		System.out.println("Static Variable VarC: " + varC);
		
		display();
		System.out.println(p1.display1());
		show();
		
		System.out.println(varE + " " + varF);
		
	}

}
