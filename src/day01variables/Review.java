package day01variables;
public class Review {

	static int price;
	static double decimal;
	static float xy;
	static char firstinniual;
	static byte number;
	static short population;
	static long num;
	static boolean weatherishot;
	static char firstname;
	static char lastname;
	public static void main(String[] args) {
		
		int price = 100;
		System.out.println(price);
		
		double decimal= 2.546489403;
		System.out.println(decimal);
		
		float xy = 1.234f;
		System.out.println(xy);
		
		char fi = 'M';
		System.out.println(fi);
		
		byte number = 123;
		System.out.println(number);
		
		short population = 12000;
		System.out.println(population);
		
		long num =33300000;
		System.out.println(num);
		
		boolean weatherishot = true;
		boolean weatheriscold = false;
		System.out.println(weatherishot);
		System.out.println(weatheriscold);
		
		System.out.println(price*decimal);
		System.out.println(decimal%price);
		System.out.println((number+num) == (population % price)) ;
		System.out.println((xy*0) == (num* 'M') +  population * decimal);
		
	
	}

}
