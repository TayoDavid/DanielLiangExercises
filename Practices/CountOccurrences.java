package Practices;

/** 
 * @author Omotayo
 *
 * This program is an exercise in the book "Introduction to programming, Comprehensive Version" by Daniel Liang.
 * 
 * The program generates and stores 100 random numbers between 0 and 9 in an array.
 * It then counts the number of occurrence of each of the digits.
 *  
 */

public class CountOccurrences {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		int[] counts = new int[10];
		
		// This method store generate the random numbers and store them.
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 10);
		}
		
		// This method counts the number of occurrences of the digits.
		for (int i = 0; i < numbers.length; i++) {
			counts[numbers[i]]++;
		}
		
		// This method prints to the console the digits and their number of occurrence.
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + " = " + counts[i]);
		}
	}

}
