package collectionframework.stacks;
import java.util.*;


public class Stacks {
    
    public static void main(String args[]){

   Stack<Integer> st=new Stack<>();

   /*Stack is a datastructure which follows last in first out or first in last out just like stack of books

 */


 //push() to push element 

 st.push(1);
 st.push(2);
 st.push(3);
 st.push(4);

 //pop() removes last inserted element

st.pop();

System.out.println(st);

//peek() It is used to see the element at the last of the stack

System.out.println(st.peek());

    }
}
