package com.gl.main.javasenior.anonclass;

import javax.swing.text.AbstractDocument.Content;

import com.gl.main.javasenior.anonclass.Goods.GDestination;

public class Main {
	public static void main(String[] args) {
		Goods p = new Goods();
		Goods.GDestination innerGD = p.new GDestination("北京");
		innerGD.readLabel();
		System.out.println("--------------------");
		
		System.out.println("--------------------");
		
		System.out.println("--------------------");
		p.cont().value();
		p.dest("南京").readLabel();
	}
}
