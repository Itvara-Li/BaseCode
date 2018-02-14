package com.coffee.Thread;

public class Thread1_2 implements Runnable {
	private String name;
	public Thread1_2(String name) {
		this.name=name;
		}
	@Override
	public void run() {
		 for (int i = 0; i < 50; i++) {
//			 try {
//				Thread.sleep(1000);
				System.out.println(name+Thread.currentThread().getName()+i);		
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			 
		if (i==10) {
			System.out.println("yield");
			Thread.yield();
		}	 
	}
	}
}
