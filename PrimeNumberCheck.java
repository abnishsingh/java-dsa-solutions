package com.coding;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		if(checkPrime(n)) {
			System.out.println("No is prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
		
	}

	public static boolean checkPrime(int n) {
		
		if(n<1) {
			return false;
		}
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if(n % i ==0) {
				return false;	
			}
			
		}
		return true;
		
	}
}
