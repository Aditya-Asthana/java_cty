import java.util.Scanner;

/*
 * Assignment 7.1
 * Author: Aditya Asthana
 */
public class Assignment7_aasthana1164649_2 {

	public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner( System.in );

		// tell the user to enter their loan
		System.out.println("Enter the loan amount: ");
		// read first input as a float
		float loan = input.nextFloat();

		// tell the user to enter the rate of percent
		System.out.println("Enter the interest rate: ");
		// read second input as a float
		float rate = input.nextFloat();

		// tell the user to enter the number of years
		System.out.println("Enter the number of years: ");
		// read thrid input as a float
		float years = input.nextFloat();

		//Call the method to get the monthly payment
		double monthlyPayment = calculateMonthlyPayment(years, rate, loan);
		System.out.println("The monthly payment is: " + monthlyPayment);
	}


	public static double calculateMonthlyPayment(float years, float interestRate, float loan) {

		//calculate monthly rate
		double rate = interestRate/(12.0*100);

		//calculate number of months
		double n = years*12.0;

		//Formula to get the monthly payment
		double p =(rate*loan)/(1 -Math.pow((1+rate), (-1.0*n)));

		return p;

	}

}
