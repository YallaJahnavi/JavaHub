
public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//append method
		StringBuffer sb = new StringBuffer("hello"+" ");
		sb.append("world");
		System.out.println(sb);
		
		
		//insert method
		sb.insert(1, "abc");
		System.out.println(sb);
		
		
		//delete method
		sb.delete(1, 3);
		System.out.println(sb);
		
		
		//insert method
		sb.insert(1,"ab");
		System.out.println(sb);
		
		
		//replace method
		sb.replace(1, 3, "xyz");
		System.out.println(sb);
		
		
		//reverse method
		sb.reverse();
		System.out.println(sb);
	}

}
