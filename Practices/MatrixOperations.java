package Practices;

import java.util.*;

/** 
 * @author Omotayo
 *
 * This program is an exercise in the book "Introduction to programming, Comprehensive Version" by Daniel Liang.
 * 
 * This program prompts the user to enter the dimension of the two matrices and performs
 * both addition, subtraction and multiplication on the matrices.
 */

public class MatrixOperations {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the matrices respectively: ");
		int rows = input.nextInt();
		int cols = input.nextInt();
		
		double[][] matrixA = new double[rows][cols];
		double[][] matrixB = new double[rows][cols];
		
		System.out.println("\nEnter matrix A below:");
		for (int row = 0; row < matrixA.length; row++) {
			for (int col = 0; col < matrixA[0].length; col++) {
				matrixA[row][col] = input.nextDouble();
			}
		}
		
		System.out.println("\nEnter matrix B below:");
		for (int row = 0; row < matrixA.length; row++) {
			for (int col = 0; col < matrixA[0].length; col++) {
				matrixB[row][col] = input.nextDouble();
			}
		}
		
		// The following matrix holds the return matrix after adding matrices A and B.
		double[][] matrixC = addMatrices(matrixA, matrixB);
		String addMatrices = "addition";
		
		// This prints the addition of the matrices.
		printMatrix(matrixC, addMatrices);
		
		// The following matrix holds the return matrix after subtracting matrix B from A.
		double[][] matrixE = subtractMatrix(matrixA, matrixB);
		String sub = "subtraction";
				
		// This prints the addition of the matrices.
		printMatrix(matrixE, sub);
		
		// The following matrix holds the return matrix after multiplying matrices A and B.
		double[][] matrixD = multiplyMatrices(matrixA, matrixB);
		String multiply = "multiplication";
		
		// This prints the addition of the matrices.
		printMatrix(matrixD, multiply);
				
	}
	
	/**
	 *  This method does the addition of the matrices.
	 * @param matrix_a
	 * @param matrix_b
	 * @return matrix_c
	 */
	public static double[][] addMatrices(double[][] matrix_a, double[][] matrix_b) {
		double[][] matrix_c = new double[matrix_a.length][matrix_a[0].length];
		for (int row = 0; row < matrix_c.length; row++) {
			for (int col = 0; col < matrix_c[0].length; col++) {
				matrix_c[row][col] = matrix_a[row][col] + matrix_b[row][col];
			}
		}
		
		return matrix_c;
	}
	

	/**
	 *  This method does the addition of the matrices.
	 * @param matrix_a
	 * @param matrix_b
	 * @return matrix_e
	 */
	public static double[][] subtractMatrix(double[][] matrix_a, double[][] matrix_b) {
		double[][] matrix_e = new double[matrix_a.length][matrix_a[0].length];
		for (int row = 0; row < matrix_e.length; row++) {
			for (int col = 0; col < matrix_e[0].length; col++) {
				matrix_e[row][col] = matrix_a[row][col] - matrix_b[row][col];
			}
		}
		
		return matrix_e;
	}
	
	/**
	 *  This method does the multiplication of the matrices.
	 * @param matrix_a
	 * @param matrix_b
	 * @return matrix_d
	 */
	public static double[][] multiplyMatrices(double[][] matrix_a, double[][] matrix_b) {
		double[][] matrix_d = new double[matrix_a.length][matrix_a[0].length];
		
		// Check if the two matrices can be multiplied.
		if (matrix_a.length == matrix_b[0].length) {
			
			for (int row = 0; row < matrix_a.length; row++) {
				int count = 0;
				for (int col = 0; col < matrix_a[0].length; col++) {
					int newRow = 0;
					int newCol = 0;
					double sum = 0.0;

					while (newRow < matrix_a.length && newCol < matrix_a[0].length) {
						sum += matrix_a[row][newCol] * matrix_b[newRow][col];
						newCol++;
						newRow++;
					}
					
					matrix_d[row][count++] = sum;
				}
			}

			return matrix_d;
		}
		
		return null;
	}
	
	/**
	 * This method does the printing of the matrix.
	 * @param matrix
	 * @param operation
	 */
	public static void printMatrix(double[][] matrix, String operation) {
		System.out.println("\nThe " + operation + " of matrices A and B gives the matrix below:");
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.printf("%-5.1f", matrix[row][col] );
			}
			System.out.println();
		}
	}

}
