public class GradStudent extends Student
{
    String offices;
    String officeHours;

    public GradStudent()
    {
        super();
        super.ID = "GR-" + ID;
        offices = "N/A";
        officeHours = "N/A";
    }

    public GradStudent(String FN, String LN, Double GPA, String ID, String offices, String officeHours)
    {
        super(FN, LN, GPA, ID);
        /*super.firstName = FN;
        super.lastName = LN;
        super.GPA = GPA;
        super.ID = "GR-" + ID;*/
        this.offices = offices;
        this.officeHours = officeHours;
    } 
    @Override
    public String setID(String id)
    {
        //this.ID = super.setID(id);
        String holder = ID;
        this.ID = "GR-" + super.setID(id);
        return "ID has changed from " + holder + " to " + ID;
    }

    public String getOffice()
    {
        return "Office:" + offices;
    }

    public String setOffice(String office)
    {
        String holder = offices;
        this.offices = office;
        return "Office has changed from " + holder + " to " + offices;
    }

    public String getOfficeHours()
    {
        return "Office Hours:" + officeHours;
    }

    public String setOfficeHours(String hours)
    {
        String holder = officeHours;
        this.officeHours = hours;
        return "Office hours has changed from " + holder + " to " + officeHours;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Office:" + offices + " Office Hours:" + officeHours;
    }
}
