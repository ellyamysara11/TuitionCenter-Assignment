import java.time.LocalDate;
public class Tutor {
    private String name;
    private String ic;
    private String address;
    private String qualification;
    private int yearExp;
    private LocalDate dateJoined;
    private int yearsInCenter;

    public Tutor(String name, String ic, String address, String qualification, int yearExp, LocalDate dateJoined, int yearsInCenter) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.qualification = qualification;
        this.yearExp = yearExp;
        this.dateJoined = dateJoined;
        this.yearsInCenter = yearsInCenter;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getYearExp() {
        return yearExp;
    }
    
    public void printBackground() {
        System.out.println("Name: " + name);
        System.out.println("IC: " + ic);
        System.out.println("Address: " + address);
        System.out.println("Qualification: " + qualification);
        System.out.println("Years of experience: " + yearExp);
        System.out.println("Date joined: " + dateJoined);
        System.out.println("Years in center: " + yearsInCenter);
    }

}    
  

   

