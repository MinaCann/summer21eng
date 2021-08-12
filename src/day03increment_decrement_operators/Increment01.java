package day03increment_decrement_operators;

public class Increment01 {

	public static void main(String[] args) {
		
		int age =12;
		System.out.println("Before increment: "+ age);
		
		// how to increase the value of a variable 
		//1.Way
		age = age + 3;
	   System.out.println("After increment:"+age);
		
		//2.Way
		age+=5;
		System.out.println("After 2nd increment:" + age);
		
		   
		//3.way increasing by only 1   ***
		age++;
		
		//how to increase the value of a variable by multiplication  
		
	   int salary = 10000;
	   salary = salary * 2;
	   System.out.println("After the 1st, increase my salary is" +salary);
		
	   salary *=3;
	  System.out.println( "After the 1st, increase my salary is" +salary);
	}

}
