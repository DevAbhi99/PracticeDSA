package datastructures;


public class CircularDoubleLinkedList {

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

    CircularDoubleLinkedList(){
        this.head=null;
        this.tail=null;
    }

    void addFirst(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            head.next=head;
            head.prev=head;
        }

        newNode.next=head;
        head.prev=newNode;
        newNode.prev=tail;
        tail.next=newNode;
        head=newNode;
    }

    void addLast(String data){
   
        Node newNode=new Node(data);

        if(tail==null){
            head=tail=null;
            tail.next=tail;
            tail.prev=tail;
        }

        tail.next=newNode;
        newNode.prev=tail;
        newNode.next=head;
        head.prev=newNode;
        tail=newNode;
    }


    void printForward(){
        if(head==null){
            System.out.println("The list is empty!");
            return;
        }

        Node currNode=head;

        do{
            System.out.println(currNode.data);
            currNode=currNode.next;
        }while(currNode!=head);
    }

    void printBackward(){

        if(tail==null){
            System.out.println("The list is empty");
           return;
        }

        Node currNode=tail;

        do{
            System.out.println(currNode.data);
            currNode=currNode.prev;
        }while(currNode!=tail);

    }

    void deleteFirst(){

        if(head==null){
            System.out.println("List is empty");
            return;
        }

        head=head.next;
        head.prev=tail;
        tail.next=head;
    }

    void deleteLast(){

        if(tail==null){
            System.out.println("List is empty");
            return;
        }

        tail=tail.prev;
        tail.next=head;
        head.prev=tail;
    }

    public static void main(String[] args) {
        
        CircularDoubleLinkedList ll=new CircularDoubleLinkedList();

        ll.addFirst("hey");
        ll.addLast("there");

  ll.deleteLast();

        ll.printForward();
        ll.printBackward();
    }

}


