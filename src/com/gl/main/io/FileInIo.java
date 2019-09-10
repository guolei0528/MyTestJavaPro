package com.gl.main.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;

public class FileInIo {
	
	public static void main(String[] args) throws IOException {

        //写入相应的文件
        PrintWriter out = new PrintWriter(new FileWriter("d:\\2.txt"));
//		 OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("d:\\utf_8.txt"),"UTF-8");
        //读取数据
        //循环取出数据
        byte[] bytes = new byte[1024];
        int i = -1;
 
        while (i<10000) {
            System.out.println(i);
            //写入相关文件
            out.write(i+""+"\r\n");
            i++;
        }
        //清楚缓存
        out.flush();
        //关闭流
        out.close();
		
	}
	
}
