package com.gl.main.thread.mulilock;

public class MyThrd1 {
	
	private volatile int num = 4;
	
	public synchronized void pikNum() {
		System.out.println(Thread.currentThread().getName());
		num --;
		
	}
	
	public int getNum() {
		System.out.println(Thread.currentThread().getName()+"MyThrd1,num值"+num);
		return num;
	}
	
}
