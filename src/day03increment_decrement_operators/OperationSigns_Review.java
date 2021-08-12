package day03increment_decrement_operators;

public class OperationSigns_Review {

	public static void main(String[] args) {

		boolean b1 = 5>2;	  
		boolean b2 = 5==2+3;	 
		boolean b3 = 5==2;	  
		boolean b4 = 5<2;
		
		System.out.println( b1 && b2 ); //perfection
		System.out.println(b1 && b4 );
		System.out.println(b1 && b3 );
		System.out.println(b2 || b1 );  // POllyanna
		System.out.println(b3 ||b2 );
		System.out.println(b1 || b2 || b3 || b4 );
		
	}

}



