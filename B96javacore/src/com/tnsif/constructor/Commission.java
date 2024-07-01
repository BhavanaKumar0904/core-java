package com.tnsif.constructor;

import java.util.Scanner;

public class Commission {
	private String name;
	private String address;
	private String phone;
	private int salesAmount;
	private double commission;

	public void employeeDetails()// to accept the details of employee
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of employee: ");
		name = sc.nextLine();
		System.out.println("Enter Adress:");
		address = sc.nextLine();
		System.out.println("Enter phone Number:");
		phone = sc.nextLine();
		System.out.println("Enter the sales Amount:");
		salesAmount = sc.nextInt();
		
	}

	public double commisionCalculation() //since void method cannot return value and int cannot hold large no we use double
	{
		if (salesAmount >= 100000) {
			commission = salesAmount + (salesAmount * 0.1);
		}
		else if (50000 <= salesAmount && salesAmount < 100000) {
			commission = salesAmount + (salesAmount * 0.05);
		}
		else if (30000 <= salesAmount && salesAmount < 50000) {
			commission = salesAmount + (salesAmount * 0.03);
		}
		else {
			commission = 0;
		}
		System.out.println("commission="+commission);
		return commission;
	}
}
