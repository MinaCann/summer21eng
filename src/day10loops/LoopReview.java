package day10loops;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		
    for(int i=100; i>=0 ; i-=2 ) {
		System.out.print(i + " ");
		}
	
	for(int i=100; i>=0 ; i--) {
		if(i%2==0) {
			System.out.print(i+ " ");
		}
	}/*
		 Ask user for a string and print a new string made of 3 copies of the last 2 letters
The strings length will be at least 2.
ORNEK:
    INPUT      : Mustafa
    OUTPUT     : fafafa
		 */
//
//		Scanner scanner= new Scanner(System.in);
//		System.out.println("Enter a String...");
//		String name = scanner.nextLine();
//		String str= name.substring(name.length()-2);
//		System.out.println(str);
//		
//		for(int i=1; i<4 ; i++) {
//			System.out.print(str);
		
		/*Write a program to print a number entered by user,
		 * which are not divisible by 5 and divisible by 5
		 */
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Print enter a number...");
		int num = scanner.nextInt();
		for(int i=5 ; i>=5; i++) {
			if(num%5==0) {
			System.out.println("num is divisible by 5 =" +num);
		}else
			System.out.println("num is not divisible by 5 =" +num);
		
	//syso	num +" is divisible by 5" : num+ " is not divisible by 5"); is that right?

		
		
	}	
		
}		
}	


