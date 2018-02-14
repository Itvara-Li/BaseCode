package com.coffee.demo;

public class err2 {

	public static void main (String[] args)throws Exception {
		// TODO Auto-generated method stub
		try {
			throw new Exception("wahhahaha");
		} catch (Exception e) {
			System.out.println(e);
		}
try {
	tell(10, 0);
} catch (Exception e) {
	System.out.println("liuwei");
}
	}
public static void tell(int i,int j)throws ArithmeticException {
	int temp=0;
	temp=i/j;
	System.out.println(temp);
}
}
