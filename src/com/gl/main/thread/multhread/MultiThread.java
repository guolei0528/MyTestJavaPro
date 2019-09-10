package com.gl.main.thread.multhread;


/**
 * 多个线程多个锁

多个线程多个锁：多个线程，每个线程都可以拿到自己指定的锁，分别获得锁之后，执行synchronized方法体的内容，互不影响。
* @ClassName: MultiThread
* @Description: TODO(这里用一句话描述这个类的作用)
* @author gl
* @date 2019年8月22日
*
 */
public class MultiThread {
	private  int num = 0;
	
	//不存在锁竞争，因为t1获取的是m1对象的锁，t2获取的是m2对象的锁——对象级别的锁，各自执行代码体内容互不影响
	public synchronized  void printNum(String tag){
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
