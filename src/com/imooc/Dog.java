package com.imooc;

public class Dog extends Animal {
	public void eat(){
		System.out.println("狗具有吃东西的能力");
	}
	public Dog(){
		System.out.println("Dog类执行了");
	}
	public void method(){
		System.out.println(super.age);
		super.eat();
	}
}
