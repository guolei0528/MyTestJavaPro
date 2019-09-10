package com.gl.main.thread.debugmulithread;

public class Singleton {
	
	private static Singleton instance;

	private Singleton() {

	}
	
	public static Singleton getInstance() {
		
		if(null == instance) {
			System.out.println("--"+instance);
			instance = new Singleton();
		}
		
		return instance;
		
	}
	
	
}
