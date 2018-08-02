package com.test.net;

public class MyThreadB implements Runnable {
	Dosomething t;
	public MyThreadB(Dosomething t){
		this.t = t;
	}
	@Override
	public void run() {
		try {
			t.B();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
