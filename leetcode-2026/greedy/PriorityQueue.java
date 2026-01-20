import java.util.*;
public class PriorityQueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        System.out.println("Priority Queue: " + pq); 
        System.out.println("Top element (min): " + pq.peek()); 
        System.out.println("Removed element: " + pq.poll());   
        System.out.println("Top element (after poll): " + pq.peek()); 
        
        System.out.println("\nProcessing all elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");  
        }
    }
}
