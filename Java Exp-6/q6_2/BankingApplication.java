package q6_2;

import bank.Account;
import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account firstAccount = new Account(101, "Aarav", 5000);
        Account secondAccount = new Account(102, "Diya", 3000);

        System.out.println("Initial account details:");
        firstAccount.displayAccount();
        secondAccount.displayAccount();

        System.out.print("Enter deposit amount for Aarav: ");
        firstAccount.deposit(scanner.nextDouble());

        System.out.print("Enter withdrawal amount for Diya: ");
        secondAccount.withdraw(scanner.nextDouble());

        System.out.println("\nUpdated account details:");
        firstAccount.displayAccount();
        secondAccount.displayAccount();

        scanner.close();
    }
}