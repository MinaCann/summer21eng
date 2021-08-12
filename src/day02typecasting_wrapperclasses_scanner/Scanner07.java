package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 * 
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the mile to convert km...");
		double mile = scanner. nextDouble();
		
		System.out.println(mile*1.6 +"km");
		
		scanner.close();
		
	}

}
