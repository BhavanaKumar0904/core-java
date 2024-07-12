package com.tnsif.assignment;

public interface Amazon {
	void welcome();//abstract methods
	void thankyou();//abstract methods
	
	static int  ProductCost() {
		int cost=100;
		System.out.println("cost="+cost);
		return cost;
		
	}
	static void  aboutUs() {
		System.out.println("e-commerce website");

}
}
