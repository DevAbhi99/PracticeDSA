package Day2;
import java.util.*;


public class Reversevowel {
    

    public static void main(String[] args) {
        
        String s="IceCream";


        Stack<Character> vowel=new Stack<>();

        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
            vowel.push(s.charAt(i));
           }
        }

Collections.reverse(vowel);


char c[]=s.toCharArray();


for(int i=c.length-1;i>=0;i--){
    if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
        c[i]=vowel.get(vowel.size()-1);
        vowel.pop();
    }
}

String str="";

for(int i=0;i<c.length;i++){
  str+=c[i];
}  

System.out.println(str);
        





    }
}
