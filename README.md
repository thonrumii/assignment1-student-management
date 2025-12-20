A. Project overview

This project is a Java-based student management system designed to demonstrate core OOP concepts. The program uses separate classes to represent students and courses, allows basic academic data to be stored, processed, and manipulated.

The project integrates all learned topics by combining OOP structure with real-life logic: by applying concepts from real-life, such as GPA, credit tracking, and course enrollment, into Java-based system that models how academic data is managed at a university.

B. Class descriptions

The Student class represents an individual student and stores their academic information. Fields: name, id, major, gpa, credits. All fields are private to ensure encapsulation.
The constructor initializes name, id, and major & sets default values for gpa and credits.

Methods: getters and setters for all fields; isHonors() - checks whether the student has gpa 3.5 or higher;
toString() - returns a formatted description of student.

The Course class represents a university course and demonstrates composition, since it contains an array of Student objects. Fields: courseName, instructor, students[]. The constructor initializes course name, instructor, and student array size.

Methods: addStudent(Student s, int index) - adds a student to the array; courseAverageGPA() - calculates and returns the average gpa of enrolled students; highestCreditStudent() - finds and return the student with highest gpa on the course;
toString() - returns a course summary.

C. Instructions to compile and run

Go to the src directory and run following commands:

javac *.java

java Main

D. Screenshots

Screenshots included in the docs/screenshots folder. They demonstrate the outputs of the program. These outputs confirm that all required functionalities work correctly.

E. Reflection

This project helped me fully understand the structure of Java and ways to work with classes, methods. I faced a lot of issues in the beginning, since I couldn't understand how everything should work, but by trying to do this project by myself, instead of just reading guides boosted my knowledge and gave me experience I needed to understand all topics from lectures: encapsulations, setters and getters, constructors.
Also, I find it important to mention that formulation of assignment itself helped me a lot : the structure was so clear, and the comments of what I should include or not helped me.
