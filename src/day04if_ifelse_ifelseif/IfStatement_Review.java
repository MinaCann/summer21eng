package day04if_ifelse_ifelseif;

import java.util.Scanner;

public class IfStatement_Review {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a num");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("the number is even");
			
		}
		if(num% 2 != 0) {
			System.out.println("the number is odd");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a num");
		int number = scan.nextInt();
		if(num <= -1); {
				
      System.out.println("the number is negative");
      {
    	  if(num >= 1); {  
    	 
   } System.out.println("the number is positive");
      }
      
      /*
		 //Get the length and the height of a rectangle from user, if they equal to each other
		//print "Square" on the console, otherwise print "Rectangle" on the console.
		 */
		
		Scanner name = new Scanner(System.in);
		System.out.println("enter a side of the Rectangle ");
		double side1 = scan.nextDouble();
		System.out.println("enter  side 2 of the Rectangle ");
		double side2 = scan.nextDouble();
		
		if(side1 == side2) {
			System.out.println("Square");
			
		}
		if(side1 != side2) {
			System.out.println("Rectangle");
      
      
      
		}
		
		
		

	}scanner.close();
	}
}
