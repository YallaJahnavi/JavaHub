import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements (Automatically sorted)
        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);

        // Print the TreeSet (sorted order)
        System.out.println("TreeSet: " + numbers);

        // Access first and last elements
        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());

        // Get higher and lower elements
        System.out.println("Higher than 30: " + numbers.higher(30));
        System.out.println("Lower than 30: " + numbers.lower(30));

        // Remove an element
        numbers.remove(20);
        System.out.println("After removing 20: " + numbers);
        
        //returning and removing the first and last elements
        System.out.println(numbers.pollFirst());
        System.out.println(numbers.pollLast());
        
        System.out.println(numbers);

        // Iterate using for-each loop
        System.out.print("TreeSet elements: ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}
