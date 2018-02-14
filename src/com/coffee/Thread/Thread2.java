package com.coffee.Thread;
class ThRun implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+":"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class Thread2 {

	public static void main(String[] args) {
		Thread t1=new Thread(new ThRun(), "liu");
		Thread t2=new Thread(new ThRun(), "liu1");
		Thread t3=new Thread(new ThRun(), "liu2");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();t2.start();t3.start();

	}

}
