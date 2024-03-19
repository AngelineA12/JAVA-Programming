// Bank package (bank)
package bank;

import account.Account;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to add new account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    // Method to remove account
    public void removeAccount(Account account) {
        accounts.remove(account);
        System.out.println("Account removed successfully.");
    }

    // Method to display all accounts
    public void displayAllAccounts() {
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Balance: " + account.checkBalance());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("-------------------------------------------");
        }
    }
}
