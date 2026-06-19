package com.two.example;
import java.util.Scanner;

public class EligibilityTest {
	 public void test(int age, int exp, String deg) {
		 if((age >= 24 && age < 60) && (exp >= 3 && exp < 40) && (deg.equals("yes"))) {
			 System.out.println("Congratulations! you are eligible for further process");
		 }
		 else {
			 System.out.println("Sorry !! you don't meet the requirement");
		 }
			
	 }
	public static void main(String[] args) {
		EligibilityTest obj = new EligibilityTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int a = sc.nextInt();
		System.out.println("Enter years of experience: ");
		int n = sc.nextInt();
		System.out.println("Enter degree: (yes/no)");
		String d = sc.next();
		
		obj.test(a, n, d);

	}

}
