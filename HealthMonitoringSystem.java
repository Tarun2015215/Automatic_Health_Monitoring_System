import java.util.HashMap;

class HealthMonitoringSystem {
    private HashMap<String, Patient> patientsData;  // Stores patients by name

    public HealthMonitoringSystem() {
        this.patientsData = new HashMap<>();
    }

    public void addPatient(Patient patient) {
        patientsData.put(patient.getName(), patient);
    }

    public void addReportToPatient(String patientName, String report) {
        Patient patient = patientsData.get(patientName);
        if (patient != null) {
            patient.addReport(report);
            System.out.println("Report added successfully!");
        } else {
            System.out.println("Patient not found!");
        }
    }

    public void getReportsForPatient(String patientName) {
        Patient patient = patientsData.get(patientName);
        if (patient != null) {
            List<String> reports = patient.getReports();
            System.out.println("Reports for " + patientName + ":");
            for (String report : reports) {
                System.out.println(report);
            }
        } else {
            System.out.println("Patient not found!");
        }
    }
}
