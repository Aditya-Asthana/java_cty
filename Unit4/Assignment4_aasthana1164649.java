import java.util.Scanner;

/*
 * Assignment 4
 * Author: Aditya Asthana
 */
public class Assignment4_aasthana1164649 {

	public static void main(String[] args) {
		 // Create a Scanner object
        Scanner input = new Scanner( System.in );
        
        // tell the user to enter the first test score
		System.out.println("Enter a value for the first test score: ");
	    // read first input as a float
		float x = input.nextFloat();

        // tell the user to enter the second test score
		System.out.println("Enter a value for the second test score: ");
	    // read second input as a float
		float y = input.nextFloat();

        // tell the user to enter the third test score
		System.out.println("Enter a value for the third test score: ");
	    // read thrid input as a float
		float z = input.nextFloat();

		// calculate average of all three scores
		float avg = (x + y + z)/3;

		// determines average grade
		if ( avg >= 97.5) {
			System.out.println("Average is " + avg + " Grade is A+");
		} else if (avg >= 93.5) {
			System.out.println("Average is " + avg + " Grade is A");
		} else if (avg >= 89.5) {
			System.out.println("Average is " + avg + " Grade is A-");
		} else if (avg >= 86.5) {
			System.out.println("Average is " + avg + " Grade is B+");
		} else if (avg >= 82.5) {
			System.out.println("Average is " + avg + " Grade is B");
		} else if (avg >= 79.5) {
			System.out.println("Average is " + avg + " Grade is B-");
		} else if ( avg >= 69.5) {
			System.out.println("Average is " + avg + " Grade is C");
		} else if ( avg <= 69.49) {
			System.out.println("Average is " + avg + " Grade is F");
		}
	}
}