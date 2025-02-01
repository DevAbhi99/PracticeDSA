package datastructures;

public class DoubleLinkedList {
    
class Node{
    String data;
    Node next;
    Node prev;

    Node(String data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

private Node head;
private Node tail;

DoubleLinkedList(){
    this.head=null;
    this.tail=null;
}

void addFirst(String data){

Node newNode=new Node(data);

if(head==null){
    head=tail=newNode;
    return;
}

newNode.next=head;
head.prev=newNode;
head=newNode;

}


void addLast(String data){

Node newNode=new Node(data);

 if(tail==null){
    tail=head=newNode;
    return;
 }

tail.next=newNode;
newNode.next=null;
newNode.prev=tail;
tail=newNode;

}

void printForward(){
    if(head==null){
        System.out.println("The list is empty!");
    }

    Node currNode=head;

    while(currNode!=null){
        System.out.println(currNode.data);
        currNode=currNode.next;
    }
}

void printBackward(){
    if(head==null){
        System.out.println("The list is empty");
    }

    Node currNode=tail;

    while(currNode!=null){
        System.out.println(currNode.data);
        currNode=currNode.prev;
    }
}

void deleteFirst(){

    if(head==null){
        System.out.println("The list is already empty");
    }

    head=head.next;
    head.prev=null;
}

void deleteLast(){
    if(tail==null){
        System.out.println("The list is already empty");
    }

    tail=tail.prev;
    tail.next=null;
}


public static void main(String[] args) {
    
DoubleLinkedList ll=new DoubleLinkedList();

ll.addFirst("hi");
ll.addLast("there");

ll.printForward();

ll.printBackward();

ll.deleteLast();

ll.printForward();

}



}
