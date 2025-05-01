import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

        // Display PriorityQueue (Sorted Order)
        System.out.println("PriorityQueue: " + pq);

        // Removing elements (smallest element first)
        System.out.println("Removed: " + pq.poll());
        System.out.println("PriorityQueue after removal: " + pq);
    }
}
