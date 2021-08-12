package day22date_accessmodifier;

import day21listsforeachloop.AccessModifier03;

public class AccessModifier02 {

	public static void main(String[] args) {
		/*
		 * 1-If it is static we can call it y class name
		 * 2-If it is not static we can call it by creating object
		 */

        /*
         * 1- public
         * 2-default
         * 3-protected
         * 4-private
         */
        
		AccessModifier01 obj1 = new AccessModifier01();
		System.out.println(obj1.developer);
		
		System.out.println(AccessModifier01.developer1);
		System.out.println(AccessModifier01.developer2);
		
		/*
         * we can access public variables from anywhere
         * we can not access private variables from outside of the class
         */
        //System.out.println(obj1.developer3);
       
		System.out.println(obj1.developer4);
		
		//We can not call default ones from another package. They should be inside the same package to work with the
		AccessModifier03 obj2 = new AccessModifier03();
		//System.out.println(obj2.email);
	}

}
