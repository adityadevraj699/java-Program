class Student
{  
int rollno;
String name;  
static String college ="ITS"; 
static void change()
{
//college="subharti";
System.out.println("in Static");
}
public Student()
{  
rollno = 1;  
name = "amit";
System.out.println("in Constructor");
}  
void display ()
{
System.out.println(rollno+" "+name+" "+college);
}  
}  
class TestStatic{  
public static void main(String args[])
{ 
Student.change(); 
Student s1 = new Student();  
Student s2 = new Student();    
s1.display();  
s2.display();  
}  
}  