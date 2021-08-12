package day31iteratorscollections;

import java.util.LinkedList;

public class LinkedList01 {

	/*
	   LinkedList is very fast in insertion
	   and deletion operations...
	 */
	
	/*
     * It is very similar to the list but the structure is completely different
     * we call the member of linkedlist "Node"
     * each node has two parts  1) data  2) pointer
     * at the beginning of linkedlist there is a "Head" it does not have data part
     * at the end of the linkedlist the pointer points to the null
     */
    
    /*
     * Assertion is quick and easy in linkedlist
     * in assertion we just break the pointer and link the new node
     * but for list we need to update indexes
     */
    
    /*
     * Deletion is also quick and easy with linkedlist
     * we just broke the connection take the element 
     */
    
    /*
     * reaching an element is easy with list. 
     * Because we can directly reach element by using index
     * but it is too hard and takes time to reach a node in linkedlist.
     * because it checks every nodes one by one
     */

	
	public static void main(String[] args) {
		
		LinkedList<String> ll1 = new LinkedList<>();
		
		ll1.add("Ali");
		ll1.add("Can");
		ll1.add("Mark");
		ll1.add("Tom");
		
        System.out.println(ll1);
        ll1.add("Angie");
        ll1.add(2, "XXXX");
        ll1.addFirst("AAAA");
        ll1.addLast("XXXX");
        System.out.println( ll1.contains("Can"));//true
        System.out.println( ll1.contains("Mm"));//false
        System.out.println( ll1.element());//AAAA ==> Returns the first element without removing (copy + paste)
                                           //@throws NoSuchElementException if this list is empty
       
        System.out.println(ll1);
        
        //THIS METHOD CREATED FOR QUEUE. IT WORKS SAME ELEMENT METHOD
        //element method created for linkedlist
        System.out.println(ll1.getFirst());//AAAA ==> @throws NoSuchElementException if this list is empty
        
        //return the last element
        System.out.println(ll1.getLast());//ZZZZ
        System.out.println(ll1.poll());//AAAA ==>Returns first element but removes the first element(cut+paste)
                                       //        Returns null if this list is empty
        
        System.out.println(ll1.peek());//Returns first element without removing(copy+paste)
                                       //Returns null if this list is empty
                                       //does not throw any exception
        
        System.out.println(ll1.poll());
        System.out.println(ll1);
        //poll() return and remove the first element
        //cut+paste 
        
        ll1.add("Mumine");
        System.out.println(ll1);
        
        // ll1.removeFirstOccurrence("Mumine");
        // if our linkedlist is empty we need to handle it
        // otherwise it will throw an  exception "NoSuchElementException"
        
        ll1.removeLastOccurrence("XXXX");
        ll1.set(2, "!!!!");//we can update the value of an element in a specific index
        System.out.println(ll1.subList(2, 5));//[!!!!, Mark, Tom] Note: first index is inclusive, second is exclusive
        System.out.println(ll1);
        System.out.println(ll1.contains("Mumine"));
        System.out.println(ll1.element());
        
	}

}
