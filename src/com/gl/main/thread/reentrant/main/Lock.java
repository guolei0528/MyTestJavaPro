package com.gl.main.thread.reentrant.main;

/**
 * 可重入锁
 * 设计思路，判断是否当前的线程，即是否同一个人获得了打印权，
 * 	即拿到了开门钥匙，另外增加计数器，即开锁进门和从门内出来次数的相减值，只有值为0，表示准备交接下一人
* @ClassName: Lock
* @Description: TODO(这里用一句话描述这个类的作用)
* @author gl
* @date 2019年8月22日
*
 */
public class Lock {
	boolean isLocked = false;
    Thread  lockedBy = null;
    int lockedCount = 0;
    
    public synchronized void lock() {
    	System.out.println("获得了lock()"+"当前线程："+Thread.currentThread().getName());
    	
    	 Thread thread = Thread.currentThread();
         while(isLocked && lockedBy != thread){
             try {
            	System.out.println("等待中。。。。。wait()");
				wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
         }
         
         System.out.println("获得了锁并打印完了文件"+"当前线程："+Thread.currentThread().getName());
         isLocked = true;
         lockedCount++;
         lockedBy = thread;
         System.out.println("lock()当前lockedCount:"+lockedCount);
    }
    
    public synchronized void unlock(){
    	
    	System.out.println("解锁/释放锁unlock()"+"当前线程："+Thread.currentThread().getName());
    	System.out.println("unlock()当前lockedCount:"+lockedCount);
        if(Thread.currentThread() == this.lockedBy){
            lockedCount--;
            System.out.println("unlock() lockedCount--  当前lockedCount:"+lockedCount);
            if(lockedCount == 0){
                isLocked = false;
                notify();
                System.out.println("唤醒正在等待锁的线程notify()");
            }
        }
    }
    
}
