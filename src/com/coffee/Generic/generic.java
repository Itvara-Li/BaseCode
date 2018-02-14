package com.coffee.Generic;

import java.awt.Point;

class point<T>{
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
}
public class generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
point<String> point=new point<String>();
point.setX("109");
point.setY("100");
System.out.println(point.getX()+" "+point.getY());
	}

}
