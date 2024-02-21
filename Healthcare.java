//Importing the java package Scanner to get the user input
import java.util.Scanner;

//Creating the class Healthcare containing the main method
public class Healthcare  //Access specifier is public
{
    //Creating the main method
    public static void main(String args[])
    {

        //Creating an object for the getting the input from the user(Scanner)
        Scanner scanner = new Scanner(System.in);
    
        //Creating the object for the class
        Patient patient = new Patient();

        //Getting the elements from the user

        //Patientid
        System.out.println("Enter patient ID:");

        //Read the line of a text and return it as a string(Reads after the whitespace also unlike next())
        patient.patientID = scanner.nextLine(); 
     
        //Patient name
        System.out.println("Enter patient name:");
        patient.name = scanner.nextLine();
  
        //Patient age
        //Validating the age
        //Intializing with a negative value
        int age = -1;
        while(age < 0)
        {
            System.out.println("Enter patient age (Should be non-negative):");
            age = Integer.parseInt(scanner.nextLine());
            if (age < 0)
            {
                System.out.println("Invalid Input, Age should not be negative");
            }
        }
        patient.age = age;

        //Patient Gender
        System.out.println("Enter patient gender:");
        patient.gender = scanner.nextLine();

        //Medical History
        System.out.println("Enter patient medical history:");
        patient.medicalHistory = scanner.nextLine();

        //Contact Number
        System.out.println("Enter patient contact number:");
        patient.contactNumber = scanner.nextLine();

        //Height of the patient
        // Validate height input
        //Assigning an initial value to the height which -1(Negative number)
        //-1 is an invalid number according to the while loop so the loop will run until we give the positive value
        double height = -1;
        while (height < 0) 
        {
            System.out.println("Enter patient height (in meters, must be non-negative):");

            //parseDouble is a string method used to convert string representation of floating point number to double primitive type
            height = Double.parseDouble(scanner.nextLine());
            if (height < 0)
            {
                System.out.println("Invalid input. Height must be non-negative.");
            }
        }
        patient.height = height;

        //Weight of the patient
        // Validate weight input
        double weight = -1;
        while (weight < 0) 
        {
            System.out.println("Enter patient weight (in kilograms, must be non-negative):");
            weight = Double.parseDouble(scanner.nextLine());
            if (weight < 0) 
            {
                System.out.println("Invalid input. Weight must be non-negative.");
            }
        }
        patient.weight = weight;
       
        //Displaying the Patient Information(Calling the member function in another class named patient)
        System.out.println("\nPatient Information:");
        patient.displayInfo();
    }
}

//Creating a class named Patient
class Patient
{
    //Data Members and Access Specifiers
    public String patientID;
    public String name;
    public int age;
    public String gender;
    public String medicalHistory;
    public String contactNumber;
    public double height;
    public double weight;

    //Member function displayinfo to display the patient information
    public void displayInfo()
    {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kilograms");

        //calling the member function for calculating the BMI(Body Mass Index)
        double bmi = calculateBMI();
        System.out.println("BMI: " + bmi);

        //calling the member function to classify the BMI Category
        String bmiCategory = classifyBMI(bmi);
        System.out.println("BMI Category: " + bmiCategory);
    }

    //Member function to caculate the BMI of the Patient
    public double calculateBMI() 
    {
        return weight / (height * height);
    }

    //Member function to classify the BMI of the patient
    public String classifyBMI(double bmi) 
    {
        if (bmi < 18.5)
        {
            return "Underweight";
        } 
        else if (bmi < 25)
        {
            return "Normal weight";
        } 
        else if (bmi < 30)
        {
            return "Overweight";
        } 
        else 
        {
            return "Obese";
        }
    }
}
