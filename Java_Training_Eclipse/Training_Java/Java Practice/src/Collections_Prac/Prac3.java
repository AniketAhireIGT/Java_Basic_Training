package Collections_Prac;
import java.util.*;

public class Prac3 {
    public static void main(String[] args) {
    	ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Get element
        System.out.println(list.get(1)); // Output: Banana

        // Update element
        list.set(1, "Blueberry");

        // Remove element
        list.remove("Apple");

        // Check if contains
        System.out.println(list.contains("Cherry")); // Output: true

        // Iterate
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Sort
        Collections.sort(list);
        
        // Size
        System.out.println(list.size());
    }
}
