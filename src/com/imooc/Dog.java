package com.imooc;

public class Dog extends Animal {
	public void eat(){
		System.out.println("�����гԶ���������");
	}
	public Dog(){
		System.out.println("Dog��ִ����");
	}
	public void method(){
		System.out.println(super.age);
		super.eat();
	}
}
