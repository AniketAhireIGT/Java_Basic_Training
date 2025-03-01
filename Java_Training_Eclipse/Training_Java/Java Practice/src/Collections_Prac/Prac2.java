package Collections_Prac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Prac2 {
    public static void main(String[] args) 
    {
        // ✅ Step 1: Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
     // ✅ Step 1: Create an LinkedList of Integers
        //LinkedList<Integer> numbers = new LinkedList<>(); 
        
        System.out.println("▶ Created an Empty ArrayList.\n");

        // ✅ Step 2: Add Elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1, 15); // Insert 15 at index 1
        System.out.println("▶ After Adding Elements: " + numbers + "\n");

        // ✅ Step 3: Access Elements
        System.out.println("▶ Element at Index 2: " + numbers.get(2) + "\n");

        // ✅ Step 4: Update an Element
        numbers.set(1, 25); // Replaces element at index 1
        System.out.println("▶ After Updating Index 1: " + numbers + "\n");

        // ✅ Step 5: Remove Elements
        numbers.remove(2); // Removes element at index 2
        numbers.remove(Integer.valueOf(10)); // Removes the first occurrence of 10
        System.out.println("▶ After Removing Elements: " + numbers + "\n");

        // ✅ Step 6: Get Size
        System.out.println("▶ Current Size: " + numbers.size() + "\n");

        // ✅ Step 7: Check if an Element Exists
        System.out.println("▶ Does 20 exist? " + numbers.contains(20) + "\n");

        // ✅ Step 8: Iterate Through the List
        System.out.println("▶ Iterating using For-Each Loop:");
        for (int num : numbers) {
            System.out.println("  - " + num);
        }

        // ✅ Step 9: Iterate Using Iterator
        System.out.println("\n▶ Iterating using Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println("  - " + iterator.next());
        }

        // ✅ Step 10: Clear the List
        numbers.clear();
        System.out.println("\n▶ After Clearing List: " + numbers);
        System.out.println("▶ Is List Empty? " + numbers.isEmpty());
    }
}
