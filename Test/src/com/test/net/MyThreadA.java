package com.test.net;

public class MyThreadA implements Runnable {
	Dosomething t;
	public MyThreadA(Dosomething t){
		this.t = t;
	}
	@Override
	public void run() {
		try {
			t.A();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
