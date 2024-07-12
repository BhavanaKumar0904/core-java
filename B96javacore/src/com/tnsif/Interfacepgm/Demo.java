package com.tnsif.Interfacepgm;

public class Demo {

	public static void main(String[] args) {
		Amazon.aboutUs();
		Amazon ob= new NonPrime();
		
		ob.welcome();
		ob.sevicecharge();
		ob.thankyou();
		
		Amazon ob1= new Prime();

		ob1.welcome();
		ob1.sevicecharge();
		ob1.thankyou();
	}

}
