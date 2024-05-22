class Student
{
private int rollno;
private float marks;
public Student()
{
rollno=1;
marks=50.0f;
}
public Student(int r, float m)
{
rollno=r;
marks=m;
}
public void displayStudent()
{
System.out.println("Rollno"+rollno+ "marks" +marks);
}
}
class ConstructorDemo
{
public static void main(String []args)
{
Student s=new Student(101,45.6f);
Student s1=new Student();
s.displayStudent();
s1.displayStudent();
}
}
