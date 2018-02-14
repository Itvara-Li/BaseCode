package com.coffee.demo;
class A{
	public void tell1() {
		System.out.println("a-tell1");
	}
	public void tell2() {
		System.out.println("a-tell2");
		
	}
}
class B extends A{
	public void tell1() {
		System.out.println("b-tell1");
	}
	public void tell3() {
		System.out.println("b-tell3");
		
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//B b=new B();
//A a=b;
//a.tell1();
//a.tell2();
/////////
A a=new B();
B b=(B)a;

	}

}
