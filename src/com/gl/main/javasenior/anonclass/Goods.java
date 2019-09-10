package com.gl.main.javasenior.anonclass;


/**
 * 使用内部类开发
* @ClassName: Goods
* @Description: TODO(这里用一句话描述这个类的作用)
* @author gl
* @date 2019年9月10日
*
 */
public class Goods {
	
	private String name = "外部类名称";
	
	//内部类Content
	private class Content implements Contents{
		
		private int i = 11;
		
		private String name = "内部类名称";
		
		
		@Override
		public int value() {
			
			// TODO 自动生成的方法存根
			System.out.println("value："+i);
			System.out.println("当内部类成员变量与外部类成员变量同名的时候，在内部类使用这个成员变量用的是内部成员变量的，即覆盖了外部成员变量："+name);
			System.out.println("那么想在内部类中使用这个重名的外部类的成员变量怎么办?回答：用outerClass.this.XX:"+Goods.this.name);
			return i;
		}
	}
	
	//内部类GDestination
	protected class GDestination implements Destination{
		private String label; 
		
		public GDestination(String label) {
			super();
			this.label = label;
		}

		@Override
		public String readLabel() {
			// TODO 自动生成的方法存根
			System.out.println("readLabel:"+label);
			return label;
		}
		
		
	}
	
	static class StaticGD{
		
	}
	
	
	public Contents cont() {
		return new Content();
	}
	
	public Destination dest(String s) {
		return new GDestination(s);
	}
	
	
	
}


class TestGoods {
	
	
}



