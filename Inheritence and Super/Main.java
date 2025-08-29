public class Main{
    public static void main(String[] args) {
        Person person = new Person("Sanjid", "Rahman");
        person.name();
        
        Student student = new Student("Tahnik","Khan",4.00);
        System.out.println(student.first);
        student.print();

        Employee employee = new Employee("Sara", "Enderson", 43435324);

    }
    

}