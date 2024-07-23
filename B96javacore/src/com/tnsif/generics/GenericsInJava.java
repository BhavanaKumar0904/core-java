package com.tnsif.generics;

import java.util.ArrayList;

public class GenericsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list =new ArrayList();
		list.add("java");
		list.add(123);//will not work
		for (Object object : list)
		{
			//below statement throws classcastException at run time
			String str = (String) object;//type casting
			System.out.println(str);
		}
	}

}
