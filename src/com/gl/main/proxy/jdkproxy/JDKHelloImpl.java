package com.gl.main.proxy.jdkproxy;

public class JDKHelloImpl implements JDKHello{

	@Override
	public void say() {
		// TODO 自动生成的方法存根
		System.out.println("执行say()动作。。。。。");
	}

	@Override
	public int add() {
		// TODO 自动生成的方法存根
		return 10000;
	}
	
	
	public void other() {
		System.out.println("新增方法。。。。。");
	}
	
}
