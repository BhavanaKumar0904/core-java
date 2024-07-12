//pgm to demonstrate interface
package com.tnsif.Interfacepgm;

public interface Amazon {
	//int a; interface cannot have instance variable
	void welcome();//abstract methods
	void thankyou();//abstract methods
	
	default void  sevicecharge() {
		int amt=100;
		System.out.println("the sevice charge is:"+amt);
		
	}
	static void  aboutUs() {
		System.out.println("e-commerce website");
	}
}
