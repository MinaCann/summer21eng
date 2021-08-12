package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
//	Scanner scanner = new Scanner (System.in);	
//	System.out.println("Hey user,enter a number to calculate its cube...");
//	double number = scanner.nextDouble();
//	System.out.println((number*number*number)/2);
//	
//	scanner.close();
    
//	Scanner scan = new Scanner (System.in);
//	System.out.println("Please enter minutes...");
//	long minutes = scan.nextLong();
//	long years = minutes/(60*24*365);
//	long days=(minutes/60/24)%365;
//	System.out.println(minutes+" minutes is approximately " + years+" years and "+days+ " days");
	
	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please write your side length of the square");
//		int X =scan.nextInt();
//		int A = X*X;
//		int P = X+X+X+X;
//		System.out.println(A+ " area of square " +P+" perimeter of the square ");
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please write your side length of the rectangle");
		int Y =scan.nextInt();
		int X =scan.nextInt();
		int A = X*Y;
		int P = X+Y+X+Y;
		System.out.println("Area:"+A+" Perimeter:" +P);
		
	
	}

}

