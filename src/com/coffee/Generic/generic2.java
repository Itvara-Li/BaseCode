package com.coffee.Generic;
class com<K,T>{
	private T va;
	private K ka;
	public K getKa() {
		return ka;
	}
	public void setKa(K ka) {
		this.ka = ka;
	}
	public com(T va) {
		// TODO Auto-generated constructor stub
		this.va=va;
	}
	public T getVa() {
		return va;
	}
	public void setVa(T va) {
		this.va = va;
	}
}
public class generic2 {

	public static void main(String[] args) {
		com<Integer,String> com=new com("ssssss");
		com.setKa(30);
		System.out.println(com.getKa());

	}

}
