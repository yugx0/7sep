package com;

public class Square extends TwoDimentionalShape{
	float areaofsquare;
	Square(float side){
		super(side);
	}
	// for calculating the area	
	void getArea() {
		areaofsquare=getDimention1()*getDimention1();
		System.out.println("Area of Square : "+areaofsquare);
	}
	private int getDimention1() {
		// TODO Auto-generated method stub
		return 0;
	}

}