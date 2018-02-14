package com.coffee.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadByBufferByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream fis=new FileInputStream("11.jpg");
	BufferedInputStream bis=new BufferedInputStream(fis,1000);
	FileOutputStream fos=new FileOutputStream("22.jpg");
	BufferedOutputStream bos=new BufferedOutputStream(fos,1000);
	
	byte input[]=new byte[100];
	int count=0;
	long before=System.currentTimeMillis();
	while (bis.read(input)!=-1) {
		bos.write(input);
		count++;	
	}
	bis.close();
	fis.close();
	bos.close();
	fos.close();
	System.out.println(System.currentTimeMillis()-before);
	System.out.println(count);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
