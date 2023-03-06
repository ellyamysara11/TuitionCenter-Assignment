public class TuitionCenter {
    private String address;
    private HeadMaster headMaster;
    private Tutor[] tutors;
    private int numTutors;
    private Student[] students;
    private int numStudents;
    private Tutor qualification;
    
    public TuitionCenter(String address, HeadMaster headMaster) {
        this.address = address;
        this.headMaster = headMaster;
        this.tutors = new Tutor[10]; // initial capacity for tutors array
        this.numTutors = 0;
        this.students = new Student[100]; // initial capacity for students array
        this.numStudents = 0;
    }
    
    public void addTutor(Tutor tutor) {
        if (numTutors < tutors.length) {
            tutors[numTutors++] = tutor;
        } else {
            System.out.println("Cannot add more tutors. Array is full.");
        }
    }
    
    public void addStudent(Student student) {
        if (numStudents < students.length) {
            students[numStudents++] = student;
        } else {
            System.out.println("Cannot add more students. Array is full.");
        }
    }
    
    public Tutor getQualification() {
        return qualification;
    }

    public void setQualification(Tutor qualification) {
        this.qualification = qualification;
    }
    
    public String getAddres() {
        return address;
    }
    
    public int getNumStudents() {
        return numStudents;
    }
    
    public int getNumTutors() {
        return numTutors;
    }
    
    public double getAverageScore() {
        double total = 0;
        for (int i = 0; i < numStudents; i++) {
            total += students[i].getAverageScore();
        }
        return total / numStudents;
    }
    
    public int getMinScore() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numStudents; i++) {
            int studentMin = students[i].getMinScore();
            if (studentMin < min) {
                min = studentMin;
            }
        }
        return min;
    }
    
    public int getMaxScore() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numStudents; i++) {
            int studentMax = students[i].getMaxScore();
            if (studentMax > max) {
                max = studentMax;
            }
        }
        return max;
    }
     public String getTutorsBackground() {
        String result = "";
        for (int i = 0; i < tutors.length; i++) {
            result += tutors[i].getName() + " (" + tutors[i].getQualification() + ")\n";
        }
        return result;
    }
    
    public void printTutorsBackground() {
        System.out.println("Tutors in " +address + ":");
        for (int i = 0; i < numTutors; i++) {
            tutors[i].printBackground();
            System.out.print("\n");
        }
    }
}
   