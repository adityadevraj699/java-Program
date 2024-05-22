class Student
{
    private int  Rollno;
    private float marks;
    public Student()
    {
        int Rollno = 45;
        int marks = 76;
    }
    public Student(int r,float m)
    {
        Rollno = r;
        marks = m;
    }
    public void displayStudent(){
        System.out.println("Rollno. "+Rollno+" marks "+marks);
    }
}

 public class Constructor {
    public static void main(String args[])
    {
        Student s = new Student(100,78.87f);
        Student s1 = new Student();
        s.displayStudent();
        s1.displayStudent();
    }
}
