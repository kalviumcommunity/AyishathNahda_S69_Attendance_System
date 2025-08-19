public class Student {
    String studentId;
    String studentName;

    public void setDetails(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);

}
}