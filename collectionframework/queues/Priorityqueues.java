package collectionframework.queues;
import java.util.*;

public class Priorityqueues {
    
public static void main(String args[]){

    PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); //using Comparator.reverseOrder() max heap algorithm is followed

    //Priority is given to elements in the way the elements are added or removed from the queue.

    //By default priority queue follows min heap algorithm according to which the smallest element is given the highest priority

    pq.offer(5);
    pq.offer(4);
    pq.offer(3);
    pq.offer(2);
    pq.offer(1);

    System.out.println(pq);

    //removing elements

    pq.poll();

    System.out.println(pq);

    //peek()

    System.out.println(pq.peek());


}

}
