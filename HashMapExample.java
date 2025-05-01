import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("Initial HashMap: " + map);
        System.out.println("Value of key 2: " + map.get(2));
        map.remove(3);
        System.out.println("After removing key 3: " + map);
        System.out.println("Contains key 1? " + map.containsKey(1));
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));
        System.out.println("Size of HashMap: " + map.size());
        map.clear();
        System.out.println("HashMap after clear(): " + map);
    }
}


