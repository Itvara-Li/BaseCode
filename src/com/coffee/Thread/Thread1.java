package com.coffee.Thread;
/**
 * start,yield,sleep,wait,suspend,resume,stop
 * 
 *
 */
public class Thread1 {
	public static void main(String[] args) {
//Thead1_1 t1=new Thead1_1("liu");
//Thead1_1 t2=new Thead1_1("wei");
//t1.start();
//t2.start();
Thread1_2 r1=new Thread1_2("a");
Thread1_2 r2=new Thread1_2("b");
Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
System.out.println(t1.isAlive());
t1.start();t2.start();

for (int i = 0; i < 50; i++) {
	if (i>10) {
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("Ö÷Ïß³Ì"+i);
}

System.out.println(t1.isAlive());
	}

}
