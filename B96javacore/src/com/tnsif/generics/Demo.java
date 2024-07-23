package com.tnsif.generics;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<String> stringobj=new Generic();
		stringobj.setData("hello");
		System.out.println("the string object:"+stringobj.getData());
		
		Generic<Integer> intobj= new Generic();
		intobj.setData(22);
		
		Generic<Double> doubleobj= new Generic();
		doubleobj.setData(22.89);
		
		System.out.println("the integer object:"+intobj.getData());
		System.out.println("the double object:"+doubleobj.getData());
		
		
		
		
		
		
		
	}

}
