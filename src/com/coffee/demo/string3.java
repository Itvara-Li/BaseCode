package com.coffee.demo;

public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer s1=new StringBuffer();//StringBuider单线程使用
s1.append("liuwei");
for (int i = 0; i < 100; i++) {
	s1.append(i);
}
System.out.println(s1.toString());
	}

}
