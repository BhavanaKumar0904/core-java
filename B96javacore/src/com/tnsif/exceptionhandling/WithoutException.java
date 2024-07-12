package com.tnsif.exceptionhandling;

public class WithoutException {

	public static void main(String[] args) {
		int d=0;
		try {
		int a=42/d;//exception is raised
		System.out.println("BHAVANA");
		}
		catch(ArithmeticException e) {
			System.out.println("exception handeled successfully"+e.getMessage());
		}
		System.out.println("will not be printed");

	}

}
