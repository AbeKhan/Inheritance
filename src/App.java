public class App {
    public static void main(String[] args) throws Exception 
    {
        Student s = new Student();
        Student d = new Student("Abraham", "Khan", 3.0, "1048135");
        GradStudent grad = new GradStudent();
        GradStudent coin = new GradStudent("Abraham", "Khan", 3.0, "1048135", "animal", "9-6");
        System.out.println(s);
        System.out.println(d);
        System.out.println(grad);
        System.out.println(coin);
        System.out.println(grad.getOffice());
        System.out.println(grad.getID());
        
    }
}
