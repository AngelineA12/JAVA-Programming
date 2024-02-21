import java.util.Scanner;


// Main class
public class HealthcareApp {
    // Static variable to store the name of the hospital
    public static String hospitalName = "HealthCare Central";

    // Static block to initialize resources
    static {
        // Perform initialization tasks here
        // Example: Initialize database connection
        System.out.println("Initializing resources...");
    }

    // Static function to calculate BMI
    public static double calculateBMI(double weight, double height) {
        // BMI calculation logic here
        return weight / (height * height);
    }

    // Function to display results including all the inputs obtained from the user
    public static void displayResults(String hospitalName, String medicationName, String manufacturer, String expiryDate, double weight, double height, boolean isMedicationExpired) {
        System.out.println("____________________________");
        System.out.println("Displaying the results");
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Medication Name: " + medicationName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " meters");
        System.out.println("BMI: " + calculateBMI(weight, height));
        System.out.println("Is Medication Expired? " + isMedicationExpired);
        System.out.println("___________________________");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept medication details from the user
        System.out.println("Enter medication details:");
        System.out.print("Name: ");
        String medicationName = scanner.nextLine();
        System.out.print("Manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Expiry Date (YYYY-MM-DD): ");
        String expiryDate = scanner.nextLine();

        // Create medication object
        Medication medication = new Medication(medicationName, manufacturer, expiryDate);

        // Accept height and weight from the user
        System.out.println("Enter patient details:");
        System.out.print("Weight (in kilograms): ");
        double weight = scanner.nextDouble();
        System.out.print("Height (in meters): ");
        double height = scanner.nextDouble();

        // Check if the medication is expired
        boolean isMedicationExpired = MedicationUtils.isExpired(medication);

        // Display results
        displayResults(hospitalName, medicationName, manufacturer, expiryDate, weight, height, isMedicationExpired);
    }
}

// Static class to represent a medication
class Medication {
    String name;
    String manufacturer;
    String expiryDate;

    public Medication(String name, String manufacturer, String expiryDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
    }
}

// Static class containing utility methods for medication management
class MedicationUtils {
    // Static method to check if a medication is expired
    public static boolean isExpired(Medication medication) {
        // Get current date
        String currentDate = "2024-02-20"; // For demonstration purpose, replace with actual date logic

        // Compare medication's expiry date with current date
        return medication.expiryDate.compareTo(currentDate) < 0;
    }
}


