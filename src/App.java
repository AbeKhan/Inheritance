import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception 
    {
        //Creating a list have holds Students
        ArrayList<Student> sList = new ArrayList<Student>();

        //Creating a defult student and a student with values
        Student student = new UnderGradStudent();
        Student student2 = new UnderGradStudent("Abraham", "Khan", 3.0, "1048135");

        //Creating a defult GradStudent and a GradStudent with values
        GradStudent grad = new GradStudent();
        GradStudent grad2 = new GradStudent("Abe", "Kan", 0.3, "1048135", "AB", "9-6");

        System.out.println(student.setName("Pine", "Apple"));
        System.out.println(student.setGPA(3.14));
        System.out.println(student.setID("1234567"));
        System.out.println(grad.setOffice("DC"));
        System.out.println(grad.setOfficeHours("9-5")); 
        System.out.println(student2);

        // Adding all the students into the list
        sList.add(student);
        sList.add(student2);
        sList.add(grad);
        sList.add(grad2);

        //Looping through all of the students
        for (Student stu : sList) 
        {
            System.out.println(stu.getSerialData());
        }

        //list.addAll(student, student2, grad, grad2);

        /*System.out.println(student);
        System.out.println(student2);
        System.out.println(grad);
        System.out.println(grad2);
        System.out.println(grad.getOffice());
        System.out.println(grad.getID());*/
        
    }
}
