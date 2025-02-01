package collectionframework;
import java.util.*;

public class Hashmap {
    
public static void main(String args[]){

    //Hashmaps are ultimate weapon datastructures which stores data in the form of key value pair


    HashMap<Integer, String> hm=new HashMap<>();

    //put(key,value) to add elements in hashmap

    hm.put(1,"Rohan");
    hm.put(2,"Mohan");
    hm.put(3,"Karan");

    //size() shows the length of the hashmap

    System.out.println(hm.size());

    //get(key)  the value is obtained on the basis of the key

    System.out.println(hm.get(1)); //output will be rohan

    //remove(key) remove Karan from hashmap

    hm.remove(3);

    System.out.println(hm);

    //Looping through hashmap 

    //looping on the basis of values which are string
    for(String i:hm.values()){
      System.out.println(i);
    }

    //looping on the basis of keys

    for(Integer i:hm.keySet()){
        System.out.println("Key "+i+" and the value: "+hm.get(i));
    }

}

}
