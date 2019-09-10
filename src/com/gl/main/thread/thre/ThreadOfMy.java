package com.gl.main.thread.thre;

public class ThreadOfMy implements Runnable{
	
	Thing1 t1 = new Thing1();
	
	Thing2 t2 = new Thing2();
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		System.out.println("------------当前线程"+Thread.currentThread().getName());
		t1.doTh();
		t1.doTh1();
		
		
	}

}
