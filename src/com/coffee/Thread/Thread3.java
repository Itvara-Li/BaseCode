package com.coffee.Thread;
class MyThread implements Runnable
{
	private int ticke=50;
  @Override
public void run() {
  for (int i = 0; i < 10; i++) {
	  synchronized (this) {
	  if (ticke>0) {
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ticke--);
		}
	}
}
//  tell();
}
  public synchronized void tell() {
	  for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(ticke++);
		}
}
}
public class Thread3 {

	public static void main(String[] args) {
   MyThread m=new MyThread();
   Thread t1=new Thread(m,"a");
   Thread t2=new Thread(m,"b");
   Thread t3=new Thread(m,"c");
   t1.start();t2.start();t3.start();
	}

}
