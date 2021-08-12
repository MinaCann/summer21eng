package day11Loop01;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		/* 
		 Type program to find the sum of the integers from 1 to 100
		 */
		int sum =0;
		
		 for(int i=1; i<101; i++) {
			sum = sum + i;
			////if you want to see just for every loop ,put System.out.println("sum: " + sum);inside the loop body
		 }
		 //if you want to see just the final sum ,put System.out.println("sum: " + sum);outside the loop body
		 
  System.out.println("sum: " + sum);
  
  //Ask user to enter starting and ending value, then find the sum of all integers from the starting to the ending value.
 
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter starting value");
  int start = scan.nextInt();
  System.out.println("Enter ending value");
  int end = scan.nextInt();
  
  int s=0;
  
        if(start>end) {
	  System.out.println("Starting value should be greater than ending value");
  }else {
	  for(int i = start; i<end+1; i++) {
			s=s+i;    
  }
  System.out.println("Sum from user :" +s);
  }
	}

}
