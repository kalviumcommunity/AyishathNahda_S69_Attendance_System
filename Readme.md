# School Attendance System

This is a part1 of the code-along project.

## SESSION1:

1. Verified Java and installed the extension coderunner
2. Created a folder src/com/school and under school folder a file - Main.java
3. Then  compiling the code using javac src/com/school/Main.java
4. Created a new branch called -part1 and then added to github
5. run the code using the play button directly.

screenshot link: https://drive.google.com/drive/folders/1Z_bjxXwqZ1ElloNnk2TI9KgDQITwoytI?usp=drive_link


## Session 2: Core Domain Modelling
- Defined `Student` class with `studentId`, `name`, `setDetails()`, and `displayDetails()` method.
- Defined `Course` class with `courseId`, `courseName`, `setDetails()`, and `displayDetails()` method.
- Utilized arrays of objects in `Main.java` to manage and display multiple students and courses.
- Introduced basic usage of `this` keyword.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/Student.java src/com/school/Course.java src/com/school/Main.java` (or `javac src/com/school/*.java`)
3. Run: `java -cp src com.school.Main`

Part 3: Constructor Initialization & Auto-ID Generation
Implemented parameterized constructors in Student and Course classes for object initialization.
Utilized private static member variables for automatic and unique ID generation.
Demonstrated the use of the this keyword to distinguish instance variables from constructor parameters.
Changed Course's courseId to int for simpler auto-generation and updated its display.
Updated Main.java to use constructors and show ID progression.

## Part 5: Establishing Students, Teaching & Non-Teaching Staff hierarchy
- Created a base class `Person.java` with common attributes (`id`, `name`), a universal auto-ID generator, and a `displayDetails()` method.
- Modified `Student.java` to inherit from `Person`, using `super()` to call the parent constructor and overriding `displayDetails()` to add student-specific info (e.g., grade level).
- Created `Teacher.java` extending `Person`, adding a `subjectTaught` attribute and its own `displayDetails()`.
- Created `Staff.java` extending `Person`, adding a `role` attribute and its own `displayDetails()`.
- Demonstrated creation and display of `Student`, `Teacher`, and `Staff` objects in `Main.java`.
- Updated `AttendanceRecord` creation to use the inherited `getId()` method.