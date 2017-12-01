package Practices;
import java.util.*;

/** 
 * @author Omotayo
 *
 * This program is an exercise in the book "Introduction to programming, Comprehensive Version" by Daniel Liang.
 * 
 * The program prints a series of number in the form of a right sided triangle.
 */

public class RightTrianglePattern {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		printTriangle(number);
	}

	private static void printTriangle(int number) {
		int count = 1;
		
		do {
			for (int i = number; i >= 1; i--) {
				if (i > count) {
					System.out.print("  ");
				}else {
					System.out.print(i + " ");
				}
			}
		
			System.out.println();
			count++;
			
		} while (count <= number);
	}
}
