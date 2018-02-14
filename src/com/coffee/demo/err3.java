package com.coffee.demo;

class MyEx extends Exception{
	public MyEx(String msg) {
 super(msg);
	}
}
public class err3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	throw new MyEx("liuwei");
} catch (Exception e) {
	System.out.println(e);
}
	}

}
