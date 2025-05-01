import java.util.LinkedList;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("A");
		l1.add("");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		System.out.println("our linkedlist is: "+l1);
		
		l1.add(1, "E");
		
		
		l1.addFirst("a");
		l1.addLast("e");
		System.out.println("after adding: "+l1);
		
		//l1.remove(1);
		l1.removeFirst();
		l1.removeLast();
		l1.remove(2);
		System.out.println("after removing: "+l1);
		
		System.out.println(l1.get(3));
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
		System.out.println(l1.contains("B"));
		System.out.println(l1.indexOf("A"));
		System.out.println(l1.lastIndexOf("E"));
		
		l1.clear();
		System.out.println("list after clearing: "+l1);
	}

}
