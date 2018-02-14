package com.coffee.File;

import java.io.File;

public class file2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printFile(new File("../Poldemo"),1);
	}
public static void printFile(File dir,int tab) {
	if (dir.isDirectory()) {
	File next[]=dir.listFiles();
	for (int i = 0; i < next.length; i++) {
		for (int j = 0; j < tab; j++) {
			System.out.print("|--");
		}
		System.out.println(next[i].getName());
		if (next[i].isDirectory()) {
			printFile(next[i],tab+1);
		}

	}
	}
}
}
