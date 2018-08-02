package com.test.tr;

public class P {
	static String a = "a";
	static{
		System.out.println(a);
		System.out.println("p static");
	}
	public P(){
		System.out.println("p struct");
	}
}
