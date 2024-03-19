// Account Management package (account)
package account;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    // Constructor to initialize account details
    public Account(int accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Getter method for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter method for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter method for account type
    public String getAccountType() {
        return accountType;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited successfully.");
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }
}
