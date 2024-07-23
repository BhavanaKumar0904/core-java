package com.tnsif.threads;

public class Firstway extends Thread {
public void run() {
	System.out.println("creation of thread by extending the thread class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firstway ob = new Firstway();
		//ob.stop();
		ob.start();
		//ob.stop();
	}

}
