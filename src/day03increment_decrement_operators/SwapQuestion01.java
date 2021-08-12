package day03increment_decrement_operators;

public class SwapQuestion01 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		//System.out.println("Before swap a is " + a);
		//System.out.println("Before swap b is "+ b);
		
        a=a+b;
        b=a-b;
        a= a-b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
	}

}
