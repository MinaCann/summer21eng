package practiceClass1362021;

import java.util.Scanner;

public class SalaryBonus01 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Salary");
        double salary=in.nextDouble();
        System.out.println("years of service?");
        int years=in.nextInt();
        
        if(years>=5) {
	   System.out.println("Your bonus is "+salary*0.05);
        }else {
	   System.out.println("You need to work for another "+(5-years)+" year "+
        ((5-years)==1?"":"s ")+"to be qualified for a bonus.");
	   
	   
}
		
		
		
		
		
		

	}

}
