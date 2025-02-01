package collectionframework.queues;
import java.util.*;


public class Linkedlistqueue {
    
public static void main(String args[]){

    /*Queue is a datastructure that follows first in first out rule just like in queue and in this case we are gonna see linkedlist implementation
    of queue interface
    */

    Queue<Integer> q=new LinkedList<>();


    //offer() adding element in the first

    q.offer(1);
    q.offer(2);
    q.offer(3);
    q.offer(4);
    q.offer(5);

    //poll() removing element from the first

    q.poll();

    System.out.println(q);

    //peek() to see the element at the first of the queue

    System.out.println(q.peek());


}

}
