package com.coffee.Generic;
interface GenInfo<T>{
	public void say();
}
class Gin<T> implements GenInfo<T>{
	private T info;
	public Gin(T info) {
		this.info=info;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * ·ºÐÍ·½·¨
	 * @param t
	 * @return
	 */
	public <K>K tell(K t) {
		return t;
	}
	public <W>void haha(W arr[]) {	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
public class generic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Gin<String> gin=new Gin<String>("hahah");
gin.getInfo();

	}

}
