package com.coffee.Thread;

public class Thead1_1 extends Thread {
private String name;
public Thead1_1(String name) {
 this.name=name;
}
@Override
	public void run() {
   for (int i = 0; i < 1000; i++) {
	System.out.println(name+i);
}
	super.run();
	}
}
