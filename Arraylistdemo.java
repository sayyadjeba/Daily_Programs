import java.util.ArrayList;

public class Arraylistdemo{
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Displaying the ArrayList
        System.out.println("ArrayList: " + fruits);

        // Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);

        // Accessing elements using index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Removing an element
        fruits.remove("Banana");
        System.out.println("ArrayList after removing 'Banana': " + fruits);

        // Checking if an element is present
        boolean containsOrange = fruits.contains("Orange");
        System.out.println("Does ArrayList contain 'Orange'? " + containsOrange);

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);

        // Checking if the ArrayList is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);
    }
}