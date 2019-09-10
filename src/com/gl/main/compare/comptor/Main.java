package com.gl.main.compare.comptor;

import java.util.Arrays;


public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("p1",10);
		
		Person p2 = new Person("p2",12);
		
		Person p3 = new Person("p3",13);
		
		Person[] perArr = new Person[] {p1,p3,p2};
		for(Person p:perArr) {
			System.out.println(p);
		}
		System.out.println("------------------");
		
		Arrays.sort(perArr, new PersonCompor());

		for(Person p:perArr) {
			System.out.println(p);
		}
		System.out.println("------------------");
		
	}
}
