package com.one.example;
import java.util.Scanner;

public class Person {
	long id = 1000000;
	String name = "ABC";
	String company = "XYZ";
	String Designation = "Developer";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Person obj = new Person();
		
		System.out.println("Enter person details:");
		System.out.println("ID:");
		obj.id = sc.nextLong();
		System.out.println("Name:");
		obj.name = sc.next();
		System.out.println("Company:");
		obj.company = sc.next();
		System.out.println("Designation:");
		obj.Designation = sc.next();
		
		System.out.println("Person Details are:");
		System.out.println("ID: " + obj.id);
		System.out.println("Name: " + obj.name);
		System.out.println("Company: " + obj.company);
		System.out.println("Designation: " + obj.Designation);
	}
}
