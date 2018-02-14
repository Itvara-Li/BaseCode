package com.coffee.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RamdomAccessWriteFile extends Thread {
 File file;
 int block;
 int L=10;
 /**
  * 1         2         3        4
  * |---------|---------|--------|---------
  * 0*L       1*L       2*L      3*L
  * @param f
  * @param b
  */
	public RamdomAccessWriteFile(File f,int b) {
this.file=f;
this.block=b;
	}
	@Override
		public void run() {
 try {
	RandomAccessFile raf=new RandomAccessFile(file, "rw");
	raf.seek((block-1)*L);
	raf.writeBytes("liu"+block);
	raf.writeBytes("\n");
	raf.close();
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
	}
}
