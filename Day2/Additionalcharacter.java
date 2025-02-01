package Day2;
import java.util.*;
import java.io.*;



public class Additionalcharacter {

    public static void main(String args[]){

        String s="a";

        String t="aa";

        int total=0;

for(int i=0;i<t.length();i++){
    total+=t.charAt(i);
}

for(int i=0;i<s.length();i++){
    total-=s.charAt(i);
}

System.out.println((char)total); 

     
    }
}
