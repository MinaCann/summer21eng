package day10loops;

import java.util.Scanner;

public class Review02 {

	public static void main(String[] args) {
		// ask user to enter an e-mail address
        // then if it contains "hotmail" replace it with "gmail"
        // e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com	

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a hotmail adress");
		String email= scan.nextLine();
		
		if(email.contains("@hotmail")) {
		System.out.println(email.replace("@hotmail.com", "@gmail.com"));
		}else {
		System.out.println("Please enter correct hotmail address");
		
		
	}

}
}