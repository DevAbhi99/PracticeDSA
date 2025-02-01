package dsapractice;

public class StackLinkedList {
    

class Node{
    int data;
    Node next;

    Node(int data){
   this.data=data;
   this.next=null;
    }
}

private Node top;

StackLinkedList(){
    this.top=null;
}

void push(int data){

    Node newNode=new Node(data);

    if(isEmpty()){
        top=newNode;
        return;
    }

    newNode.next=top;
    top=newNode;
    System.out.println(data+" is pushed to the stack");
}

void pop(){

if(isEmpty()){
    System.out.println("Stack is empty!");
    return;
}

int poppedValue=top.data;
top=top.next;
System.out.println(poppedValue+" popped");


}

int peek(){
    if(isEmpty()){
        System.out.println("Stack is empty!");
        return -1;
    }

    return top.data;
}

boolean isEmpty(){
    return top==null;
}

public static void main(String[] args) {
    
StackLinkedList st=new StackLinkedList();

st.push(1);
st.push(2);
st.push(3);
st.push(4);
st.push(5);


st.pop();

System.out.println(st.peek());
}



}
