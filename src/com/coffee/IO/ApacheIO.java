package com.coffee.IO;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ApacheIO {

	public static void main(String[] args) {
    File file=new File("liuwei.txt");
    File file2=new File("liuwei1.txt");
		try {
//		String input=FileUtils.readFileToString(file,"UTF-8");
//		System.out.println(input);
			FileUtils.copyFile(file, file2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
