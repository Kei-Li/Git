package com.test.net;

public class Dosomething {

	public synchronized void A() throws InterruptedException{
		Thread.sleep(10000);
		System.out.println("This is A");
	}
	
	public synchronized void B() throws InterruptedException{
		System.out.println("This is B");
	}
}
