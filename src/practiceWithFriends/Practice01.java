package practiceWithFriends;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		//1)Write a subtraction question. Prompt user to answer the question. Then print 
		//a message to the console based on the user’s answer
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("10-5=?");
		int answer = scan.nextInt();
		
		System.out.println(answer == 5 ? "true" : "false" );
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(200007-7);
        long x = scanner.nextLong();
        System.out.println(x ==200000 ? "true" : "false" );
	}

}
