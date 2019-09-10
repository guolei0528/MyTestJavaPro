package com.gl.main.other;

/**
 * java8中接口方法（默认方法、static静态方法）
 * 以前，接口里的方法要求全部是抽象方法，java8以后允许在接口里定义默认方法和类方法。不同的是：
默认方法可以通过实现接口的类实例化的对象来调用,而类方法就相对于工具方法了。需要注意的是，此处的静态方法只能被public修饰（或者省略不写），不能是private或者protected

java接口中可以定义常量，所有定义的成员变量都会自动加上“public static final”修饰,接口里的“变量”是不可变的,只能定义常量，不能定义变量。
public interface test
{
    int a=10;
    public static final int b=10;
}
* @ClassName: ItInter
* @Description: TODO(这里用一句话描述这个类的作用)
* @author gl
* @date 2019年8月22日
*
 */
public interface ItInter {
	int i =1;
	
	 default void show() {
		 System.out.println("11111111");
		 
		 System.out.println(i+"kkkkk");
		 show1();
		 
	 }
	
	 static void show1() {
		 System.out.println("22222");
	}
	
	void show2();
	
}
