import java.util.*;
class ForEach
{
public static void main(String args[])
{
ArrayList <String> num=new ArrayList<String>();
num.add("Amit");
num.add("Nitin");
num.add("Ravi");
num.add("Abhishek");
num.add("Deepika");
num.forEach((n)-> print(n));
}
public static void print(String n)
{
System.out.println("Student name" +n);
}
}