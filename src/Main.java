public class Main {

    public static void main(String[] args){
        Student s1 = new Student("Aidana", "S001", "Chemical Engineering");
        Student s2 = new Student("Yasmeen", "S002", "Business");
        Student s3 = new Student("Ulanbek", "S003", "Computer Science");
        Student s4 = new Student("Dimash", "S004", "Geography");
        Student s5 = new Student("Aisulu", "S005", "Microbiology");

        s1.updateGpa(3.8); s1.addCredits(80);
        s2.updateGpa(3.6); s2.addCredits(60);
        s3.updateGpa(2.9); s3.addCredits(75);
        s4.updateGpa(3.0); s4.addCredits(55);
        s5.updateGpa(3.5); s5.addCredits(90);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        Student[] students={s1,s2,s3,s4,s5};

        Course course = new Course("OOP", "Aidka", 5);
        for(int i=0; i< students.length; i++){
            course.addStudent(students[i],i);
        }

        System.out.println("\n"+course);
        System.out.println("Avr GPA:"+course.courseAverageGPA());
        System.out.println("Highest Credit Student:"+ course.highestCreditStudent());

        System.out.println("\nTop Student by GPA: " + getTopStudent(students));
        System.out.println("Number of Honors Students: " + countHonors(students));
        System.out.println("Total Credits of All Students: " + totalCredits(students));
    }
    public static Student getTopStudent(Student[] arr){
        Student top = null;
        for (Student s : arr) {
            if (top == null || s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        return top;
    }
    public static int countHonors(Student[] arr){
        int count=0;
        for(Student s: arr){
            if(s.isHonors()){
                count++;
            }
        }
        return count;
    }
    public static int totalCredits(Student[] arr){
        int sum=0;
        for(Student s:arr){
            sum+=s.getCredits();
        }
        return sum;
    }
}
