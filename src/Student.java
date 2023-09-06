public class Student 
{
    String firstName;
    String lastName;
    double GPA;
    String ID;

    public Student()
    {
         firstName = "FirstName";
         lastName = "LastName";
         GPA = 0.0;
         ID = "00000";
    }

    public Student(String FN, String LN, Double GPA, String ID)
    {
         firstName = FN;
         lastName = LN;
         this.GPA = GPA;
         this.ID = ID;
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    public String setName(String FN, String LN)
    {
        firstName = FN;
        lastName = LN;
        return "Name changed to " + firstName + " " + lastName + ".";
    }

    public String getGPA()
    {
        return "GPA:" + GPA;
    }

    public String setGPA(Double GPA)
    {
        Double holder = this.GPA;
        this.GPA = GPA;
        return "GPA changed from " + holder + " to " + this.GPA;
    }

    public String getID()
    {
        return "ID: " + ID;
    }

    public String setID(String id)
    {
        String holder = this.ID;
        this.ID = id;
        return "ID changed from " + holder + " to " + this.ID;
    }

    public String toString()
    {
        return "Name: " + firstName + " " + lastName + " GPA:" + GPA + " ID:" + ID;
    }
    //test
}


