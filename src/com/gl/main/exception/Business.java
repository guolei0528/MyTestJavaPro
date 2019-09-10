package com.gl.main.exception;

public class Business {
	
	public void exception() throws MyException {
		
		System.out.println("--------------");
		
		
		throw new MyException("自定义异常");
			
			
		
	}
	
}
