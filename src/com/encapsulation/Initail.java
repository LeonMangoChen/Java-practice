package com.encapsulation;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		System.out.println("animal age:"+animal.age);
		Dog dog = new Dog();
		dog.age = 10;
		dog.name = "xiaotian";
		dog.eat();
		dog.method();
	}

}
