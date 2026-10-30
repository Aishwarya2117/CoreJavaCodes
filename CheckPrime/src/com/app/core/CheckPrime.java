package com.app.core;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		CheckPrime c=new CheckPrime();
		System.out.println(c.isPrime(sc.nextInt()));
		
		
	}
	
	boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
	}

}
