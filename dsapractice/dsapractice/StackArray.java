package dsapractice;

public class StackArray {
    
int maxSize;
int[] stArray;
int top;

StackArray(int size){
 maxSize=size;
 stArray=new int[maxSize];
 top=-1;
}


void push(int data){

if(isFull()){
    System.out.println("Stack is full");
    return;
}

stArray[++top]=data;
System.out.println(data+" pushed to the stack!");
}

void pop(){
    if(isEmpty()){
        System.out.println("Stack is empty!");
        return;
    }

    System.out.println(stArray[top--]+" popped");
}

int peek(){
    if(isEmpty()){
        System.out.println("Stack is empty!");
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
    
    StackArray st=new StackArray(5);

    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);

    System.out.println(st.peek());

    st.pop();

    System.out.println(st.peek());
}

}
