package collectionframework.sets;
import java.util.*;

public class Linkedhashset {
    
public static void main(String args[]){

Set<Integer> hs=new LinkedHashSet<>();  //in linked hash set the elements are stored and retrieved in an order

//add();

hs.add(1);
hs.add(3);
hs.add(2);
hs.add(4);
hs.add(5);

//size() to retrieve size of hashset

System.out.println(hs.size());

//remove() removes element

hs.remove(2);
System.out.println(hs);

//contains(element) to check if the element exists in the set

System.out.println(hs.contains(3));

//clear() clears the entire set

hs.clear();

System.out.println(hs);

}

}
