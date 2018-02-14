package com.coffee.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RWBufferCharStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream fis=new FileInputStream("java.txt");
	FileOutputStream fos=new FileOutputStream("javaliu.txt");
	InputStreamReader isr=new InputStreamReader(fis);
	OutputStreamWriter osw=new OutputStreamWriter(fos, "UTF-8");
	BufferedReader br=new BufferedReader(isr);
	PrintWriter pw=new PrintWriter(osw,true);
//	BufferedWriter bw=new BufferedWriter(osw);
	String input;
	while ((input=br.readLine())!=null) {
		pw.println(input);
//		bw.write(input);
	}
	//pw.flush();
//	bw.flush();
	br.close();
	pw.close();
	isr.close();
	osw.close();
	fos.close();
	fis.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (UnsupportedEncodingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
