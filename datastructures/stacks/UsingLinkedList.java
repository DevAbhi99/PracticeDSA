package datastructures.stacks;

public class UsingLinkedList {


class Node{

int data;

Node next;

Node(int data){
    this.data=data;
    this.next=null;
}

}

private Node top;

UsingLinkedList(){
    this.top=null;
}

void push(int data){

Node newNode=new Node(data);

newNode.next=top;
top=newNode;

System.out.println(data+" pushed into stack");

}


int pop(){

 if(isEmpty()){
    System.out.println("Already empty");
    return -1;
 }

 int poppedValue=top.data;
 top=top.next;
return poppedValue;
}

int peek(){

    if(isEmpty()){
       System.out.println("Already empty");
       return -1;
    }
   
   return top.data;
   }

boolean isEmpty(){
    return top==null;
}

public static void main(String[] args) {
    UsingLinkedList st=new UsingLinkedList();

    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);

    System.out.print(st.peek());
}

}