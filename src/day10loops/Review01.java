package day10loops;

import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		//Get a number less than 10 from the user and create a multiplication table
		 // INPUT : number: 4 OUTPUT : 1 2 3 4
		 //                            2 4 6 8
		 //                            3 6 9 12
		//                             4 8 12 16
		  
        
		 Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number less than 10 ... ");
		
		 int number= scan.nextInt();
		for(int i=1; i<=number; i++ ) {
		for(int j=1; j<=number; j++)	{
			System.out.print(i*j+" ");
			}System.out.println();
		}
		 
		for(int i=7; i<16 ; i++) {
			for(int a=7; a<16; a++) {
				System.out.print(i*a + " ");
			}System.out.println();
		}
		 
		 
	}

}
