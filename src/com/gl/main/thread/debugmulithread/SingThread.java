package com.gl.main.thread.debugmulithread;

public class SingThread implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		System.out.println(Thread.currentThread().getName()+"当前线程。。。。");
		Singleton sg = Singleton.getInstance();
		System.out.println(sg);
	}
	
}
