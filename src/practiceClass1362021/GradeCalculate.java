package practiceClass1362021;

import java.util.Scanner;

public class GradeCalculate {

	public static void main(String[] args) {
		/*
		 * Write a program and calculate grade of three exams with the given values
		 * A==>90-100 B==>80-89 C==>70-79 D==>60-69 F==>0-59 EXAMPLE: INPUT : Math=70
		 * Science=60 Chemistry=89 A==> 90-100 B==>80-89 C==>70-79 D==>60-69 F==>0-59
		 * OUTPUT : Math Grade = C Science Grade = D Chemistry Grade = B
		 */


		Scanner scanner = new Scanner (System.in);
		System.out.println("What is your Math Grade");
		int mathGrade =scanner.nextInt();
		
		
		System.out.println("What is your Science grade");
		int scienceGrade = scanner.nextInt();
		
		System.out.println(scienceGrade>=90 && scienceGrade<=100 ? "ScienceGrade = A" :scienceGrade>=80  && scienceGrade<=89 ? "ScienceGrade =B" : 
			scienceGrade>=70 && scienceGrade<=79 ? "ScienceGrade =C " :scienceGrade>=60 && scienceGrade<=69 ? "ScienceGrade = D" : 
				scienceGrade>=0 && scienceGrade<= 59 ? "ScienceGrade +F" : "Wrong Grade");
		
          System.out.println("What is your Chemistry Grade");
          int chemistryGrade = scanner.nextInt();
          System.out.println(chemistryGrade>=90 && chemistryGrade<=100 ? "ChemistryGrade = A" :chemistryGrade>=80  && chemistryGrade<=89 ? "ChemistryGrade =B" : 
        	  chemistryGrade>=70 && chemistryGrade<=79 ? "ChemistryGrade =C " :chemistryGrade>=60 && chemistryGrade<=69 ? "ChemistryGrade = D" : 
        		  chemistryGrade>=0 && chemistryGrade<= 59 ? "ChemistryGrade +F" : "Wrong Grade");
		
	}

}
