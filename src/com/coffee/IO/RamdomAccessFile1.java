package com.coffee.IO;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RamdomAccessFile1 {
 static File file=new File("liuwei.txt");
	public static void main(String[] args) {
//if (file.exists()) {
//	file.delete();
//}
//new RamdomAccessWriteFile(file, 5).start();
//new RamdomAccessWriteFile(file, 2).start();
//new RamdomAccessWriteFile(file, 1).start();
//new RamdomAccessWriteFile(file, 4).start();
//new RamdomAccessWriteFile(file, 3).start();
 try {
	RandomAccessFile raf=new RandomAccessFile(file, "r");
	 raf.seek(40);
	 byte[] str=new byte[10];
	 raf.read(str);
	 String in=new String(str);
	 System.out.println(in);
} catch (IOException e) {
	e.printStackTrace();
}
 
	}

}
