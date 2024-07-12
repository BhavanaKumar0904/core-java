package com.tnsif.polymorphism;

public class PolyDemo {

	public static void main(String[] args) {
		Point pone =new Point();
		System.out.println(pone);
		Point ptwo =new Point(2.4f,8.4f);//based on the constructor called it gives the output --->overloading
		System.out.println(ptwo);
	
	}
	
}
