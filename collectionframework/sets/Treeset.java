package collectionframework.sets;
import java.util.*;

public class Treeset {
    

    public static void main(String args[]){

        Set<Integer> ts=new TreeSet<>();

        ts.add(5);
        ts.add(4);
        ts.add(3);
        ts.add(2);
        ts.add(1);

        System.out.println(ts);
    }
}
