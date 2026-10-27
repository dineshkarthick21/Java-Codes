import java.util.*;
import java.util.PriorityQueue;
import java.util.Iterator;
public class PriortyQueue {
    public static void main(String args[])
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(100);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.add(20);

        System.out.print(queue);
        //System.out.print(queue.element());
    }
}
