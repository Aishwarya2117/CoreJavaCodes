package com.app.core;

import java.util.Scanner;

public class NumberCheck {

	void numcheck(int a) {
		if (a > 0) {
			System.out.println("Number is positive");
		} else if (a < 0) {
			System.out.println("Number is negative");
		} else
			System.out.println("Number is zero");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		NumberCheck no = new NumberCheck();
		no.numcheck(sc.nextInt());

	}

}
