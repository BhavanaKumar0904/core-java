package com.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args)// should not have the logic this is only for interaction
	{
		Encapsulation ob = new Encapsulation();//creating an object
		ob.name="abc";//calling the variable
		ob.age=33;
		ob.serialNum=22;
		ob.show();

	}

}
