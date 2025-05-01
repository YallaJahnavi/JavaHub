import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> fruit = new HashSet<>();
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("cherry");
		fruit.add("pine");
		System.out.println(fruit);
		
		fruit.remove("cherry");
		System.out.println("after removing: "+fruit);
		
		System.out.println(fruit.contains("banana"));
		System.out.println(fruit.size());
		System.out.println(fruit.isEmpty());
		
		fruit.clear();
		System.out.println("after clearing: "+fruit);
	}

}
