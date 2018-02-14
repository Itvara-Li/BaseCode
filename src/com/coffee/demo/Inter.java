package com.coffee.demo;

interface USB{
	void start();
	void stop();
	
}
class C{
	public static void work(USB usb) {
		usb.start();
		System.out.println("������");
		usb.stop();
	}
}
class USBdisk implements USB{
	public void start() {
		System.out.println("U�̹���");
	}
	public void stop() {
		System.out.println("U��ֹͣ");
	}
}
class Printer implements USB{
	public void start() {
		System.out.println("��ӡ������");
	}
	public void stop() {
		System.out.println("��ӡ��ֹͣ");
	}
}
public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C.work(new USBdisk());
C.work(new Printer());
	}

}
