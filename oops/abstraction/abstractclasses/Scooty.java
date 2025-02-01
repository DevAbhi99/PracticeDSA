package oops.abstraction.abstractclasses;

public class Scooty extends Vehicle{
   
    void start(){
        System.out.print("Starts with a kick");
    }
  
    public static void main(String args[]){
  
  
      Scooty obj=new Scooty();
  
      obj.start();
    }
    

}
