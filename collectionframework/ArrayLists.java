package collectionframework;

import java.util.*;

public class ArrayLists {
    
public static void main(String args[]){

ArrayList<Integer> al=new ArrayList<>();


//These are dynamic datastructures unlike array which has fixed size

//add() adding elements in arraylist

al.add(1);
al.add(3);
al.add(2);
al.add(4);

System.out.println(al);

//set(index,element) adds element in the specified index of the arraylist

al.set(2,9);

System.out.println(al);

//size() Gives the length of the arraylist

System.out.println(al.size());

//remove(index) deletes the partiular element from the list

al.remove(2); //I want to delete element 2 from the list

System.out.println(al);

//sorting the arraylist

Collections.sort(al);

System.out.println(al);

//reverse the arraylist

Collections.reverse(al);

//sort in descending order

Collections.sort(al,Collections.reverseOrder());

System.out.println(al);


//clear() clearing the entire arraylist 

al.clear();

System.out.println(al);

//LinkedList is also the same and has same functionalities

}

}
