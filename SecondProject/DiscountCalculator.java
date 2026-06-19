package com.two.example;
import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount: ");
		double amount = sc.nextFloat();
		double discount = 0;
		
		if(amount >= 5000) {
			discount = amount * 0.3;
		} 
		else if(amount >= 3000) {
			discount = amount * 0.2;
		}
		else if(amount >= 1000) {
			discount = amount * 0.1;
		}
		
		double FinalAmount = amount - discount;
		
		System.out.println("------------------------Bill-------------------------");
		System.out.println("Amount: " + amount);
		System.out.println("Discount: " + discount);
		System.out.println("Final Amount: " + FinalAmount);
	}

}
