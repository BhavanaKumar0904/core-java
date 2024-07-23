package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ob= new ArrayList();
		System.out.println("the size of the arraylist:"+" " +ob.size());
		ob.add(2);
		ob.add('a');
		ob.add(22.35);
		System.out.println("the elements of the array are "+ob);
		System.out.println("check the element is there or not:"+ob.contains(22.35));
		System.out.println("removing the element:"+ob.remove(0));
		System.out.println("the elements of the array are:"+ ob);
		
		
		ArrayList <String>obj = new ArrayList<String>();
		obj.add("bangalore");
		obj.add("mysore");
		obj.add("hassan");
		System.out.println("the array:"+obj);
		Collections.sort(obj);//sorts in ascending order
		System.out.println("the array:"+obj);
		
		Iterator<String> i = ob.iterator();
		while(i.hasNext()) {
			String nm =i.next();
			i.remove();
			System.out.println(nm);
		}
		
	}

}
