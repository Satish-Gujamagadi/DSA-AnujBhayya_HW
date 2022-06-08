package com.Anuj.HW;

public class AreaOfCircle {
	
	public double area(int r) {
		double val = (3.14*r*r);
		return val;
	}
	
	public void perimeter(int r) {
		System.out.println(2*3.14*r);
	}

	public static void main(String[] args) {
		AreaOfCircle a1 = new AreaOfCircle();
		double area = a1.area(3);
		System.out.println(area + " mm^2");
		a1.perimeter(3);

	}

}
