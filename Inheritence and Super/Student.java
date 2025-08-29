public class Student extends Person{
      double gpa;

      Student(String first, String last, double gpa){
        super(first,last);
        this.gpa = gpa;
      }
      void print(){
        System.out.println("Name = " + first + " " + last);
        System.out.println("GPA : "+ gpa);
      }
}