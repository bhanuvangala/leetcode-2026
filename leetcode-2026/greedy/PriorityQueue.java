import java.util.*;
public class PriorityQueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);
        for(int rope:ropes){
            pq.add(rope);
        }
        int minCost=0;
        while (pq.size()>1) {
            int r1 = pq.poll();
            int r2 = pq.poll();
            minCost += r1 + r2;
        }
    }
}
