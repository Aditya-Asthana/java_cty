/*
 * author: Aditya Asthana
 * 
 *  Description: The UserInput Class. This is used to collect input from the user   
 *  Different methods are defined to collect integer , float and String input types
 *  
 */ 

import java.util.Scanner;


public class UserInput {
	
	//Scanner for getting user input
	private Scanner scan;
	
	//Constructor initializing scanner
	public UserInput() {
		scan = new Scanner( System.in );
	}
	
	//Called for getting integer type user input
    public int getUserChoiceInteger() {
       	int x = scan.nextInt();
       	return x;
    }
    
   //Called for getting String type user input
    public String getUserChoiceString() {
       	String str = scan.next();
       	return str;
    }
    
    
    //Called for getting float type user input
    public float getUserChoiceFloat() {
       	float value = scan.nextFloat();
       	return value;
    }

}
