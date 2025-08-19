public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the School Management System!");

    Student[] students= new Student[4];
    students[0]=new Student();
    students[0].setDetails("1", "Alice");
    students[1]=new Student();
    students[1].setDetails("2", "Bob");
    students[2]=new Student();
    students[2].setDetails("3", "Charlie");
    students[3]=new Student();
    students[3].setDetails("4", "David");

    Course[] courses=new Course[3];
    courses[0]=new Course();
    courses[0].setDetails("1","Mathematics");
    courses[1]=new Course();
    courses[1].setDetails("2","English");
    courses[2]=new Course();
    courses[2].setDetails("3","Economics");

    // Display Students
    System.out.println("\nRegistered Students:");
    for (Student student : students) {
        if (student != null) {
            student.displayDetails();
        }
    }

    // Display Courses
    System.out.println("\nAvailable Courses:");
    for (Course course : courses) {
        if (course != null) {
            course.displayDetails();
}
}
}
}
