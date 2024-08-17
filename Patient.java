import java.util.*;

class Patient {
    private String name;
    private int age;
    private String address;
    private List<String> medicalReports;  

    public Patient(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.medicalReports = new ArrayList<>();
    }

    
    public void addReport(String report) {
        medicalReports.add(report);
    }

   
    public List<String> getReports() {
        return medicalReports;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
