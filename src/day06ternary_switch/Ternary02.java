package day06ternary_switch;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		Type java code by using ternary and if-else.
		 Ask user to enter two integers
         Write a program to print the minimum one on the console.
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two integers...");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		//1.way : Use if else
		if (a<b) {
			System.out.println("The minimum:" + a);
		}else {
			System.out.println("The minimum:" + b);
		}

		//2.way: Use ternary
		int result = a<b ? a:b ;
		System.out.println("The minimum:"+ result);
		
		
		
		
		
		
	}

}
