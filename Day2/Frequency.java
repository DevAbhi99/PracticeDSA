package Day2;

import java.io.*;
import java.util.*;

public class Frequency {
    
public static void main(String args[]){

 String s="leetcode";

HashMap<Character,Integer> hm=new HashMap<>();

char c[]=s.toCharArray();

for(Character ch:c){

    if(hm.containsKey(ch)){
        hm.put(ch,hm.get(ch)+1);
    }
    else{
        hm.put(ch,1);
    }
}



for(int i=0;i<s.length();i++){
    if(hm.get(s.charAt(i))==1){
       System.out.println(i);
       break;
    }
}


}

}
