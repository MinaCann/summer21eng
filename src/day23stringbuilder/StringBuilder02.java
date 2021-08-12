package day23stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java123");
		
		StringBuilder sb2 = new StringBuilder("Java123");
		
		//how to compare 
		//StringBuilder equal method is not the same as String equal() method
		//We can get true if we compare same object
		//in string builder equals() method works like "==" sign
		//it checks the value and references
		
		
		System.out.println(sb1.equals(sb2));//false
		
		System.out.println(sb1.indexOf("1"));//4
		
		System.out.println(sb1.indexOf("a"));//1
		
		
		sb1.insert(3, "QX");
		System.out.println(sb1);//JavQXa123
		
		//dstOffset, s, start, end
		sb1.insert(1, "CCTYEWCC" , 2, 5 );
		
		System.out.println(sb1);//JTYEavQXa123
		
		//use reverse method to reverse  a String
		sb1.reverse();
		System.out.println(sb1);//321aXQvaEYTJ
		
		sb1.replace(0, 3, "***");
		System.out.println(sb1);//***aXQvaEYTJ

		//set char
		sb1.setCharAt(0, '9');
		System.out.println(sb1);//9**aXQvaEYTJ
		sb1.setCharAt(7, ' ');
		System.out.println(sb1);
		System.out.println("before trim: " +sb1.capacity());
		
		//trim
		sb1.trimToSize();//reduce the storage to the size of the String
		System.out.println("after trim: " +sb1.capacity());
		
		
	}

}
