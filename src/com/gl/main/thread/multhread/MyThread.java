package com.gl.main.thread.multhread;

public class MyThread implements Runnable{
	
	private  int count = 6;
	
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		count --;
		System.out.println(Thread.currentThread().getName() + " count = "+ count);
	}

}
