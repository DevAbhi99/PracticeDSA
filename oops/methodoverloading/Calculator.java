package oops.methodoverloading;
import java.util.*;
import java.io.*;


//So in method overloading I used two methods with same name but different parameters and different implementation. This is method overloading. Either number of parameters must be different or types of parameters must be different

//Polymorphism means many different forms of a same thing

public class Calculator {
 
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);

    System.out.print("Please choose from the given:\n1.Addition\n2.Subtraction");

    //Creating object
    Calculator obj=new Calculator();

    int n=sc.nextInt();

    switch(n){
        case 1: System.out.print("\n\nEnter first number");
                 int x=sc.nextInt();
                 System.out.print("\n\nEnter second number");
                 int y=sc.nextInt();
                 obj.calc(x,y);
                 break;
        case 2: System.out.print("\n\nEnter first number");
        int a=sc.nextInt();
        System.out.print("\n\nEnter second number");
        double b=sc.nextDouble();
         obj.calc(a,b);
        break;         
        default:System.out.print("\n\nPlease choose a valid option!");
    }


    }


    
    public void calc(int x, int y){
        System.out.print(x+y);
    }

    public void calc(int x,double y){
        System.out.print(x-y);
    }



}
