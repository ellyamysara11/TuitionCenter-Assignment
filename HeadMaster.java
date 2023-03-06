public class HeadMaster {
    private String name;
    private String ic;
    private String address;
    private String centerAddress;
    private int yearsInCenter;
    private int yearsOfExperience;
    
    public HeadMaster(String name, String ic, String address, String centerAddress, int yearsInCenter, int yearsOfExperience) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.centerAddress = centerAddress;
        this.yearsInCenter = yearsInCenter;
        this.yearsOfExperience = yearsOfExperience;
    }
    public HeadMaster(String address){
        this.address = address;
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
    
    public String getCenterAddress() {
        return centerAddress;
    }
    
    public void setCenterAddress(String centerAddress) {
        this.centerAddress = centerAddress;
    }
    
    public int getYearsInCenter() {
        return yearsInCenter;
    }
    
    public void setYearsInCenter(int yearsInCenter) {
        this.yearsInCenter = yearsInCenter;
    }
    
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
