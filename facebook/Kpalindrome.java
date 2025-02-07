package facebook;
import java.util.*;
import java.io.*;

public class Kpalindrome {

    static boolean kpalindrome(String s, int k){

if(s.charAt(0)!=s.charAt(s.length()-1)){
    return false;
}


ArrayList<Character> res=new ArrayList<>();

  char c1[]=s.toCharArray();

  char c2[]=new char[c1.length];

  for(int i=c1.length-1;i>=0;i--){
    c2[i]=c1[i];
  }

for(int i=0;i<c1.length;i++){
    if(c1[i]!=c2[i]){
        res.add(c1[i]);
    }

    if(res.size()==k){
        break;
    }
}

char[] newc1=new char[c1.length];

char[] newc2=new char[c2.length];


for(int i=0;i<c1.length;i++){
    for(int j=0;i<res.size();i++){
        if(res.get(j)!=c1[i]){
            newc1[i]=c1[i];
        }
    }
}

for(int i=0;i<c2.length;i++){
    for(int j=0;i<res.size();i++){
        if(res.get(j)!=c2[i]){
            newc2[i]=c2[i];
        }
    }
}


String str1="", str2="";

for(int i=0;i<newc1.length;i++){
    str1+=newc1[i];
}

for(int i=0;i<newc2.length;i++){
    str2+=newc2[i];
}

if(str1.equals(str2)){
        return true;
}

return false;
    }
public static void main(String[] args) {
    
String s="abcd";

int k=2;

System.out.println(kpalindrome(s,k));

}
}
