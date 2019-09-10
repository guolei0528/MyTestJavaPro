package com.gl.main.exception;

public class MainTest {
	public static void main(String[] args) {
		Business b1 = new Business();
		
		try {
			b1.exception();
		} catch (MyException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
//		try {
//			b1.exception();
//		} catch (MyException e) {
//			// TODO 自动生成的 catch 块
//			
//			e.printStackTrace();
//		}
	}
}
