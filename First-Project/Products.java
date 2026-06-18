package com.one.example;
import java.util.Scanner;

public class Products {
	static long prod_price = 1000000;
	static String prod_name = "i-pad";
	static int prod_quantity = 10;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Products obj = new Products();
		System.out.println("Enter product details:");
		System.out.println("Name:");
		prod_name = sc.next();
		System.out.println("Price:");
		prod_price = sc.nextLong();
		System.out.println("Quantity:");
		prod_quantity = sc.nextInt();
		System.out.println("Product Details are:");
		System.out.println("Price: " + prod_price);
		System.out.println("Name: " + prod_name);
		System.out.println("Quantity: " + prod_quantity);
	}
}
