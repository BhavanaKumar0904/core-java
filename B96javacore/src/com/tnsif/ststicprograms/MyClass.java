package com.tnsif.ststicprograms;

public class MyClass {
	private int section;
	static int srNo;
	static {
		System.out.println("------static block----------");
		srNo = 12345;
		//section =21;Cannot make a static reference to the non-static field section
	}
	public MyClass() {
		super();
	
		System.out.println("-----------default constructor-----------");
	}
	static void display() {
		System.out.println("------------static method-----------");
		System.out.println("the serial no is "+srNo++);
	}
	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	
}
