package com.gl.main.thread.reentrant.main;

import java.util.Iterator;
import java.util.Map;



public class AgainPrint {
	Lock lock = new Lock();
	
	
	
	//打印一份文件
	public void print(){
		System.out.println("想打印文件print()"+"当前线程："+Thread.currentThread().getName());
        lock.lock();
        doAdd();
        doAdd();
        lock.unlock();
    }
	
	
	//再打印一份
    public void doAdd(){
    	System.out.println("想再打印一份doAdd()"+"当前线程："+Thread.currentThread().getName());
        lock.lock();
        //do something
        System.out.println("-----------我是还想打印-------------");
        
        lock.unlock();
    }
    
    
    //这时候会出现不可重入锁情况，处于wait状态，锁又没有释放，相当于打印完，叫你去排队，你带着钥匙到后面排队了，所有人都拿不到钥匙了，死锁
    public static void main(String[] args) {
    	
    	Map<Thread, StackTraceElement[]> maps = Thread.getAllStackTraces();
    	System.out.println("当前线程数："+maps.size());
    	Iterator<Map.Entry<Thread, StackTraceElement[]>> entries  = maps.entrySet().iterator();
    	while(entries .hasNext()) {
    		Map.Entry<Thread, StackTraceElement[]> entry  = entries.next();
    		System.out.println(entry.getKey()+"---"+entry.getValue());
    		StackTraceElement[] ary  =  entry.getValue();
    		for(StackTraceElement sta : ary) {
    			System.out.println(sta.getClassName());
    		}
    		
    		
    	}
    	
    	System.out.println("当前线程："+Thread.currentThread().getName());
    	AgainPrint ap = new AgainPrint();
    	ap.print();
    	System.out.println("当前线程："+Thread.currentThread().getName());
	}
}
