package day10loops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
	//Ask user to enter a String	
	//Print the characters whose indexes are even in the same line with a space between the characters	
	
//	Scanner scan= new Scanner(System.in);
//	System.out.println("Please enter a string... ");	
//		String s = scan.nextLine();
//		
//	//1.Way:	
//		for(int i=0; i<s.length(); i++) {
//			if(i%2==0) {
//			System.out.print(s.charAt(i) +" ");	
//			}
//		System.out.println();	
//		
//	//2.Way:	
//		for(int i1=0; i1<s.length(); i1+=2) {
//			System.out.print(s.charAt(i1)+ " ");
//		}
//		
		
	/*
	 Ebay Interview Question:
	 Type code to print non-repeated characters of any given String	
	 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.nextLine();
		
		
		//1.Way:
		
		for(int i =0; i<s.length(); i++) {
			if(i%2==0) {
				System.out.println(s.charAt(i) + " ");
			}
		}
		System.out.println();
		
		
		//2.Way
		for(int i=0;i<s.length();i+=2) {
			System.out.println(s.charAt(i)+" ");
		}
		
		
		for(int i=0; i<s.length(); i++) {
			
		if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
			
			System.out.println(s.charAt(i));
		}
		}
		/* 
		
		
		 Very Common interview Question
		 Ask user to enter a String
		 Print the String in reverse order 
		 Ali==>ilA
		 */
		
		
		}
		
		
		
		
		
		
		
	}


