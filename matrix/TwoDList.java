package matrix;
import java.util.*;


public class TwoDList {

public static void main(String[] args) {
    

    LinkedList<LinkedList<Integer>> ll=new LinkedList<>();

    //adding rows to the list adding three rows
    for(int i=1;i<=3;i++){
       ll.add(new LinkedList<>());
    }

  for(int i=0;i<ll.size();i++){
       if(i==0){
        for(int j=1;j<=3;j++){
            ll.get(i).add(j);
        }
       }
       else if(i==1){
        for(int k=4;k<=6;k++){
            ll.get(i).add(k);
        }
       }
       else{
        for(int l=7;l<=9;l++){
            ll.get(i).add(l);
        }
       }
  }


System.out.println(ll);


//delete the middle element of the matrix

}

}
