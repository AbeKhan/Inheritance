import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception 
    {
        //Creating a list have holds Students
        ArrayList<Student> list = new ArrayList<Student>();

        //Creating a defult student and a student with values
        Student student = new Student();
        Student student2 = new Student("Abraham", "Khan", 3.0, "1048135");

        //Creating a defult GradStudent and a GradStudent with values
        GradStudent grad = new GradStudent();
        GradStudent grad2 = new GradStudent("Abraham", "Khan", 3.0, "1048135", "AB", "9-6");

        System.out.println(student.setName("Pine", "Apple"));
        System.out.println(student.setGPA(3.14));
        System.out.println(student.setID("1234567"));
        System.out.println(grad.setOffice("DC"));
        System.out.println(grad.setOfficeHours("9-5"));







        // Adding all the students into the list
        list.add(student);
        list.add(student2);
        list.add(grad);
        list.add(grad2);



        //list.addAll(student, student2, grad, grad2);

        /*System.out.println(student);
        System.out.println(student2);
        System.out.println(grad);
        System.out.println(grad2);
        System.out.println(grad.getOffice());
        System.out.println(grad.getID());*/
        
    }
}
