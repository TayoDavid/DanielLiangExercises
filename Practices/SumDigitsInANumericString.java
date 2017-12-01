package Practices;

import java.util.*;

/** 
 * @author Omotayo
 *
 * This program is an exercise in the book "Introduction to programming, Comprehensive Version" by Daniel Liang.
 * 
 * The program gets a numeric string from the user and compute the sum of digits in the string.
 */

public class SumDigitsInANumericString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		long number = input.nextLong();
		
		int sum = sumDigit(number);
		System.out.println("The sum of the digits in " + number + " = " + sum);
	}

	private static int sumDigit(long number) {
		int sum = 0;
		while (number > 0) {
			int remainder = (int) (number % 10);
			sum = sum + remainder;
			number = number / 10;
		}
		return sum;
	}

}
