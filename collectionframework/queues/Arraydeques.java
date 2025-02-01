package collectionframework.queues;
import java.util.*;

public class Arraydeques {
    
  public static void main(String args[]){

  ArrayDeque<Integer> dq=new ArrayDeque<>();

  //In array deque we can add and remove element from both the end of the data structure

  //offer()

  dq.offer(4);

  //offerFirst() offer from first

dq.offerFirst(1);

//offerLast() offers from the last

dq.offerLast(5);

System.out.println(dq);

//pollFirst() removes from the first i.e. 1

dq.pollFirst();

System.out.println(dq);

//pollLast() removes from the last

dq.pollLast();

System.out.println(dq);

//peekFirst and peekLast also exists


  }
}
