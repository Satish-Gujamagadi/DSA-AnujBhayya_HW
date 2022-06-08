package com.Anuj.HW;

import java.util.Scanner;

public class InchTOMtr {

	public double converter(int inch) {
		double val = ((inch * 25.4) / 1000);

		return val;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Inch value : ");
		int inch = sc.nextInt();
		InchTOMtr in = new InchTOMtr();
		double value = in.converter(inch);
		System.out.println("Converted Value : "+value+" mtr");

	}

}
