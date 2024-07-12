package com.tnsif.exceptionhandling;

public class TryCatch {
	public static void divide() {
		int a = 6, b = 0, c,d;
		int arr[]= {1,2,3};
		try {
			c=a/b;
		    d=arr[4];
		} catch (ArithmeticException e) {
			System.out.println("exception caught" + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught" + e.getMessage());
		} catch (Exception e) {// super class exception
			System.out.println("exception caught" + e.getMessage());
		}

	}
}
