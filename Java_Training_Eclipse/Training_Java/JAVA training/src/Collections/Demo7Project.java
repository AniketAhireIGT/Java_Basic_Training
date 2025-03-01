package Collections;

import java.util.*;
import java.io.*;
 
class Grocery {
    String fruit;
    double price, total;
    Grocery(String fruit, double price, double total) {
        this.fruit = fruit;
        this.price = price;
        this.total = total;
    }
    public String getFruit() {
        return fruit;
    }
}
 
class Node 
{
    String fruit;
    int count;
    Node(String fruit, int count) 
    {
        this.fruit = fruit;
        this.count = count;
    }
 
    public String getFruit() 
    {
        return fruit;
    }
 
    public int getCount() {
        return count;
    }
}
 
abstract class GroceryReceiptBase {
    private Map<String, Double> prices;
    private Map<String, Integer> discounts;
 
    public GroceryReceiptBase(Map<String, Double> prices, Map<String, Integer> discounts) {
        this.prices = prices;
        this.discounts = discounts;
    }
 
    public abstract List<Grocery> calculate(List<Node> shoppingList);
 
    public Map<String, Double> getPrices() {
        return prices;
    }
 
    public Map<String, Integer> getDiscounts() {
        return discounts;
    }
}
 
class GroceryReceipt extends GroceryReceiptBase {
 
    public GroceryReceipt(Map<String, Double> prices, Map<String, Integer> discounts) {
        super(prices, discounts);
    }
 
    @Override
    public List<Grocery> calculate(List<Node> shoppingList) {
        // Aggregate counts for each fruit
        Map<String, Integer> aggregatedCounts = new HashMap<>();
        for (Node node : shoppingList) {
            aggregatedCounts.put(node.getFruit(), aggregatedCounts.getOrDefault(node.getFruit(), 0) + node.getCount());
        }
 
        // Create a list of Grocery objects to hold the final prices
        List<Grocery> groceryList = new ArrayList<>();
 
        // Calculate total price for each item
        for (Map.Entry<String, Integer> entry : aggregatedCounts.entrySet()) {
            String fruit = entry.getKey();
            int totalCount = entry.getValue();
 
            // Get the price of the fruit
            double price = getPrices().getOrDefault(fruit, 0.0);
            // Get the discount for the fruit
            int discountPercent = getDiscounts().getOrDefault(fruit, 0);
 
            // Calculate the total price without discount
            double totalPrice = price * totalCount;
 
            // Apply the discount if any
            if (discountPercent > 0) {
                totalPrice -= totalPrice * discountPercent / 100.0;
            }
 
            // Ensure the total price does not go below zero
            totalPrice = Math.max(totalPrice, 0);
 
            // Add the item to the grocery list
            groceryList.add(new Grocery(fruit, price, totalPrice));
        }
 
        // Sort groceryList by fruit name
        groceryList.sort(Comparator.comparing(Grocery::getFruit));
 
        return groceryList;
    }
}
 
class Demo7Project {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
 
        List<Node> boughtItems = new ArrayList<>();
        Map<String, Double> prices = new HashMap<>();
        Map<String, Integer> discounts = new HashMap<>();
 
        // Read prices
        int n = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < n; i++) {
            String[] a = reader.readLine().trim().split(" ");
            prices.put(a[0], Double.parseDouble(a[1]));
        }
 
        // Read discounts
        int m = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < m; i++) {
            String[] a = reader.readLine().trim().split(" ");
            discounts.put(a[0], Integer.parseInt(a[1]));
        }
 
        // Read purchased items
        int b = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < b; i++) {
            String[] a = reader.readLine().trim().split(" ");
            boughtItems.add(new Node(a[0], Integer.parseInt(a[1])));
        }
 
        // Create the GroceryReceipt object and calculate the result
        GroceryReceipt g = new GroceryReceipt(prices, discounts);
        List<Grocery> result = g.calculate(boughtItems);
 
        // Print the result
        for (Grocery x : result) {
            writer.printf("%s %.1f %.1f\n", x.fruit, x.price, x.total);
        }
 
        reader.close();
        writer.flush();
        writer.close();
    }
}
