public class Employee extends Person{

    int Salary;

    Employee(String first, String last, int Salary){
        super(first,last);
        this.Salary = Salary;
            System.out.println("The name : "+ first +" "+ last + " And his salary = " + Salary + " $");

    }
   
   

}