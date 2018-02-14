package com.coffee.demo;
class Ex{
	int a=10;
	int b=0;
}
public class err {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c=0;
Ex ex=null;
ex=new Ex();
try {
	c=ex.a/ex.b;
} catch (ArithmeticException e) {
	System.out.println(e);
}finally {
	System.out.println("dddd");
}
	}

}
