package com.coffee.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriter {

	public static void main(String[] args) {
try {
	FileReader fr=new FileReader("java.txt");
	BufferedReader br=new BufferedReader(fr);
	
	FileWriter fw=new FileWriter("liuwei.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	
	String Line;
	while((Line=br.readLine())!=null) 
	{
		bw.write(Line+"\n");
	}
	bw.flush();
	bw.close();
	fw.close();
	br.close();
	fr.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
