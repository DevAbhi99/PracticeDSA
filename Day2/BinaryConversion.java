package Day2;
import java.util.*;
import java.lang.Math.*;

public class BinaryConversion {
    

    public static void main(String[] args) {
        
     int n=3;

LinkedList<Integer> binary=new LinkedList<>();

//Conversion from Number to binary

     if(n==0){
        System.out.println(0);
     }

     while(n>0){
        int rem=n%2;
         binary.add(rem);
         n/=2;
     }

     Collections.reverse(binary);

     System.out.println(binary);

     //Conversion from binary to number

     int sum=0;

     Collections.reverse(binary);

     for(int i=binary.size()-1;i>=0;i--){
         sum=sum+((int)Math.pow(2,i)*binary.get(i));
     }

     System.out.println("\n\n"+sum);

    }
}
