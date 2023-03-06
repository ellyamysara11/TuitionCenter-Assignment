/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.time.LocalDate;
public class Main{
    public static void main(String[] args) {
        // Create a new TuitionCenter object
        TuitionCenter center1 = new TuitionCenter("Pandai Sdn Bhd", new HeadMaster("KL"));
        TuitionCenter center2 = new TuitionCenter("Bestari Sdn Bhd", new HeadMaster("Ipoh"));

        // Add some tutors to the center
        Tutor tutor1 = new Tutor("John Wick", "123456-01-0001", "123 Klang", "BA in Education", 5,java.time.LocalDate.of(2018, 1, 1),2019);
        Tutor tutor2 = new Tutor("Stan Smith", "123456-01-0002", "456 Kota Tampan", "MA in Mathematics", 3,java.time.LocalDate.of(2019, 1, 1),2016);
        Tutor tutor3 = new Tutor("Baby Johnson", "123456-01-0003", "789 Kepala Batas", "MA in Chemistry", 10,java.time.LocalDate.of(2010, 1, 1) ,2010);
        center1.addTutor(tutor1);
        center2.addTutor(tutor2);
        center2.addTutor(tutor3);

        // Add some students to the center
        int[] scores1 = {80, 90, 75};
        Student student1 = new Student("Amir", "123456-01-0001", "7 Seri Klebang", 2022, "SMK Anderson",scores1);
        
        int[] scores2 = {70, 85, 90};
        Student student2 = new Student("Aidura", "123456-02-0002", "45 Jelapang", 2022, "SMK Seri Puteri",scores2);
        
        int[] scores3 = {95, 90, 98};
        Student student3 = new Student("Yaya", "123456-03-0003", "123 Taman Meru", 2022, "SMK Tarsician Convent", scores3);
        
        center1.addStudent(student1);
        center1.addStudent(student2);
        center2.addStudent(student3);
        
     
        // Generate a report for the #student detail
        System.out.println("Student 1: " + student1.getName() + ", IC: " + student1.getIc() + ", Address: " + student1.getAddress()
                + ", Year: " + student1.getYear() + ", School Name: " + student1.getSchoolName() + ", Average Score: " + student1.getAverageScore()
                + ", Min Score: " + student1.getMinScore() + ", Max Score: " + student1.getMaxScore());
                
        System.out.println("\nStudent 2: " + student2.getName() + ", IC: " + student2.getIc() + ", Address: " + student2.getAddress()
                + ", Year: " + student2.getYear() + ", School Name: " + student2.getSchoolName() + ", Average Score: " + student2.getAverageScore()
                + ", Min Score: " + student2.getMinScore() + ", Max Score: " + student2.getMaxScore());

        System.out.println("\nStudent 3: " + student3.getName() + ", IC: " + student3.getIc() + ", Address: " + student3.getAddress()
                + ", Year: " + student3.getYear() + ", School Name: " + student3.getSchoolName() + ", Average Score: " + student3.getAverageScore()
                + ", Min Score: " + student3.getMinScore() + ", Max Score: " + student3.getMaxScore());        
        
        System.out.println("\nReport for Pandai Sdn Bhd ");
        System.out.println("Number of tutors: " + center1.getNumTutors());
        System.out.println("Number of students: " + center1.getNumStudents());
        System.out.println("Average marks: " + center1.getAverageScore());
        System.out.println("Minimum marks: " + center1.getMinScore());
        System.out.println("Maximum marks: " + center1.getMaxScore()); 
        System.out.print("\n");
        System.out.println("Tutors' backgrounds:");//#tutor detail
        center1.printTutorsBackground();
        
        System.out.println("\nReport for Bestari Sdn Bhd ");
        System.out.println("Number of tutors: " + center2.getNumTutors());
        System.out.println("Number of students: " + center2.getNumStudents());
        System.out.println("Average marks: " + center2.getAverageScore());
        System.out.println("Minimum marks: " + center2.getMinScore());
        System.out.println("Maximum marks: " + center2.getMaxScore());
        System.out.print("\n");
        System.out.println("Tutors' backgrounds:");//#tutor detail
        center2.printTutorsBackground();

    }
}

