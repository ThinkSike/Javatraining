package com.one.example;
import java.util.Scanner;

public class Employee {
	
	public static void main(String[] args) {
		long empsalary = 1000000;
		String empname = "ABC";
		String empDesignation = "Developer";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employee Details are:");
		System.out.println("Name: " + empname);
		System.out.println("Salary: " + empsalary);
		System.out.println("Designation: " + empDesignation);
		
		System.out.println("Enter Employee Details:");
		System.out.println("Name: ");
		empname = sc.next();
		System.out.println("Salary: ");
		empsalary = sc.nextLong();
		System.out.println("Name: ");
		empDesignation = sc.next();
				
		System.out.println("Employee Details are:");
		System.out.println("Name: " + empname);
		System.out.println("Salary: " + empsalary);
		System.out.println("Designation: " + empDesignation);
		
		
	}
 
}
