import java.util.LinkedList;

public class linkedlistdemo {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Adding an element at a specific index
        linkedList.add(2, "Grapes");
        System.out.println("After adding 'Grapes' at index 2: " + linkedList);

        // Removing an element
        linkedList.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedList);

        // Getting an element at a specific index
        String elementAtIndex = linkedList.get(3);
        System.out.println("Element at index 3: " + elementAtIndex);

        // Checking if the list contains an element
        boolean containsMango = linkedList.contains("Mango");
        System.out.println("Does list contain 'Mango'? " + containsMango);

        // Getting the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);

        // Checking if the LinkedList is empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is the LinkedList empty? " + isEmpty);

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("After clearing the LinkedList: " + linkedList);

        // Checking if the LinkedList is empty after clearing
        isEmpty = linkedList.isEmpty();
        System.out.println("Is the LinkedList empty after clearing? " + isEmpty);
    }
}
