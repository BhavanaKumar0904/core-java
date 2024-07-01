package com.tnsif.ststicprograms;

public class Student {
	private String name;// instance variables
	private int id;

	static String collegeName = "DBIT";// static variable(memory allocates here itself no need to create object for this

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
