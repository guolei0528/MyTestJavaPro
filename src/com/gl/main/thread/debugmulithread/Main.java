package com.gl.main.thread.debugmulithread;

//https://blog.csdn.net/binyao02123202/article/details/18361755
/**
 * 主要学会在多线程环境下如何调试
* @ClassName: Main
* @Description: TODO(这里用一句话描述这个类的作用)
* @author gl
* @date 2019年8月22日
*
 */
public class Main {
	
	public static void main(String[] args) {
		SingThread s1 = new SingThread();
		
		SingThread s2 = new SingThread();
		
		new Thread(s1).start();
		
		new Thread(s2).start();
	}
}
