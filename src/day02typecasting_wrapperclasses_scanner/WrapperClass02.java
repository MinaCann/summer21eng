package day02typecasting_wrapperclasses_scanner;

public class WrapperClass02 {

	public static void main(String[] args) {
		
		
		int x = 10;
		Integer y = 13 ;
		System.out.println(y.MAX_VALUE);
		System.out.println(y.MIN_VALUE);
		System.out.println(y.min(1,23));
		System.out.println(y.compare(25,64));// -1
		
		System.out.println(y.compare(64,24));//1
		System.out.println(y.compare(64,64));//0
		
		
		
		 Short c = 24533;
		 Short d = 123;
		
		System.out.println(c.MAX_VALUE);
		System.out.println(c.MIN_VALUE);
		System.out.println(c.SIZE);
		System.out.println(c.hashCode());
		System.out.println(c.MAX_VALUE);
		System.out.println(c.equals(d));
		
	}

}
