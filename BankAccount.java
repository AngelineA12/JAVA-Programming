//Importing the package to get the user input
import java.util.Scanner;

//Creating a class named BankAccount
public class BankAccount {
    private double balance; // Instance variable representing account balance
    static String accountNumber; // Instance variable representing account number
    private static final double INTEREST_RATE = 0.05; // Static constant representing interest rate
    

    static 
   {
        // Static block to initialize static variables or perform other one-time initialization tasks
        System.out.println("Initializing the BankAccount class...");
    }

    public BankAccount(double initialBalance) 
    {
        balance = initialBalance;
        
        
    }
     
    public void performTransaction(double transactionAmount, String transactionId) {
        BankTransaction transaction = new BankTransaction(transactionId, transactionAmount);
        transaction.processTransaction();
        // Update balance
        balance += transactionAmount;
    }

    public void displayResults() {
        // Display all results at the end
        System.out.println("Displaying Results:");
        
        System.out.println("Interest for the account: " + calculateInterest(balance));

        // Display total balance after transactions
        System.out.println("Total Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

   

    private static double calculateInterest(double amount) {
        // Static function to calculate interest based on the interest rate
        return amount * INTEREST_RATE;
    }

    // Static nested class representing a bank transaction
    private static class BankTransaction {
        private String transactionId;
        private double amount;

        public BankTransaction(String transactionId, double amount) {
            this.transactionId = transactionId;
            this.amount = amount;
        }

        public void processTransaction() {
            // Process the transaction logic
            // Implementation details omitted for brevity
            System.out.println("Processing transaction " + transactionId + " of amount " + amount);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get initial balance for the account
        System.out.print("Enter initial balance for the account: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        // Create a bank transaction
        System.out.print("Enter transaction ID: ");
        String transactionId = scanner.next();
        System.out.print("Enter transaction amount: ");
        double transactionAmount = scanner.nextDouble();

        account.performTransaction(transactionAmount, transactionId);

        // Add an empty line before displaying the results
        System.out.println();

        account.displayResults(); // Display all results at the end
    }
}
