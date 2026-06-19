package com.two.example;
import java.util.Scanner;

public class AreaCalculation {
	
	public double AreaofCircle(double r) {
		return (r * r) * 3.14;
	}
	
	public int AreaofRect(int l,  int b) {
		return l * b;
	}
	
	public static void main(String[] args) {
		
		AreaCalculation obj = new AreaCalculation();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius: ");
		double r = sc.nextDouble();
		
		System.out.println("Enter Lenght & Breadth: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Area of Circle: " + obj.AreaofCircle(r));
		System.out.println("Area of Reactangle: " + obj.AreaofRect(l, b));
	}
}
