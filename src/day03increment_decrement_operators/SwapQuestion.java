package day03increment_decrement_operators;

public class SwapQuestion {

	public static void main(String[] args) {
		
		/*Swap the values of two integers.
		 a=12 and b=5 ==> a=5 and b=12
		 */
		
		// 1.wWay: Use third container...
		
		int a = 12;
		int b = 5;
		int temp = 0;
		System.out.println("Before swap a:"+ a);
		System.out.println("Before swap b:"+ b);
		
		
		temp = b;
		b = a;
		
		System.out.println("After swap a:" + a);
		System.out.println("After swap b:" +b);
		
		//2.Way: do not use third container
		
		int c = 20;  // c=15
		int d = 15;  // d=20
		
		System.out.println("Before swap c:" + c);
		System.out.println("Before swap d:" +d);
		
		c = c + d;
		d = c - d;
		c = c - d;
		
		System.out.println("After swap c:" + c);
		System.out.println("After swap d:" +d);
		
	}

}
