package com.gl.main.thread.multhread;

public class MultiThread_Static {
	
	private static int num = 0;
	
	//在静态方法上添加关键字synchronized，表示锁定.class类，属于类级别的锁。
	//存在锁竞争，因为t1获取的和t2获取的都是MultiThread_Static.class锁——类级别的锁,需要竞争锁
	public synchronized static  void printNum(String tag){
		try {
			
			if(tag.equals("a")){
				num = 100;
				System.out.println("tag a, set num over!");
				Thread.sleep(1000);
			} else {
				num = 200;
				System.out.println("tag b, set num over!");
			}
			
			System.out.println("tag " + tag + ", num = " + num);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		//2个对象
		final MultiThread m1 = new MultiThread();
		final MultiThread m2 = new MultiThread();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				m1.printNum("a");//使用m1对象
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override 
			public void run() {
				m2.printNum("b");//使用m2对象
			}
		});		
		
		t1.start();
		t2.start();
	}

	
}
