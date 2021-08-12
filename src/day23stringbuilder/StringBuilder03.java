package day23stringbuilder;

public class StringBuilder03 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java");
		
		StringBuilder sb2 = new StringBuilder("Java");
		
		/* equals() method in StringBuilder uses "==" to compare 
		    
		*/
		//1.way
		//Convert StringBuilder To String then use equal() method
		System.out.println(sb1.toString().equals(sb2.toString()));//false for StringBuilder equal()
		                                                          //true for String equal()
		
		//2.Way 
		//Use compareTo() method
		System.out.println(sb1.compareTo(sb2)); // 0==> (SAME) StringBuilder contains the same character sequence
		                                        // -1==> not same 
 	}

}
