package com.tnsif.ststicprograms;

public class Demo {

	public static void main(String[] args) {
		System.out.println("the college name is "+ Student.collegeName);//to acess the static variable
		Student ob = new Student("raj",2);//Parameterized constructor //can use getters and setters also
		System.out.println(ob);
		
	}

}
