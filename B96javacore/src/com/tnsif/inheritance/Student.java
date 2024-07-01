package com.tnsif.inheritance;

public class Student extends Customer{
	private String collegeName;
	private String rollNo;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int id, long adharNo, long phoneNo, String collegeName, String rollNo) {
		super(name, id, adharNo, phoneNo);//calling superclass constructor
		this.collegeName=collegeName;
		this.rollNo=rollNo;
		
		// TODO Auto-generated constructor stub
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", rollNo=" + rollNo + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getAdharNo()=" + getAdharNo() + ", getPhoneNo()=" + getPhoneNo() + "]";
	}
	
	
}
