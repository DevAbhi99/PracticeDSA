package oops.inheritance;

public class Child extends Parent {   //Using extend keyword child/sub class can access properties of parent/super class
    
  void property(){
   System.out.print("My amount of"+super.amount+" and now my property");    //Method overriding was done I used the same property name of parent and changed its implementation
  }                                                                         //super is used to access the datamembers or properties of parent class

public static void main(String args[]){

 Child obj=new Child();

 obj.property();

}

}
