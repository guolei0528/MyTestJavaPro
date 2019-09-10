package com.gl.main.thread.thre;

public class Main {
	public static void main(String[] args) {
		
		ThreadOfMy th = new ThreadOfMy();
		
		new Thread(th).start();
		
		new Thread(th).start();
	}
}
