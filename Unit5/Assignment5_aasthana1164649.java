import java.util.Scanner;

/*
 * Assignment 5
 * Author: Aditya Asthana
 */

public class Assignment5_aasthana1164649 {
	
	public static void main(String[] args) {
		
		// Creating Scanner
        Scanner input = new Scanner( System.in );
        
        // tell the user to enter the weight of the package
		System.out.println("Enter a package weight in pounds: ");
	    // read first input as a float
		float x = input.nextFloat();

		if (x <= 0) {
			System.out.println("The weight must be greater than zero");
		} else if (x>0 && x<=1){
			System.out.println("The shipping cost is $2.95");
		} else if (x>1 && x<=3){
			System.out.println("The shipping cost is $4.95");
		} else if (x>3 && x<=10){
			System.out.println("The shipping cost is $9.45");
		} else if (x>10 && x<=20){
			System.out.println("The shipping cost is $12.50");
		} else if (x > 20){
			System.out.println("The package is too heavy to be shipped");
		}
	}

}