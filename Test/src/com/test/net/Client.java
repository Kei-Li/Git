package com.test.net;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		/*Dosomething d = new Dosomething();
		MyThreadA mtA = new MyThreadA(d);
		MyThreadB mtB = new MyThreadB(d);
		
		new Thread(mtA).start();
		Thread.sleep(1);
		new Thread(mtB).start();
		System.identityHashCode();*/
		s(2);
	}
	private static void s(int n){
		int r = 0;
		switch(n){
			case 1 : 
				{
					r = r + n;
					}
			case 2 :
				r = r + n;
			case 3 :
				r = r + n;
			default :
				r = r + n;	
		}
		System.out.println(r);
	}
}
