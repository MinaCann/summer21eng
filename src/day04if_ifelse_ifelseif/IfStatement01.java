package day04if_ifelse_ifelseif;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		
	//Get an integer from user , print it on the console if it is even.
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter an integer");
		int num = scanner.nextInt();
		
		if(num% 2 == 0) {
			System.out.println(num + "is even");
		}
		
	if(num % 2 != 0);{
		System.out.println(num +"is odd");
	}
	System.out.println("Enter an integer");
     int num2 = scanner.nextInt();
     
     if(num2<0) {
    	 System.out.println(num2 + " is negative");
    	 
    	 scanner.close();
     }
	}
}

  
