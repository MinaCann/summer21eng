package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the lenght of the rectangle...");
		double length = scanner.nextDouble();
		
		System.out.println("Enter the width of the rectangle");
		double width = scanner.nextDouble();
		 
		System.out.println("Area:"+ width+length);
		System.out.println("Perimeter:" + 2*(width+length));
		
		
		scanner.close();
		
	}

}
