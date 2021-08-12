package day05nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		/*Ask user to enter an integer
	 	If the integer is less than zero check if it is less than -9. If it is less than -9 print “Too small” otherwise print “Small”
	 	If the integer is gretar than zero check if it is greater than 9. If it is gretaer than 9 print “Too big” otherwise print “Big”	
		*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		 
		if (num<0) {
		   if(num<-9) {
			System.out.println("Too small");	
			}else {
				System.out.println("Small");
			}
			
		}else if(num>0) {
			if(num>9) {
				System.out.println("Too big");
			}else {
				System.out.println("Big");
			}
		}else {
			System.out.println("You smart... Please enter + or - number");
		}
	
		
		
	}
}