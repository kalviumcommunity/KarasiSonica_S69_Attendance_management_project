public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "10th Grade");
        Teacher teacher = new Teacher("Mr. Smith", "Mathematics");
        Staff staff = new Staff("John", "Librarian");

        student.displayDetails();
        System.out.println("--------------------");
        teacher.displayDetails();
        System.out.println("--------------------");
        staff.displayDetails();

        // Example: using student ID for attendance record
        System.out.println("--------------------");
        System.out.println("Recording attendance for Student ID: " + student.getId());
    }
}
