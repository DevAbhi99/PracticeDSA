package exceptionhandling;
import java.io.*;

public class Throws {
    
public static void main(String args[])throws IOException{

 //throws is alternative for try catch block to handle only checked exceptions like SQLException, IOException

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



String s=br.readLine();
System.out.println(s);





}

}
