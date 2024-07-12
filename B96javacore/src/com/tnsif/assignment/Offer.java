package com.tnsif.assignment;

public class Offer implements Amazon, Flipkart {

	@Override
	public void welcome() {
		System.out.println("HEY!! WELCOME ");

	}

	@Override
	public void thankyou() {
		System.out.println("Thank you suma");

	}

	public void offers() {
		Amazon.aboutUs();
		int amazon = Amazon.ProductCost();
		{
			Flipkart.aboutUs();
			int flipkart = Flipkart.ProductCost();
			{

			}
		}
	}
}
