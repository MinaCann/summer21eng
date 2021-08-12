package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main (String[] args) {
		
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Hey user, enter your age...");
   int age = scanner.nextInt();
   
   System.out.println(age);
   
   scanner.close();
		

	}

}
