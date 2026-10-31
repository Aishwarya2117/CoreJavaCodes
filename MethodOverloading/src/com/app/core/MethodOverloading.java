package com.app.core;

public class MethodOverloading {
	
	int add(int a,int b) {
		return a+b;
	}
   int add(int a,int b,int c) {
	   return a+b+c;
   }
    static  double add(double a,double b) {
    	return a+b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m=new MethodOverloading();
		
		System.out.println("Additon of two integer "+m.add(2, 5));
		System.out.println("Addition of three integer "+m.add(2,5,7));
		System.out.println("Addition of teo double "+add(2.5, 5.3));
		

	}

}
