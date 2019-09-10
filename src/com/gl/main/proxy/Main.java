package com.gl.main.proxy;

import java.lang.reflect.Proxy;

import com.gl.main.proxy.cglibproxy.CglibHello;
import com.gl.main.proxy.cglibproxy.CglibProxy;
import com.gl.main.proxy.jdkproxy.JDKHello;
import com.gl.main.proxy.jdkproxy.JDKHelloImpl;
import com.gl.main.proxy.jdkproxy.JDKProxy;

public class Main {
	
	public static void main(String[] args) {
		JDKHello jdkHello = new JDKHelloImpl();
		
		JDKProxy jdkProxy = new JDKProxy(jdkHello);
		
		JDKHello objPro = (JDKHello) Proxy.newProxyInstance(jdkHello.getClass().getClassLoader(), jdkHello.getClass().getInterfaces(), jdkProxy);
		objPro.say();
		objPro.add();
		
		System.out.println("-------------------------");
		
		CglibProxy cgLibProxy = new CglibProxy();
		CglibHello cgLibHelloProxy = cgLibProxy.getProxy(CglibHello.class);
		cgLibHelloProxy.make();
	}
	
}
