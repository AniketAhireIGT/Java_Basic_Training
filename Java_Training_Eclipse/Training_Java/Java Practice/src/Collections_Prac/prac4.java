package Collections_Prac;

import java.util.ArrayList;
import java.util.Collections;

//1.Write a Java program to create an array list, add some colors (strings) and print out the collection
//2.write a Java program to iterate through all elements in an array list.
//3.Write a Java program to insert an element into the array list at the first position.
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
//5. Write a Java program to update an array element by the given element.
//6. Write a Java program to remove the third element from an array list.
//7. Write a Java program to search for an element in an array list.
//8. Write a Java program to sort a given array list



public class prac4 {

	public static void main(String[] args)
	{
	
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Red");
		al.add("white");
		al.add("black");
		al.add(0,"Pink");
		al.set(3, "Orange");
		al.remove(3);
    	System.out.println(al.contains("Pink"));	
		Collections.sort(al);
		
		
		System.out.println(al);
		System.out.println(al.get(1));

	}

}
