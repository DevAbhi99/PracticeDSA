package oops.abstraction.abstractclasses;

public class Car extends Vehicle{
    
  void start(){
      System.out.print("Starts with a key");
  }

  public static void main(String args[]){


    Car obj=new Car();

    obj.start();
  }

}
