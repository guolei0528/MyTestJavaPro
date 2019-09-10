package com.gl.main.compare;

import java.util.Arrays;

/**
 * Comparable和Comparator区别比较
　　Comparable是排序接口，若一个类实现了Comparable接口，就意味着“该类支持排序”。而Comparator是比较器，我们若需要控制某个类的次序，可以建立一个“该类的比较器”来进行排序。

　　Comparable相当于“内部比较器”，而Comparator相当于“外部比较器”。

　　两种方法各有优劣， 用Comparable 简单， 只要实现Comparable 接口的对象直接就成为一个可以比较的对象，但是需要修改源代码。 用Comparator 的好处是不需要修改源代码， 而是另外实现一个比较器， 当某个自定义的对象需要作比较的时候，把比较器和对象一起传递过去就可以比大小了， 并且在Comparator 里面用户可以自己实现复杂的可以通用的逻辑，使其可以匹配一些比较简单的对象，那样就可以节省很多重复劳动了。
* @ClassName: Main
* @Description: TODO(这里用一句话描述这个类的作用)
* @author gl
* @date 2019年8月20日
*
 */
public class Main {
	
	public static void main(String[] args) {
		PersonComable p1 = new PersonComable("p1",10);

		PersonComable p2 = new PersonComable("p2",12);
		
		PersonComable p3 = new PersonComable("p3",13);
		
		PersonComable[] perArr = new PersonComable[] {p1,p3,p2};
		for(PersonComable p:perArr) {
			System.out.println(p);
		}
		System.out.println("------------------");
		Arrays.sort(perArr);
		for(PersonComable p:perArr) {
			System.out.println(p);
		}
		System.out.println("------------------");
		
		
	}
	
}
