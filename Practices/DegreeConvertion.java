package Practices;
/** 
 * @author Omotayo
 *
 * This program is an exercise in the book "Introduction to programming, Comprehensive Version" by Daniel Liang.
 * 
 * The program converts from celsius to fahrenheit and from fahrenheit to celsius.
 */

public class DegreeConvertion {

	public static void main(String[] args) {
		System.out.printf("%-20s%-20s%-10s%-20s%-20s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
		System.out.println("_______________________________________________________________________________");
		double cels = 40.0;
		double fahr = 120.0;

		do {
			System.out.printf("%-20.1f%-20.1f%-10s%-20.2f%-20.2f", cels, celsiusToFahrenheit(cels), "|", fahr, fahrenheitToCelsius(fahr));
			cels = cels - 1.0;
			fahr = fahr - 10.0;
			System.out.println();
		} while (cels > 30.0 && fahr > 20.0);
	}
	
	// This method converts from celsius to fahrenheit.
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	
	// This method converts from fahrenheit to celsius.
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}

}
