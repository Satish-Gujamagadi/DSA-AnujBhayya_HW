package com.Anuj.HW;

import java.util.Scanner;

public class LeapYear {

	public static void leapCheck(int year) {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {

			System.out.println(year + " is Leap year");
		} else {
			System.out.println(year + " Not a Leap year");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");

		int year = sc.nextInt();
		leapCheck(year);

	}

}
