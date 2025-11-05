import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {

        // Creating a HashSet of Strings
        HashSet<String> fruits = new HashSet<>();

        // Adding elements (HashSet does NOT allow duplicates)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");  // duplicate entry (ignored)

        // Displaying elements
        System.out.println("Fruits Set: " + fruits);

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Checking if element exists
        if (fruits.contains("Mango")) {
            System.out.println("Mango is present");
        } else {
            System.out.println("Mango is not present");
        }

        // Size of HashSet
        System.out.println("Total fruits in set: " + fruits.size());
    }
}
