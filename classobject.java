public class classobject {
    String name;
    int rollNumber;
    double marks;

    void setDetails(String studentName, int studentRoll, double studentMarks) {
        name = studentName;
        rollNumber = studentRoll;
        marks = studentMarks;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks + "%");
    }

    public static void main(String[] args) {
        classobject student1 = new classobject();
        student1.setDetails("Arjun Kumar", 101, 87.5);
        student1.displayDetails();
    }
}
