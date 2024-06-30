import java.util.Scanner;

public class StudentList {
    String Name;
    int Age;
    int rollNumber;

    public StudentList(int roll, String name, int age) {
        this.Name = name;
        this.Age = age;
        this.rollNumber = roll;
    }

    @Override
    public String toString() {
        return "StudentList: {" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", rollNumber=" + rollNumber +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 5) {
            System.out.printf("Enter your %d student name: ", i);
            String name = sc.next();
            System.out.println("Enter your student age: ");
            int age = sc.nextInt();
            StudentList list = new StudentList(i, name, age);
            System.out.println(list);
            i++;
        }
        sc.close();
    }
}
