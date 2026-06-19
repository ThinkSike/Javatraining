package com.two.example;
import java.util.Scanner;

public class StudentDetails {
	
	public void details(int r, String n, String d) {
		System.out.println("--------------------Student Details-----------------");
		System.out.println("Roll no: " + r);
		System.out.println("Name: " + n);
		System.out.println("Department: " + d);
	}
	
	public static void main(String[] args) {
		
		StudentDetails obj = new StudentDetails();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rollno, name , department: ");
		int r = sc.nextInt();
		String n = sc.next();
		String d = sc.next();
		obj.details(r, n, d);
	}

}
