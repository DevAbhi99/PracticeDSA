package oops.abstraction.interfaces;
     //We can achieve multiple inheritance with interfaces
public class Vehicle implements Car, Scooty{

public void carStart(){
System.out.print("Starts with a key");
} 

public void scootyStart(){
    System.out.print("Starts with a kick");
} 

public static void main(String args[]){
    Vehicle obj=new Vehicle();

    obj.carStart();

    obj.scootyStart();
}

}
