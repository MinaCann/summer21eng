package day05nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
	/*
	 Ask user to enter his/her age and gender(M ==> Male, F==>Female)
		 	If the age is negative, and gender is different from 'M' and 'F' give error message
		 	If the age is greater than 65 and and gender is male print "Retired" otherwise "Need to work"
		 	If the age is greater than 60 and and gender is female print "Retired" otherwise "Need to work" 
	  */
	 Scanner scanner = new Scanner(System.in);	
	 
		System.out.println("Enter your age...");
		int age = scanner.nextInt();
		
		System.out.println("Enter your gender...(M/F)");
		char gender = scanner.next().toUpperCase() .charAt(0);
		
		if(age<0) {
		  System.out.println("Do not make the age negative, ");
		}else if(gender=='F'  || gender== 'M'); {
		System.out.println("make age>0, male-'M'");
		
		} if(age>65 && gender=='M') {
			System.out.println("Retired");
		}
		
	}

}
