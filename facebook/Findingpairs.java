package facebook;
import java.io.*;
import java.util.*;


public class Findingpairs {


static int[] pair(int[] a, int[] b, int target){

    
Arrays.sort(a);

Arrays.sort(b);

ArrayList<Integer> al=new ArrayList<>();

for(int i=0;i<a.length;i++){
  for(int j=0;j<b.length;j++){
        if(a[i]+b[j]==target)
        {
            al.add(a[i]);
            al.add(b[j]);
        }  
  }
}

int[] res=new int[al.size()];

for(int i=0;i<al.size();i++){
 res[i]=al.get(i);
}

return res;

}

    public static void main(String args[]){

int[] a={1, 2, 4, 5, 7, 4};

int[] b={5, 6, 3, 4, 8, 4};

int target=9;


System.out.println(Arrays.toString(pair(a, b, target)));

    }

}
