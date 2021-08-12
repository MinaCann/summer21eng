package day25encapsulationreview_interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion06 {

	public static void main(String[] args) {
		
		//Create s program checks if a string is palindrome pr not
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string");
		String string= scan.nextLine().replace(" ", "").toLowerCase();
		isPalindrome(string);
		
	}
		public static void isPalindrome(String string) {
			String revString="";
			for(int i=string.length()-1;i>=0;i--) {
				revString+=string.charAt(i);
			}
			if(string.equals(revString)) {
				System.out.println("It is a palindrome " );
			}else {
				System.out.println("It is not a palindrome");
			}
		}
			 

}
