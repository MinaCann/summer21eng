package day32collections;

import java.util.HashSet;

public class HashSet01 {
	
	/*
	   Hashing is a technical system to create unique codes for unique elements
	       1_HashSet    2_LinkedHashSet   3_TreeSet
	    
	   1)In HashSet, elements are sorted randomly.Hashset does not care the order(Thats why its work faster) So HashSet is super fast.
	   2)In HashSet, elements are unique, if you try to add repeated elements, it does not give CTE or Run Time Error
	     Java overwrites
	   3)HashSet accepts a single null as elements(we can store just on null value)
	   
	   Note: If you need a collection for the given features use HashSet;
	        a)Unique Elements
	        b)Order is not important
	        c)Using null is not problem
	        d)Speed is important
	        
	 */

	public static void main(String[] args) {
	
		HashSet<String> hset1 = new HashSet<>();
		
		hset1.add("Apple");
		hset1.add("Mango");
		hset1.add("Orange");
		hset1.add("Palm");
		hset1.add("Apricot");
		hset1.add("Palm");
		hset1.add(null);
		hset1.add(null);
		System.out.println(hset1);
	}

}
