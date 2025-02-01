package oops.encapsulation;

public class Arista {
   
    //Encapsulation is data hiding where the salary data is untouched we can only update the value through setter and getter method 
    private double salary;


    void setter(double updatesalary){
        this.salary=updatesalary;
    }

    void getter(){
        System.out.print(this.salary);
    }


}


