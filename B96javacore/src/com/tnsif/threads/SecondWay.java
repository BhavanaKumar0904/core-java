package com.tnsif.threads;

public class SecondWay implements Runnable{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondWay t = new SecondWay();//new state
		Thread th = new Thread();
		th.start();//runnable
	//	th.start();//illegal thread state exception
		th.run();//doesn't interrupt
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("executing...");
	}


}
