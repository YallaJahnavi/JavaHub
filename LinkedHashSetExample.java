import java.util.LinkedHashSet;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <String> l1 = new LinkedHashSet<>();
		l1.add("apple");
		l1.add("banana");
		l1.add("cherry");
		l1.add("pine");
		System.out.println(l1);
		l1.remove("cherry");
		System.out.println("after removing: "+l1);
		System.out.println(l1.isEmpty());
		System.out.println("the length is: "+l1.size());
		l1.clear();
		System.out.println("after clearing: "+l1);
	}

}
