package com.gl.main.thread.multhread;

public class Main {
	public static void main(String[] args) {
		
//		new Thread(new MyThread(),"t1").start();
//		new Thread(new MyThread(),"t2").start();
//		new Thread(new MyThread(),"t3").start();
//		new Thread(new MyThread(),"t4").start();
//		new Thread(new MyThread(),"t5").start();
		
//打印结果：因为创建了五个不同的MyThread对象，每个对象里面的共享资源独立的，不存在资源的竞争，每个对象独享自己的资源		
//		t1 count = 5
//		t3 count = 5
//		t5 count = 5
//		t2 count = 5
//		t4 count = 5

		
		MyThread th = new MyThread();
		new Thread(th,"t1").start();
		new Thread(th,"t2").start();
		new Thread(th,"t3").start();
		new Thread(th,"t4").start();
		new Thread(th,"t5").start();
//打印结果：创建了五个线程去公用一个对象，对这个对象中的共享资源进行操作，带来了线程同步问题	使用关键字synchronized、
// volatile仅仅保证了共享资源的可见性，即：对修改共享资源保证其他线程刷新自己工作内存中的这个共享资源的值， 
//		注意，该关键字不保证操作的原子性，即：仅仅使用该关键字，在对共享资源进行非原子操作的时候 count--，有可能导致线程不安全！如果是原子操作那没得讲是OK的！！！
//			因此建议在对共享资源进行非原子操作时，用	volatile + 	synchronized ，当然还有其它轻量级的锁和机制保证线程安全!
//		t2 count = 4
//		t1 count = 4
//		t3 count = 3
//		t4 count = 2
//		t5 count = 1

		
	}
}
