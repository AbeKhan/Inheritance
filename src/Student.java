public class Student 
{
    String firstName;
    String lastName;
    double GPA;

    public Student()
    {
         firstName = "FirstName";
         lastName = "LastName";
         GPA = 0.0;
    }

    public Student(String FN, String LN, Double GPA)
    {
         firstName = FN;
         lastName = LN;
         this.GPA = GPA;
    }
}
