
/*
 * Assignment 8
 * Author: Aditya Asthana
 */

public class Assignment8_aasthana1164649 {

	public static void main(String[] args) {
		
		//create an integer array of 100
		int number[] = new int[100];
		int MIN = 1;
		int MAX = 100;

		//Loop to initialize number array
		for (int i=0; i<100 ; i++) {
			//Generate numbers in the range [MIX, MAX]  - MAX and MIN are included
			//and assign to number array
			number[i] = MIN + (int)(Math.random()*((MAX - MIN) + 1));
		}
		
		int numDiv4[] =  getNumbersDivisibleBy4(number);
		System.out.println();
		System.out.println("Array number divisible by 4:");
		for (int i = 0; i < numDiv4.length; i++) {
			//We don't want to print unfilled array values
			if (numDiv4[i] !=0) {
				System.out.print(numDiv4[i]+ ", ");
			}
		}
		
		int[] numNotDiv4 = getNumbersNotDivisibleBy4(number);
		System.out.println();
		System.out.println("Array number not divisible by 4:");
		for (int i = 0; i < numNotDiv4.length; i++) {
			//We don't want to print unfilled array values
			if (numNotDiv4[i] !=0) {
				System.out.print(numNotDiv4[i]+ ", ");
			}
		}

	}
	
	// This method takes the number array and returns an array 
	// that has numbers Divisible by 4
	public static int[] getNumbersDivisibleBy4(int [] numArray) {
		int div4[] = new int[100];
		int count = 0;
		int value;
		for (int i =0; i < numArray.length; i++) {
			value = numArray[i];
			if ((value % 4) == 0) {
				div4[count] = value;
				count++;
			}
		}
		return div4;
	}
	
	// This method takes the number array and returns an array 
	// that has numbers Not Divisible by 4
	public static int[] getNumbersNotDivisibleBy4(int [] numArray) {
		int divNot4[] = new int[100];
		int count = 0;
		int value;
		for (int i =0; i < numArray.length; i++) {
			value = numArray[i];
			if ((value % 4) != 0) {
				divNot4[count] = value;
				count++;
			}
		}
		return divNot4;
	}


}
