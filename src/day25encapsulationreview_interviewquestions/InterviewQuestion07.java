package day25encapsulationreview_interviewquestions;

public class InterviewQuestion07 {

	public static void main(String[] args) {
		
		//Create a method to check if a number is armstrong or not
        //153 is an armstrong number
		//1*1*1  + 5*5*5 + 3*3*3 = 153
		//Her bir digit alin 10 bolerek ondan sonra loopun icinde 3 kere dondurup her seferinde carpin ve sum diye diger bi variable a ekleyin. en sonda toplamin sayiya esit olup olmadigna bakin
	
		
		   System.out.println(isArmstrong(153));
	   }
	public static boolean isArmstrong(int number) {
		int sum=0;
		int temp=number;//153,153
	
		while(number>0) {
			int firstDigit=number%10;//3
			number=number/10;//15
			sum=sum+(firstDigit*firstDigit*firstDigit);//3*3*3
			
		}
		System.out.println(sum);
		System.out.println(number);
		System.out.println(temp);
		return sum==temp;//0
	}

}
