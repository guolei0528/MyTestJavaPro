package com.gl.main.thread.mulilock;

public class Thread1 implements Runnable{
	
	MyThrd1 t1 = new MyThrd1 ();
	
	MyThrd2 t2 = new MyThrd2 ();
	
	
	public  int i = 4;
	
	@Override
	public void run() {
		
		i++;
		// TODO 自动生成的方法存根
		t1.pikNum();
		t1.getNum();
		System.out.println("----------------------"+Thread.currentThread().getName()+"--------------------");
		t2.pikNum();
		t2.getNum();
		System.out.println("i的值:"+i);
	}

}
