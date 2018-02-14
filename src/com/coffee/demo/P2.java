package com.coffee.demo;
abstract class Person{
	private int age;
	private String name;
	public Person(int age,String name) {
		// TODO Auto-generated constr	uctor stub
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void want();
	
}
class Student extends Person{
private int score;
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
	public Student(int age, String name,int score) {
		super(age, name);
		// TODO Auto-generated constructor stub
		this.score=score;
	}

	@Override
	public void want() {
		// TODO Auto-generated method stub
	System.out.println(getName()+getAge()+getScore());	
	}
	
}

class Worker extends Person{
private int money;
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
	public Worker(int age, String name,int money) {
		super(age, name);
		// TODO Auto-generated constructor stub
		this.money=money;
	}

	@Override
	public void want() {
		System.out.println(getName()+getAge()+getMoney());	
		
	}
	
}
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student=new Student(10, "ddd", 100);
student.want();
	}

}
