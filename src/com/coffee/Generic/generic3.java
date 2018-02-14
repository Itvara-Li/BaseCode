package com.coffee.Generic;
class Info<T>{
	private T key;
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getKey().toString();
	}
	
}
public class generic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Info<String> info=new Info<String>();
info.setKey("liuwei");
tell(info);
	}
public static void tell(Info<?> info) {
	System.out.println(info);
}
}
