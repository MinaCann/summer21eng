package day06ternary_switch;

import java.util.Scanner;

public class Ternary_Review02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter lenght of a rectangle...");
		System.out.println("Enter width of a rectangle...");
		
		int l = scan.nextInt();
		int w = scan.nextInt();
		
		System.out.println(l>=5 ? w>=2 : l*5);
	}

}
