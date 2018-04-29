package com.abstractclass.shape;

public class Circle extends Shape {

	@Override
	public double perimeter(double a, double b) {
		// TODO Auto-generated method stub
		return 2*a*b;
	}

	@Override
	public double area(double a, double b) {
		// TODO Auto-generated method stub
		return a*b*b;
	}

}
