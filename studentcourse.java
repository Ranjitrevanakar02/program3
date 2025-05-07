public class studentCourse {
    // Instance variables
    private String courseName;
    private int marks;

    // Constructor to initialize the course name and marks
    public studentCourse(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    // Display function to show course name and marks
    public void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Marks: " + marks);
    }

    // Main method to test the StudentCourse class
    public static void main(String[] args) {
        // Create an object of StudentCourse
        studentCourse studentCourse = new studentCourse("Mathematics", 85);

        // Call the display method to show the course name and marks
        studentCourse.display();
    }
}
