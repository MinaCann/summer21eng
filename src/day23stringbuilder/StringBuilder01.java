package day23stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		/*
		 * 
		 */
      
		//how to create a String by using "StringBuilder Class"
		//1.way
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);//empty String
		
		System.out.println(sb.capacity());//default capacity is 16
		
		sb.append("Ali");
		sb.append(" is a friend of Veli");//Ali is a friend of Veli
		System.out.println(sb);//Ali
		
		String str = "Veli";
		System.out.println(str);//Veli
		str.toUpperCase();
		System.out.println(str);//still Veli bc it is String
		
		//2. Way
		StringBuilder sb1 = new StringBuilder("Veli is my friend");
		System.out.println(sb1);//Veli is my friend
		
		sb1.append(" and my classmate");
		System.out.println(sb1);//Veli is my friend and my classmate
		
		//3. Way
		StringBuilder sb2 = new StringBuilder(5);
		//We need to be sure with length of the string
		sb2.append("Javax");
		System.out.println(sb2);//
		
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		
		//StringBuilder methods append() in chain
		//1.
		StringBuilder sb3 = new StringBuilder("Java");
		
		sb3.append('q').append('z').append('u');
		System.out.println(sb3);//Javaqzu
		
		//2.
		//if you want to add some of characters from a String we use the following method
		sb3.append("Ahmet", 1, 3);
		System.out.println(sb3);//Javaqzuhm
		
		//the index of the desired char value
		System.out.println(sb3.charAt(5));
		
		
		//how to delete
		//delete by start and end index
		sb3.delete(4, 7);
		System.out.println(sb3);//Javahm
		
		sb3.deleteCharAt(0);
		System.out.println(sb3);//avahm
		
		StringBuilder str1= new StringBuilder("I love Java");
		str1.reverse();
	    for(int i=0, j=1; i<str1.length()/2; i++,j++){
	      if(str1.charAt(i) !=str.charAt(str1.length()-j)) {
	    	  
	      }
	       
	    }
	      System.out.println(str1);
	    
	    
	   
	}

}
