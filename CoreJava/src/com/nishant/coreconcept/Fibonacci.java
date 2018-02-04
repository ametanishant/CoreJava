package com.nishant.coreconcept;

public class Fibonacci {

	// Print First 10 Fibonacci number

	public static void main(String[] args) {

		int number1 = 0, number2 = 1;

		for (int i = 1; i <= 10; i++) {
			System.out.print(number1 + " ");

			int sum = number1 + number2;
			number1 = number2;
			number2 = sum;

		}

	}
}