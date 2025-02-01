package Day2;
import java.util.*;

public class Fizzbuzz {
    
public static void main(String[] args) {
    int n=3;

    LinkedList<String> res=new LinkedList<>();
	
	for(int i=1;i<=n;i++){
	    if(i%3==0&&i%5==0){
	        res.add("FizzBuzz");
	    }
	    else if(i%3==0){
	        res.add("Fizz");
	    }
	    else if(i%5==0){
	        res.add("Buzz");
	    }
	    else{
	        res.add(String.valueOf(i));
	    }
	}
	
	System.out.print(res);
}

}
