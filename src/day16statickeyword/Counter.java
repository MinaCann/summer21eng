package day16statickeyword;

public class Counter {
	
	            int count =1;
	            
	            Counter(){
	            count++;
	            System.out.println(count);
	          }
	
              public static void main(String[] args) {
		
               Counter c1=new Counter();
               Counter c2= new Counter();
               Counter c3= new Counter();
               
	}

}
