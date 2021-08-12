package day04if_ifelse_ifelseif;

import java.util.Scanner;

public class IfElseIfStatement_review {

	public static void main(String[] args) {
		
//Get the day name from user,
//then tell to the user if it is week day or weekend day
		
	Scanner scan =new Scanner(System.in);
	System.out.println("Please enter a day name...");
	String day = scan.next();	
		
     if(day.equals("sunday") || day.equals("saturday")) {
    	System.out.println("weekend");
    
     }else if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
    	System.out.println("please enter week day...");
    	}else {
    		System.out.println();
    	
     }
	}
}



