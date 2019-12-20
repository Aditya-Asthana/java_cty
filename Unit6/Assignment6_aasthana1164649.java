import java.util.Scanner;

/*
 * Assignment 6
 * Author: Aditya Asthana
 */
public class Assignment6_aasthana1164649 {

	public static void main(String[] args) {

		System.out.println("This program calculates the sum of the integers in a range that are divisible by 3");
		System.out.println();
		// Create a Scanner object
		Scanner input = new Scanner( System.in );

		// tell the user to enter the upper bound
		System.out.println("Enter an upper bound for the range: ");
		// read first input as a integer
		int upperbound = input.nextInt();

		//initialize variables for count and sum
		int countDiv = 0;
		int countNotDiv = 0;
		int i = 1;
		int sumDiv = 0;
		int sumNotDiv = 0;
		//while loop
		while (i<= upperbound) {
			//check to see if number is divisible  by 3 or not
			if (i % 3 == 0) {
				countDiv++;
				sumDiv += i;
			}else {
				countNotDiv++;
				sumNotDiv += i;		
			}
			i++;
		}
		System.out.println();
		System.out.println( countDiv + " numbers in the range 1 - " + upperbound + " are divisible by 3 and there sum is " + sumDiv );
		System.out.println( countNotDiv + " numbers in the range 1 - " + upperbound + " are not divisible by 3 and there sum is " + sumNotDiv );
	}

}
