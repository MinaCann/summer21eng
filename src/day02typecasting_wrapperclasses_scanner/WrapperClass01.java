package day02typecasting_wrapperclasses_scanner;

public class WrapperClass01 {

	public static void main(String[] args) {
		
		
		/*
		  Primitive      Wrapper Class
		   byte           Byte
		   short          Short
		   int            Integer****
		   long            Long
		   float           Float
		   double          Double
		   
		    boolean        Boolean
		    char           Character****
		 */
		
		int a = 11;  //Primitive
		
		Integer b = 12;
		System.out.println(b.MAX_VALUE);
		System.out.println(b.MIN_VALUE);
		System.out.println(b.min(120, 23));
		System.out.println(b.compare(25, 64));
		System.out.println(b.compare(64,25));
		System.out.println(b.compare(64,64));
		
		
		
		
		Short c = 24533;
		Short d=123;
		
		System.out.println(c.MAX_VALUE);
		System.out.println(c.MIN_VALUE);
		System.out.println(c.SIZE);
		System.out.println(c.hashCode());
		System.out.println(c.equals(d));
		
		
		
		int x =12;
		Integer y = x;
		System.out.println(x);
		System.out.println(y);
		
	    Integer z = 23;
	    int t = z;
	    System.out.println(z);
	    System.out.println(t);
		
	
		
	}
}

		