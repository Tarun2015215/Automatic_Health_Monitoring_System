import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HealthMonitoringSystem system = new HealthMonitoringSystem();
        Scanner scanner = new Scanner(System.in);

       
        Patient patient1 = new Patient("John Doe", 45, "Rural Area");
        system.addPatient(patient1);

        while (true) {
            System.out.println("\n1. Add Report");
            System.out.println("2. View Reports");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter report: ");
                    String report = scanner.nextLine();
                    system.addReportToPatient(patientName, report);
                    break;

                case 2:
                    System.out.print("Enter patient name: ");
                    patientName = scanner.nextLine();
                    system.getReportsForPatient(patientName);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
