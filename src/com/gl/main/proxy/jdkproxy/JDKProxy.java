package com.gl.main.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * jdk自带，必须有接口的类才可以使用该代理
* @ClassName: JDKProxy
* @Description: TODO(这里用一句话描述这个类的作用)
* @author gl
* @date 2019年8月26日
*
 */
public class JDKProxy implements InvocationHandler{
	
	private Object target;
	
	public JDKProxy(Object target) {
		super();
		this.target = target;
	}




	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO 自动生成的方法存根
		after();
		Object result = method.invoke(target, args);
		System.out.println(result);
		before();
		return result;
	}
	
	private void after() {
        System.out.println("真实对象执行动作之前。。。。");
    }

    private void before() {
        System.out.println("真实对象执行动作之后。。。。");
    }

}
