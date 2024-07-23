package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop>laps = new ArrayList<Laptop>();
		laps.add(new Laptop("dell",455500,12));
		laps.add(new Laptop("asus",365500,8));
		laps.add(new Laptop("apple",4512500,12));
		
		Collections.sort(laps);
		for(Laptop l: laps) {
			System.out.println(l);
		}
	}

}
