package com.gl.main.io;


public class Main {
	public static void main(String[] args) {
		long beginTime = System.currentTimeMillis();
		
		new Thread(new ThreadIO1("d:\\bean1.txt", 0, 1000)).start();
		new Thread(new ThreadIO1("d:\\bean2.txt", 1000, 1000)).start();
		new Thread(new ThreadIO1("d:\\bean3.txt", 2000, 1000)).start();
		
		long endTime = System.currentTimeMillis();
		System.out.println("耗时:"+(endTime-beginTime)+"ms");
	}
}
