package com.Anuj.HW;

import java.util.Scanner;

public class SwapNumbers {

	public static void swapInt(int a, int b) {
		System.out.println("Given Values : " + "a : " + a + " &  b : " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Final Values : " + "a : " + a + " & b : " + b);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values : ");

		int a = sc.nextInt();
		int b = sc.nextInt();

		swapInt(a, b);

	}

}
