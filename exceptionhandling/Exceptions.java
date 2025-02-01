package exceptionhandling;




public class Exceptions {

    
int x;

Exceptions(int x){
this.x=x;
}

    public static void main(String args[]){



 //Arithmetic Exception

 int x=100;

 try{
    System.out.print(x/0);
 }
 catch(ArithmeticException e){
    e.printStackTrace();
 }
 finally{
  System.out.println("It will be printed eventually");
 }


 //ArrayIndexOutOfBoundException

 int arr[]={1,2,3,4,5};

 try{

    for(int i=0;i<=arr.length;i++){
        System.out.println(arr[i]);
    }
 }
 catch(ArrayIndexOutOfBoundsException e){
    e.printStackTrace();
 }
 finally{
    System.out.println("Willb e executed eventually!");
 }




    }


}
