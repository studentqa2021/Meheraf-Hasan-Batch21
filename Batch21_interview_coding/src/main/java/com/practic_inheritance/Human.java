package com.practic_inheritance;

public class Human {

	public void getlooping() {
		// do looping = "How To Loop in Java OOPS"
		// Formula: for (int i =0; I<variable.lenth();i++){ }********
		String A = "How To Loop in Java OOPS";
		// System.out.println(A.length());

		for (int i = 0; i < A.length(); i++) {
			System.out.print(A.charAt(i));

		}

	}

	public void getreverse() {
		// do Revers looping = "How To Loop in Java OOPS"
		// Formula: for(int i =variable.lenth()-1;i>=0;i--){ }**********

		String B = "How To do Reverse Loop in Java OOPS";

		// System.out.println(B.length());

		for (int i = B.length() - 1; i >= 0; i--) {
			System.out.print(B.charAt(i));

		}
	}
}
