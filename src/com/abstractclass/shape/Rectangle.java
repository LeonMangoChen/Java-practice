package com.abstractclass.shape;

public class Rectangle extends Shape {

	@Override
	public double perimeter(double a, double b) {
		// TODO Auto-generated method stub
		return (a+b)*2;
	}

	@Override
	public double area(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
