package com.one.example;

public class DemoProject {
	static int age = 20; // static variable
	String city= "Pune"; // instance variable
	
	public static void main(String[] args) {
		
								// local variable
		double salary=900000.00;
		boolean cond = true;
		char symbol= '@';
		float pi = 3.14f;
		
		DemoProject obj = new DemoProject(); // object
		System.out.println("the age is" + " " + age); // global
		
		System.out.println("the city is" + " " + obj.city); // instance
		System.out.println("the salary is" + " " + salary);
		System.out.println("the cond is" + " " + cond);
		System.out.println("the symbol is" + " " + symbol);
		System.out.println("the pi is" + " " + pi);
		// static, instance and local variable
		
		
	}

}
