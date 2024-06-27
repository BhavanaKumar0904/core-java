package com.tnsif.constructor;

public class CommissionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commission ob = new Commission();
		
		
		ob.employeeDetails();
		double commission = ob.commisionCalculation();
		
		System.out.println("commission="+commission);
	}

}
