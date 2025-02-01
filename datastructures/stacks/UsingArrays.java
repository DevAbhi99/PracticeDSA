package datastructures.stacks;

public class UsingArrays {
   
  
int maxSize;
int[] stArray;
int top;

UsingArrays(int size){
maxSize=size;
stArray=new int[maxSize];
top=-1;
}

void push(int value){

if(isFull()){
    System.out.println("Stack is already full!");
    return;
}

stArray[++top]=value;

System.out.println(value+" is pushed into the stack");

}

int pop(){

    if(isEmpty()){
        System.out.println("Stack is empty");
        return -1;
    }

    return stArray[top];
}

int peek(){

    if(isEmpty()){
        System.out.println("Stack is empty");
        return -1;
    }

    return stArray[top];

}


boolean isEmpty(){
    return top==-1;
}

boolean isFull(){
    return top==maxSize-1;
}

public static void main(String[] args) {
    UsingArrays st=new UsingArrays(5);

    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);

    System.out.println(st.peek());

}

}
