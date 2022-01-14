package com.practic_inheritance;

public class Robot {
	// a=50 , b=100 swap this variable...
	
	
	int a;
	int b;
	public void getSwap(int a, int b) {
		System.out.println("A value before swap="+a);
		System.out.println("B value before swap="+b);
		
		
		a = (a+b);
		b = (a-b);
		a = (a-b);
		
		System.out.println("A value After swap="+a);
		System.out.println("B value After swap="+b);
		
		
		
	}

}
