import java.util.Scanner;

/*
 * Assignment 3
 * Author: Aditya Asthana
 */
public class Assignment3_aasthana1164649 {

	public static void main(String[] args) {
		
		// Create a Scanner object
		 Scanner input = new Scanner( System.in );
		 // tell the user to enter a temperature in Fahrenheit
		 System.out.print( "Enter a temperature in degrees Fahrenheit: " );
		 // read input temperature in Fahrenheit
		 int fahrenheitTemp = input.nextInt();
		 // Calculate Kelvin temperature
		 double kelvinTemp = ( (fahrenheitTemp - 32) / 1.8 ) + 273;
		 // Display the Kelvin temperature
		 System.out.println( "Kelvin temperature = " + kelvinTemp ); 
	}

}
