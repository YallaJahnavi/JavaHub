import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Jahnavi");
		a1.add("Sharvani");
		a1.add("Lalitha");
		a1.add("Vaishnavi");
		a1.add("Harshitha");
		a1.add("Neelima");
		System.out.println("the arraylist is: "+a1);
		
		a1.remove(3);
		System.out.println("after removing: "+a1);
		
		a1.add(3, "vaishnavi");
		System.out.println("after adding: "+a1);
		
		System.out.println(a1.get(5));
		a1.set(3, "jaan");
		System.out.println(a1);
		
		System.out.println(a1.isEmpty());
		System.out.println(a1.contains("jaan"));
		
		System.out.println(a1.indexOf("jaan"));
		System.out.println(a1.lastIndexOf("jaan"));
		
		a1.clear();
		System.out.println(a1);
	}

}
