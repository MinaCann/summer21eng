package day03increment_decrement_operators;

public class Decrement01 {

	public static void main(String[] args) {
		
		int weight =120;
		 System.out.println("Before decrement:" + weight);
		
		weight = weight - 20;
		System.out.println("After decrement:"+ weight);
		
		weight-=10;
		System.out.println("After 2nd decrement:" +weight);
		
		weight--;
		System.out.println("Before  decrement:" + weight);
		
		//1 way
		int population =24000;
		population = population / 2;
		System.out.println("After decrement:" +population);

		//2 way
		population /= 3;
		System.out.println("After 2nd decrement:" +population);
		
		int aliSalary=600;
		int veliSalary=500;
		
		//Q: Decrease Ali's salary %20 then increase it by 100 dollars.
		//   Increase Veli's salary 100 dollars then decrease it by 20%
		//   Then compare their salary?
		
		// If  you multiply int by double the result will be double
		aliSalary = (int)(aliSalary * 0.8);
		aliSalary = aliSalary + 100;
		System.out.println("Ali Salary:"+aliSalary);
		
		
		veliSalary = veliSalary + 100;
		veliSalary = (int)(veliSalary*0.80);
		System.out.println("Veli Salary: " + veliSalary);

		
		int num =100;
		num=num-5;
		System.out.println("new value is "+ num);
		 num-=5;
		 num--;
		//division 
		 int salary = 5000;
		  salary=salary/5;
		  System.out.println("new salary is"+salary);
		  
		  salary/=5;
		  System.out.println("final salary is"+ salary);
		  
		//Q: Decrease Ali's salary 20% then increase it by 100 dollars.		//  Increase Veli's salary 100 dollars then decrease it by 20%.		//  Then compare their salaries?
		  
		  int alisalary= 200;
		   int velisalary=100;
		   
		   
		   alisalary =(int)(aliSalary *0.8 ); 
		    alisalary = alisalary + 100;
		    System.out.println("Ali Salary:"+aliSalary);
		   System.out.println("Final Ali's Salary is" + aliSalary);
		   
		    veliSalary = veliSalary + 100;
		    veliSalary = (int)(velisalary*0.80);
		   
		    System.out.println("Veli Salary:"+veliSalary);
		 
		
	}

}
