package com.Anuj.HW;

import java.util.Scanner;

public class GreatestNumber {

	public int check(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		GreatestNumber g1 = new GreatestNumber();
		int ans = g1.check(a, b, c);
		System.out.println(ans + " is Biggest Number");

	}

}
