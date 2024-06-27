//program to demonstrate constructor
package com.tnsif.constructor;

public class Customer {
	private int id;
	private String name;

	// creating default constructor
	public Customer() {

		super();
		System.out.println("---DEFAULT CONSTRUCTOR---");
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

}
