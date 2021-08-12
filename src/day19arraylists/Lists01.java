package day19arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class Lists01 {

	public static void main(String[] args) {
		
     //ArrayLists are flexible with their size(adjustable)
     //ArrayLists can not store multiple data type
	// ArrayLists store 
		
	//How to create a list	
	//1. Way	
	ArrayList<Integer>list = new ArrayList<>();
		
	//to [print the list on the console: just place the name of the list in the System.out.println()
		
	System.out.println(list); // []
	
	//How to add elements into a list 
	
	list.add(12);
	list.add(5);
	list.add(30);
	list.add(0, 8);
	
	System.out.println(list);//[8, 12, 5, 30]
	
	Collections.sort(list);// We use collections to sort
	
	System.out.println(list);//[5, 8, 12, 30]
	
	//how to get a specific element form list
	System.out.println(list.get(3));
	// System.out.println(list.get(4));//IndexOutOfBoundsException bc there is no index 4
	
	list.add(25);
	list.add(45);
	list.add(19);
	list.add(-5);
	list.add(128);
	list.add(501);
	list.add(-17);
	
	System.out.println(list);
	//type a code to find and print the min and max elements form list 1
	
	Collections.sort(list);
	System.out.println(list);
	int min = list.get(0);
	int max = list.get(list.size()-1);
	System.out.println("min value is " +min+"======" + "max value is " + max);
	
	//how to check if the list is empty or not
	System.out.println(list.isEmpty());//false
	
	ArrayList<Integer>list2 = new ArrayList<>();
	
	System.out.println(list2.isEmpty());//true
	
	//how remove elements from a list
	//by.index
	list.remove(5);
	System.out.println(list.remove(5));//the element that was removed from the list
	System.out.println(list);
	
	list.remove(list.indexOf(5));
	}

}
