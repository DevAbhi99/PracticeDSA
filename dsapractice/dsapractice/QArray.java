package dsapractice;

public class QArray {
 
    int maxSize;
    int qarray[];
    int front;
    int rear;
    int count;

    QArray(int size){
     maxSize=size;
     qarray=new int[maxSize];
     front=0;
     rear=-1;
     count=0;
    }

void offer(int data){


    if(isFull()){
        System.out.println("Queue is full");
        return;
    }

    rear=(rear+1)%maxSize;
    qarray[rear]=data;
    count++;
    System.out.println(data+" offered to the queue");
}

void poll(){

    if(isEmpty()){
        System.out.println("Queue is empty");
        return;
    }

    int polledData=qarray[front];
    front=(front+1)%maxSize;
    count--;
   System.out.println(polledData+" is removed from the queue");
}

int peek(){
    if(isEmpty()){
        System.out.println("The queue is empty");
        return -1;
    }

    return qarray[front];
}

boolean isEmpty(){
     return count==0;
}

boolean isFull(){
    return count==maxSize;
}

public static void main(String[] args) {
    QArray q=new QArray(5);

    q.offer(1);
    q.offer(2);
    q.offer(3);
    q.offer(4);
    q.offer(5);

    System.out.println(q.peek());

    q.poll();

    System.out.println(q.peek());
}

}
