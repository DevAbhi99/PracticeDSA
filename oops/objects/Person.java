package oops.objects;
import java.util.*;

public class Person {
    
    
int age;

String name;  //datamembers

Person(String name){
this.name=name;
}

String behaviour(){
return this.name+" runs very fast and the age of the person is "+this.age;  //this keyword refers to the datamembers of the class
}


public static void main(String args[]){

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the name\n");
   
    String s=sc.nextLine();

    Person obj=new Person(s);

    System.out.print("\n\nEnter age\n");
 
     int n=sc.nextInt();

     obj.age=n;

     System.out.print("\n\n\n"+obj.behaviour());


      

      
 

} 

}
