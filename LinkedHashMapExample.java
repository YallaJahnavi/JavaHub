import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(3, "Banana");
        linkedMap.put(1, "Apple");
        linkedMap.put(2, "Cherry");
        System.out.println("LinkedHashMap: " + linkedMap);
        System.out.println("Value of key 2: " + linkedMap.get(2));
        linkedMap.remove(1);
        System.out.println("After removing key 1: " + linkedMap);
        System.out.println("Contains key 3? " + linkedMap.containsKey(3));
        System.out.println("Contains value 'Apple'? " + linkedMap.containsValue("Apple"));
        System.out.println("Size of LinkedHashMap: " + linkedMap.size());
        linkedMap.clear();
        System.out.println("After clearing: " + linkedMap);
    }
}




