import java.util.Scanner;

class input
{
public static void main(String args[])
{
// Create scanner class object
Scanner obj = new Scanner(System.in);
System.out.println("Enter name: ");
//Read the input from the user
String name = obj.nextLine();
System.out.println("Name: " + name);

System.out.println("Enter the contact number: ");
int num = obj.nextInt();
System.out.println("Number: " + num);

System.out.println("Enter the Salary: ");
Double Salary = obj.nextDouble();
System.out.println("Salary: " + Salary);
}
}