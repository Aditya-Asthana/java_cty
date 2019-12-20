import java.util.Scanner;

/*
 * Assignment 9
 * Author: Aditya Asthana
 */
public class Project1_aasthana1164649 {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner( System.in );
		
		// tell the user to enter a sentence
		System.out.println("Enter a sentence: ");
	    // read first input as a float
		String inputSentence = input.nextLine();
		
		// tell the user to enter a sentence
		System.out.println("Enter 1 to encode, enter 2 to decode: ");
	    // read first input as a float
		int condition = input.nextInt();
		
		//Decoded String 
		String forward = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		//Encoded String
		String backward = "ZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcba";

		if (condition == 1) {
			// if the condition is 1 then call character count 				
			String encodedString = encodeString(inputSentence, forward, backward);
			System.out.println("Encoded String is: " + encodedString);
		} else if (condition == 2 ) {
			// if condition is 2 then call word count
			String decodedString = decodeString(inputSentence, forward, backward);
			System.out.println("Decoded String is: " +decodedString );
		}
		
	}
	
	
	//Method to encode the string
	public static String encodeString(String inputSentence, String forward, String backward) {
		
		//String buffer to store new string
		StringBuffer encodedBuffer = new StringBuffer();		
		
		//Encoding logic
		// 1. Read input sentence character by character
		// 2. Find the index of character in in forward string (if not space or period)
		// 3. Find the character at that index in backward string

		for ( int i = 0; i < inputSentence.length() ; i++) {
			char inputChar = inputSentence.charAt(i);
			char encodedChar;
			if((inputChar != ' ') && (inputChar != '.')) {
				int index = forward.indexOf(inputChar);
				encodedChar = backward.charAt(index);
				encodedBuffer.append(encodedChar);
			} else if (inputChar == ' ') {
				encodedBuffer.append(' ');
			} else if (inputChar == '.') {
				encodedBuffer.append('.');
			}
						
		}
			
		return encodedBuffer.toString();

	}
	
	
	//Method to decode string
	public static String decodeString(String inputSentence, String forward, String backward) {
		
		//String buffer to store new string
		StringBuffer decodedBuffer = new StringBuffer();		

		//decoding logic
		// 1. Read input sentence character by character
		// 2. Find the index of character in in backward string (if not space or period)
		// 3. Find the character at that index in forward string
		for ( int i = 0; i < inputSentence.length() ; i++) {
			char inputChar = inputSentence.charAt(i);
			char decodedChar;
			if((inputChar != ' ') && (inputChar != '.')) {
				int index = backward.indexOf(inputChar);
				decodedChar = forward.charAt(index);
				decodedBuffer.append(decodedChar);
			} else if (inputChar == ' ') {
				decodedBuffer.append(' ');
			} else if (inputChar == '.') {
				decodedBuffer.append('.');
			}
						
		}
		
		return decodedBuffer.toString();

	}

}
