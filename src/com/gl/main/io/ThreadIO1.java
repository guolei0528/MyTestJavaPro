package com.gl.main.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;



public class ThreadIO1 implements Runnable{
	
	String filePath = "";
	int beginNum;
	int size;

	public ThreadIO1(String filePath, int beginNum, int size) {
		super();
		this.filePath = filePath;
		this.beginNum = beginNum;
		this.size = size;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根

		OutputStreamWriter out= null;
		try {
			out=new OutputStreamWriter(new FileOutputStream(filePath),"UTF-8");
			
			int i = 0;
			while(i<800000) {
				out.write("OBUID:OBUID"+i+"  LICENSE:LICENSE"+i+" CARDID:CARDID"+i+"\r\n");
				i++;
			}
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			//清楚缓存
	        try {
				out.flush();
				//关闭流
		        out.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	        
		}
		
	}
	
	
	
}
