import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Banana");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Cherry");
        System.out.println("TreeMap: " + treeMap);
        System.out.println("Value of key 2: " + treeMap.get(2));
        treeMap.remove(1);
        System.out.println("After removing key 1: " + treeMap);
        System.out.println("Contains key 3? " + treeMap.containsKey(3));
        System.out.println("Contains value 'Apple'? " + treeMap.containsValue("Apple"));
        System.out.println("Size of TreeMap: " + treeMap.size());
        treeMap.clear();
        System.out.println("After clearing: " + treeMap);
    }
}
