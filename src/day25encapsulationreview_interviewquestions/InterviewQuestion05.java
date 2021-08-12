package day25encapsulationreview_interviewquestions;

import java.util.Scanner;

public class InterviewQuestion05 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a string");
		String str = scan.nextLine();
		
		removeWhiteSpace(str);
	}
	public static void removeWhiteSpace(String str) {
		System.out.println(str.replaceAll("\\s", ""));
	}

}
