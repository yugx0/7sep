package com;

public class Triangle extends TwoDimentionalShape {
	float areaoftriangle;
	Triangle(float base,float height) {
		super(base, height);		
	}
	
	// For calculating area of triangle
	void getArea() {
		areaoftriangle=(((float)0.5)*(getDimention1()*getDimention2()));
		System.out.println("Area of triangle : "+areaoftriangle);
	}

	private int getDimention2() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getDimention1() {
		// TODO Auto-generated method stub
		return 0;
	}
}