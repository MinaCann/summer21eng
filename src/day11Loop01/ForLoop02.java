 package day11Loop01;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 Type code to find the multiplication of the numbers from 1 to 10 
		 */
		
		int prod = 1;
		
		for(int i=1; i<5; i++) {
			prod= prod * i;
			
		} 
		System.out.println(prod);
		
		
		/*
		 Ask user to enter a number then calculate the factorial of it. 
		 5!=5*4*3*2*1
		 Note:17! is greater than the maximum value of integer. Because of that if you use int as data type
		 in factorial codes you can calculate 16! at most.
		 
		 Java created another class for huge whole numbers, it is BigDecimal Class but we will learn later.
		 */
	

//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Enter an integer to calculate its factorial...");
//	int x = scanner.nextInt();
//	
//	int p = 1;
//	
//	if(x<0) {
//		
//		System.out.println("Do not use negative numbers for factorial...");
//		
//	}else {
//	
//		for(int i=x;i>0; i--) {
//			p= p * i;
//		}
//		
//		System.out.println(x + "!=" + p);
//	}
//}

//Write a program to find the factorial value of any number entered through the keyboard
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to calculate its factorial...");
		
		int fact = scan.nextInt();
		// 6!=6*5*4*3*2*1;
		int num=1;
		if(fact<0) {
			System.out.println("Do not enter negative number...");
		}else {
			
		for(int i=fact ; i>0; i--) {
			num =num*i;
			
		}
		System.out.print(fact +"!=" + num );
		}
		
		//Question
		//Type java code by using while loop,
		//Write a program that prompts the user to input a positive integer.
		//It should then print factorial of that number.
		
	
	
	//Question
//TYPE JAVA CODE BY USING WHILE LOOP,Write a program to count the factors of an integer which is entered by user.
		
	
	
	}	
			
		
}
