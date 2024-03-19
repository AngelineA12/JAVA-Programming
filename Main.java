import account.Account;
import bank.Bank;
import transaction.Transaction;

public class Main {
    public static void main(String[] args) {
        // Create some accounts
        Account account1 = new Account(1001, "Alice", 5000, "Savings");
        Account account2 = new Account(1002, "Bob", 3000, "Checking");

        // Perform transactions
        Transaction.transfer(account1, account2, 2000);
        Transaction.transfer(account2, account1, 1000);

        // Create a bank and add accounts to it
        Bank bank = new Bank();
        bank.addAccount(account1);
        bank.addAccount(account2);

        // Display all accounts in the bank
        bank.displayAllAccounts();
    }
}
