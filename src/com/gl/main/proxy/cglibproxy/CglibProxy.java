package com.gl.main.proxy.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 无需接口都可使用该代理
* @ClassName: CglibProxy
* @Description: TODO(这里用一句话描述这个类的作用)
* @author gl
* @date 2019年8月26日
*
 */
public class CglibProxy implements MethodInterceptor{
	
	/***
     * 快速创建动态代理对象
     * @param cls 需要代理的字节码对象
     * @return 代理对象
     */
    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls,this);
    }
	
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		// TODO 自动生成的方法存根
		 before();
        //执行原方法
        Object result = proxy.invokeSuper(obj, args);

        after();
        return result;
	}
	
	
	 private void after() {
	     System.out.println("之前");
	 }

    private void before() {
        System.out.println("之后");
    }
}
