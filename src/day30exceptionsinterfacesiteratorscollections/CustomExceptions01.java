package day30exceptionsinterfacesiteratorscollections;

public class CustomExceptions01 {

	public static void main(String[] args) {
	   //Handle custom exception
		try {
			checkTheGrade(80);
		} catch (IllegelGradeException e) {
		    System.out.println(e.getMessage());
			
		}
		//Handle unchecked custom exception
		try {
		divide(12, 4);
		}catch(DivideByOneException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Use Checked custom exception in a method
    public static void checkTheGrade(int grade) throws IllegelGradeException {
    	
    	if(grade<0 || grade>100) {
    		throw new IllegelGradeException("Grades must be between 0 and 100");
    	}
    	System.out.println("Your grade is " +grade);
    }
    
    
    //Use Unchecked custom exception in a method
     public static void divide(int x, int y) throws DivideByOneException{
    	 
    	 if(y==1) {
    		 throw new DivideByOneException("Dividing a number by 1 gives the number itself, no need to divide");
       }
    	 
    	 System.out.println("The result is " +x/y);
     } 
}

/*
   When you create a "Custom Exception";
   
   A)For "Checked Custom Exception";
   1)Put "Exception" word at the end of the Custom Exception class name like IllegelGradeException
   2)Do not forget to extend "Exception" class
   3)Create constructor with a String parameter, and "super()" constructor call keyword
   
   A)For "Unchecked Custom Exception";
   1)Put "Exception" word at the end of the Custom Exception class name like IllegelGradeException
   2)Do not forget to extend "RuntimeException" class
   3)Create constructor with a String parameter, and "super()" constructor call keyword
 */
 
class IllegelGradeException extends Exception{
	
	public IllegelGradeException(String message) {
		super(message);
	}
		
}

class DivideByOneException extends RuntimeException {
	
	public DivideByOneException(String message) {
		super();
	}
}






