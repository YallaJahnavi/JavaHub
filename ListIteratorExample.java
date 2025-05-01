import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ListIterator<String> listItr = list.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }
    }
}