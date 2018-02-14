package com.coffee.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class file4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file=new File("text.txt");
if (file.exists()) {
	System.out.println("exist");
	try {
		FileInputStream inputStream=new FileInputStream(file);
	InputStreamReader inputStreamReader=new InputStreamReader(inputStream,"UTF-8");
	BufferedReader bReader=new BufferedReader(inputStreamReader);
	
	String Line;
	while ((Line=bReader.readLine())!=null) {
		System.out.println(Line);
	}
	bReader.close();
	inputStreamReader.close();
	inputStream.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
} else {
 File newfile=new File("text.txt");
 try {
	FileOutputStream fileOutputStream=new FileOutputStream(newfile);
	 OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream, "UTF-8");
	 BufferedWriter bWriter=new BufferedWriter(outputStreamWriter);
	 bWriter.write("liuwei\n");
	 bWriter.write("liuwei\n");
	 bWriter.write("liuwei\n");
	 bWriter.write("liuwei\n");
	 bWriter.write("liuwei\n");
	 bWriter.write("liuwei\n");
	 bWriter.write("liuwei\n");
	
	 bWriter.close();
	 outputStreamWriter.close();
	 fileOutputStream.close();
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (UnsupportedEncodingException e) {
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
	}

}
