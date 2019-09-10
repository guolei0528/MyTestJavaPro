package com.gl.main.thread.reentrant;


/**
 * 不可重入锁 https://www.jianshu.com/p/4289299c67a7
* @ClassName: Lock
* @Description: TODO(这里用一句话描述这个类的作用)
* @author gl
* @date 2019年8月22日
*
 */
public class Lock {
	
	private boolean isLocked=false;
	
	
	//加锁
	public synchronized void lock() {
		System.out.println("获得了lock()"+"当前线程："+Thread.currentThread().getName());
		while(isLocked) {
			try {
				System.out.println("等待中。。。。。");
				//说明已经打印过，那么释放锁，排队去
				wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
		
		System.out.println("获得了锁并打印完了文件"+"当前线程："+Thread.currentThread().getName());
		isLocked = true;//将锁交还
		
	}
	
	
	//解锁/释放锁
	public synchronized void unlock(){
		System.out.println("解锁/释放锁unlock()"+"当前线程："+Thread.currentThread().getName());
        isLocked = false;
        notify();
    }

	
}
