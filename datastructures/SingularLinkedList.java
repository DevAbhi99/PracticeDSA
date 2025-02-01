package datastructures;

public class SingularLinkedList {
    
class Node{
    String data;
    Node next;

    Node(String data){
    this.data=data;
    this.next=null;
    }
}

private Node head;

SingularLinkedList(){
    this.head=null;
}

void addFirst(String data){

    Node newNode=new Node(data);

   if(head==null){
    head=newNode;
    return;
   }

   newNode.next=head;
   head=newNode;

}

void addLast(String data){

    Node newNode=new Node(data);

    if(head==null){
        head=newNode;
        return;
    }

    Node currNode=head;

    while(currNode.next!=null){
        currNode=currNode.next;
    }

    currNode.next=newNode;
}

void print(){

    if(head==null){
        System.out.println("The list is empty");
        return;
    }

    Node currNode=head;

    while(currNode!=null){
        System.out.println(currNode.data);
        currNode=currNode.next;
    }

}


void deleteFirst(){

  if(head==null){
    System.out.println("The list is empty");
    return;
  }

  head=head.next;

}

void deleteLast(){

    if(head==null){
        System.out.println("The list is empty");
        return;
      }

      if(head.next==null){
        head=null;
      }

      Node secondLastNode=head;
      Node lastNode=head.next;

      while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondLastNode=secondLastNode.next;
      }

      secondLastNode.next=null;

}

public static void main(String[] args) {
    
 SingularLinkedList ll=new SingularLinkedList();

 ll.addFirst("hi");

 ll.addLast("there");

 ll.print();

 //ll.deleteFirst();

ll.deleteLast();

 ll.print();

}

}
