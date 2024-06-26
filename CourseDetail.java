public class CourseDetail {
    String courseName;
    int enrollments;
    static int maxCapacity=10;
    String[] enrolledstudents ;
    CourseDetail(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
        this.enrolledstudents=new String[maxCapacity];
    }
  
    static void setMaxCapacity(int maxCapacity){
        CourseDetail.maxCapacity = maxCapacity;
    }
   
    void enrollStudent(String studentName){
        enrolledstudents[enrollments] = studentName;
        System.out.println("Congratulation  Name as :- "+studentName);
        enrollments++;
    }

    void unenrollstudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }
    public static void main(String[] args) {
        CourseDetail obj=new CourseDetail("java core");
        obj.enrollStudent("Aditya kumar");
        obj.enrollStudent("Rishu kumar");
        obj.enrollStudent("Rohit kumar");
        obj.enrollStudent("Shushant kumar");
        obj.enrollStudent("Mohit kumar");
        obj.unenrollstudent("Mohit kumar");
        
    }

}
