//program to demonstrate encapsulation
package com.tnsif.encapsulation;

public class Encapsulation {
	//if no access specifier is mentioned then it will be default
	private	int serialNum;//data variable or data member
	private String name;
	private int age;
	
	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void show(){//member function
		System.out.println("Serail Number:"+serialNum+"\t Name:"+name+"\t age:"+ age);
	}

	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
}
