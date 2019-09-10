package com.gl.main.thread.mulilock;

public class MyThrd2 {
	
	private volatile int num1 = 6;
	
	public synchronized void pikNum() {
		System.out.println(Thread.currentThread().getName());
		num1 --;
	}
	
	public int getNum() {
		System.out.println(Thread.currentThread().getName()+"MyThrd2,num值"+num1);
		return num1;
	}
	
}
