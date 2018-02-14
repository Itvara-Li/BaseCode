package com.coffee.File;

import java.io.File;

public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File aaa=new File("1/2/3/4");
		aaa.mkdirs();	
File file=new File("liuwei.txt");
if (file.exists()) {
	File nameto=new File("haha.txt");
	file.renameTo(nameto);
//	file.delete();
//	System.out.println("delete");
//	System.out.println(file.isFile());
//	System.out.println(file.isDirectory());
}else {
	System.out.println("!!");
	try {
		file.createNewFile();
	} catch (Exception e) {
		System.out.println("can not create");
	}
}

	}

}
