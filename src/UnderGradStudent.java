public class UnderGradStudent extends Student
{
    public String getDegree()
    {
        return "2 or 4 year degree";
    }

    public UnderGradStudent()
    {
        super();
    }

    public UnderGradStudent(String FN, String LN, Double GPA, String ID)
    {
         super(FN, LN, GPA, ID);
    }
}
