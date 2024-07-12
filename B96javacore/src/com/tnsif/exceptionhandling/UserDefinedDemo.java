package com.tnsif.exceptionhandling;

public class UserDefinedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	UserDefined.validate();
} catch (Age e) {
	// TODO Auto-generated catch block
	System.out.println("age exception caught "+e.getMessage());
}
	}

}
