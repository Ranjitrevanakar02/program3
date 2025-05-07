class student {
    private String name;
    private int birthYear, birthMonth, birthDay;

    public student(String name, int birthYear, int birthMonth, int birthDay) {
        this.name = name;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Date of Birth: " + birthDay + "/" + birthMonth + "/" + birthYear);
    }

    public static void main(String[] args) {
        student student = new student("John Doe", 2000, 5, 10);
        student.displayStudentInfo();
    }
}
