import java.util.Scanner;

/*
 * Assignment 9
 * Author: Aditya Asthana
 */
public class Assignment9_aasthana1164649 {

	public static void main(String[] args) {
		// Create a Scanner object
				Scanner input = new Scanner( System.in );
				
				// tell the user to enter a sentence
				System.out.println("Enter a sentence: ");
			    // read first input as a float
				String inputSentence = input.nextLine();
				
				// tell the user to enter the weight on Earth
				System.out.println("Enter 1 to count characters, 2 to count words:");
			    // read first input as a float
				int condition = input.nextInt();
				
				if (condition == 1) {
					// if the condition is 1 then call character count 				
					int chCount = characterCount(inputSentence);
					System.out.println("There are " + chCount + " characters in the sentence");
				} else if (condition == 2 ) {
					// if condition is 2 then call word count
					int wCount = wordCount(inputSentence);
					System.out.println("There are " + wCount + " words in the sentence");
				}
				
	}
	
	public static int characterCount(String sentence) {
		return sentence.length();
	}
	
	
	public static int wordCount( String sentence) {
		int count = 1;
		for (int i = 0; i < sentence.length(); i ++) {
			char ch = sentence.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		return count;
	}
	
}
