package com.coffee.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadByteStream1 {

	public static void main(String[] args) {
    chuan("11.jpg", "22.jpg");
	}
 public static void chuan(String s1,String s2) {
	try {
		FileInputStream fis=new FileInputStream(s1);
		FileOutputStream fos=new FileOutputStream(s2);
		byte input[]=new byte[fis.available()];
//		while (fis.read()!=-1) {
//			fos.write(input);
//			
//		}
		fis.read(input);
		fos.write(input);
		fis.close();
		fos.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
