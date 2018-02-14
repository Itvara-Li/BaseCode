package com.coffee.demo;

interface USB{
	void start();
	void stop();
	
}
class C{
	public static void work(USB usb) {
		usb.start();
		System.out.println("工作中");
		usb.stop();
	}
}
class USBdisk implements USB{
	public void start() {
		System.out.println("U盘工作");
	}
	public void stop() {
		System.out.println("U盘停止");
	}
}
class Printer implements USB{
	public void start() {
		System.out.println("打印机工作");
	}
	public void stop() {
		System.out.println("打印机停止");
	}
}
public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C.work(new USBdisk());
C.work(new Printer());
	}

}
