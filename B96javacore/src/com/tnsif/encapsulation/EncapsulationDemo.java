package com.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args)// should not have the logic this is only for interaction
	{
		Encapsulation ob = new Encapsulation();//creating an object
		//ob.name="abc";//calling the variable
		//ob.age=33;
		//ob.serialNum=22;
		
ob.setSerialNum(22);
ob.setAge(20);
ob.setName("abc");
//ob.show();
System.out.println(ob);//without tostring() method it will give the location of the object

	}

}
