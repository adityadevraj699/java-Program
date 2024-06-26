public class CourseDetail1 {
    String courseName;
    int enrollments;
    static int maxCapacity = 10;
    String[] enrolledStudents;

    

    static void setMaxCapacity(int maxCapacity) {
        CourseDetail1.maxCapacity = maxCapacity;

    }
    CourseDetail1(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            System.out.println("Congratulation, enrolled student: " + studentName);
            enrollments++;
        } else {
            System.out.println("Enrollment failed. Course is at maximum capacity.");
        }
    }

    void unenrollStudent(String studentName) {
        boolean found = false;
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                found = true;
                for (int j = i; j < enrollments - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[enrollments - 1] = null;
                enrollments--;
                System.out.println("Student removed: " + studentName);
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found: " + studentName);
        }
    }

    public static void main(String[] args) {
        CourseDetail1 course = new CourseDetail1("Java Core");
        course.enrollStudent("Aditya Kumar");
        course.enrollStudent("Rishu Kumar");
        course.enrollStudent("Rohit Kumar");
        course.enrollStudent("Shushant Kumar");
        course.enrollStudent("Mohit Kumar");
        course.unenrollStudent("Mohit Kumar");

        // Try enrolling a student when the course is full
        
    }
}
