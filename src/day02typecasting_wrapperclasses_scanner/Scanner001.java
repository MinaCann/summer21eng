package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner001 {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Hey user , enter your name...");
//		int name =scanner.nextInt(); 
//		scanner.nextInt();
//		
//	scanner.close();
//		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter how much tea you drink per  day?");
		
		double tea = scan.nextDouble();
		System.out.println("How much  sugar you use per day?");
		double x = scan.nextDouble();
		double sugar =1.7;
		double day = tea*sugar*x;

		double year = (day*365)/1000;
		 System.out.println("He uses " +year+ "kg sugars per year");
		
	}

}
