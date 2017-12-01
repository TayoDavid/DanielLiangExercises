package Practices;

import java.util.Scanner;

/** 
 * @author Omotayo
 *
 * This program is an exercise in the book "Introduction to programming, Comprehensive Version" by Daniel Liang.
 * 
 * The program computes the sum of the values in each column of a matrix.
 */

public class SumTheColumnOfAMatrix {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows in the matrix: ");
		int rows = input.nextInt();
		System.out.print("Enter the number of columns in the matrix: ");
		int cols = input.nextInt();
		
		double[][] matrix = new double[rows][cols];
		
		System.out.println("\nEnter the values of the matrix below:");
		
		// Enter the values in the matrix.
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = input.nextDouble();
			}
		}
		
		System.out.println();
		// This prints the sum of each column in the matrix 
		for (int col = 0; col < cols; col++) {
			System.out.println("The sum of values in column " + col + " is " + sumColumn(matrix, col));
		}
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0.0;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][columnIndex];
		}
		return sum;
	}

}
