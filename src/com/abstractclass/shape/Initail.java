package com.abstractclass.shape;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle();
		double rectanglePerimeter = rectangle.perimeter(1.5 ,2.8);
		System.out.println("���ε��ܳ�Ϊ"+rectanglePerimeter);
		double rectangleArae = rectangle.area(2.5, 3.6);
		System.out.println("���ε����" + rectangleArae);
	}

}
