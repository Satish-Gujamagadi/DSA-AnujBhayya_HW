package com.Anuj.HW;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AVG Marks");

		int marks = sc.nextInt();

		if (marks < 35) {
			System.out.println("Result : FAIL");
		}
		if (marks > 35 && marks < 60) {
			System.out.println("Result : Second Class");
		}
		if (marks > 60 && marks < 75) {
			System.out.println("Result : Firstclass");
		}
		if (marks > 75) {
			System.out.println("Result : Distiction");
		}

	}

}
