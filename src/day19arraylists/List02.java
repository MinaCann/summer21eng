package day19arraylists;

import java.util.ArrayList;

public class List02 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Ali");
		list2.add("Veli");
		list2.add("John");
		list2.add("Ayse");
		list2.add("Can");
		
		System.out.println(list2);
		//REplace the element at the specified position
		list2.set(2, "Ahmet"); //1st param ==>index of the element to replace
		                      //elements to be stored at the specified position
		System.out.println(list2);
      list2.set(list2.indexOf("Can"), "Temel");
      System.out.println(list2);
	}

}
