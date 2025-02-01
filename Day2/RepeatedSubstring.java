package Day2;
import java.util.*;

public class RepeatedSubstring {

    public static boolean repeat(String s){

        for(int i=s.length()/2;i>=i;i--){
            if(s.length()%i==0){
                int num=s.length()/i;
                String str=s.substring(0,i);
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<num;j++){
                    sb.append(str);
                }
               if(sb.toString().equals(s)){
                return true;
               }
            }
        
        }
  return false;
    }
    
public static void main(String[] args) {
    
String s="abab";

System.out.println(repeat(s));

}




}
