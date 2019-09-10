package com.gl.main.other;

public class Main implements ItInter{

	@Override
	public void show2() {
		// TODO 自动生成的方法存根
		System.out.println("poppppppppop");
		show();
		
	}
	
	public static void main(String[] args) {
//		new Main().show2();
//		new Main().show();
		
		ItInter uq = new  Main();
		uq.show();
		System.out.println("--------------");
		uq.show2();
		
	}
	
}
