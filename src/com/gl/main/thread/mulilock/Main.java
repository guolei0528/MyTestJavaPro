package com.gl.main.thread.mulilock;

public class Main {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		new Thread(t1,"t1线程").start();
		new Thread(t2,"t2线程").start();
		
	}
}
