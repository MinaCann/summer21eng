package day32collections;

import java.util.TreeSet;

public class TreeSet01 {

	 /*
	    1)In TreeSet, all elements are unique and in ascending order
	    2)TreeSet spends too much time to put the elements in ascending order, because TreeSet is very slow(Ordering takes time)
	    3)Elements are unique and in natural order
	      alphabetical or from smallest to highest
	    4)It will overwrite the previous element when we try to put same one
	      Developers do not prefer to use TreeSet
	  */
	public static void main(String[] args) {
		
		TreeSet<String> ts1=new TreeSet<>();
		
		ts1.add("Apple");
		ts1.add("Mango");
		ts1.add("Orange");
		ts1.add("Palm");
		ts1.add("Apricot");
		ts1.add("Palm");
		
		//Returns the least element in this set greater than or equal to the given element,
		//If we try to add an element again it will overwrite the first one
		//or null if there is no such element.
		System.out.println(ts1.ceiling("Osa"));
		System.out.println(ts1.ceiling("Loo"));
		
		//Returns the greatest element in this set less than or equal to the given element,
		//or null if there is no such element.
		System.out.println(ts1.floor("Anna"));//null
		
		System.out.println(ts1);//[Apple, Apricot, Mango, Orange, Palm]
		//it will put the elements in descending order
		System.out.println(ts1.descendingSet());//[Palm, Orange, Mango, Apricot, Apple]
		
		System.out.println(ts1.first());//Apple ==>Returns the first element
		
		//headSet() gives you elements from the first element to the element(exclusive) you used as argument
		//it will return the elements up to the argument we provide
		System.out.println(ts1.headSet("Mango"));//[Apple, Apricot]
		
		System.out.println(ts1.headSet("Mango", true));
		
		//Returns a view of the portion of this set whose elements are greater than or equal to fromElement.
		//it will bring elements starting from the element we provide to the end
		System.out.println(ts1.tailSet("Mango"));//[Mango, Orange, Palm]
		
		System.out.println(ts1.higher("Mango"));//Orange  it will return the greater one
		System.out.println(ts1.lower("Mango"));//Apricot it will return the smaller one
		System.out.println(ts1);//[Apple, Apricot, Mango, Orange, Palm]

	}

}
