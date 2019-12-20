import java.util.Scanner;

/*
 * Assignment 7.1
 * Author: Aditya Asthana
 */
public class Assignment7_aasthana1164649_1 {

	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner( System.in );
		
		// tell the user to enter the weight on Earth
		System.out.println("Enter weight on Earth: ");
	    // read first input as a float
		float x = input.nextFloat();
		
		//method returns here and prints out weight on Mars from the Earth
		double y = moonWeight(x);
		System.out.println("Weight on Earth: " + x + " Weight on Moon: " + y);

		//method returns here and prints out weight on Mars from the Earth
		double z = marsWeight(x);
		System.out.println("Weight on Earth: " + x + " Weight on Mars: " + z);
		
		System.out.println();

		// tell the user to enter the weight on the Moon
		System.out.println("Enter weight on Moon: ");
	    // read first input as a float
		float m = input.nextFloat();

		//method returns here and prints out weight on Earth from the Moon
		double a = earthWeightMoon(m);
		System.out.println("Weight on Moon: " + m + " Weight on Earth: " + a);
		
		System.out.println();
		
		// tell the user to enter the weight on Mars
		System.out.println("Enter weight on Mars: ");
		// read first input as a float
		float n = input.nextFloat();
		
		//method returns here and prints out weight on Earth from the Mars
		double b = earthWeightMars(n);
		System.out.println("Weight on Mars: " + n + " Weight on Earth: " + b);
		

	}
	//calculates weight on the Moon compared to weight on Earth
	public static double moonWeight( float earthWeight ) {		
		double moonWeight= (earthWeight / 9.81)*1.622;
		return moonWeight;
		
	}
	//calculates weight on Mars compared to weight on Earth
	public static double marsWeight( float earthWeight ) {		
		double marsWeight= (earthWeight / 9.81)*3.711;
		return marsWeight;
		
	}
	//calculates weight on Earth compared to weight on the Moon
	public static double earthWeightMoon( float moonWeight ) {		
		double earthWeightMoon= (moonWeight / 1.622)*9.81;
		return earthWeightMoon;
		
	}
	//calculates weight on Earth compared to weight on Mars
	public static double earthWeightMars( float marsWeight ) {		
		double earthWeightMars= (marsWeight / 3.711)*9.81;
		return earthWeightMars;
		
	}
	

}
