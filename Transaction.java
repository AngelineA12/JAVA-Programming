// Transaction Package (transaction)
package transaction;

import account.Account;

public class Transaction {
    // Method to transfer funds between two accounts
    public static void transfer(Account sender, Account receiver, double amount) {
        if (sender.checkBalance() >= amount) {
            sender.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Amount " + amount + " transferred successfully from Account " + sender.getAccountNumber() +
                    " to Account " + receiver.getAccountNumber());
        } else {
            System.out.println("Transfer failed due to insufficient balance.");
        }
    }

    // Method to generate transaction history
    public static void generateTransactionHistory() {
        // Implementation to generate transaction history
    }
}
