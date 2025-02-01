package atm.machine.oop;

import java.util.Scanner;

public class ATM {

    private Account account;
    private Scanner scanner;

    public ATM(Account account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("ATM Machine");
        System.out.println("[1] Check Balance");
        System.out.println("[2] Withdraw");
        System.out.println("[3] Deposit");
        System.out.println("[4] Exit");
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.print("Enter your Choice : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount : $");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal Successful ");
                    } else {
                        System.out.println("Inciuficient Balance : ");
                    }
                    break;

                case 3:
                    System.out.println("Enter deposit amount : $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit Successful ");
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM Goodbye ");
                    break;

                default:
                    System.out.println("Invalid Choice ");
                    break;

            }
        }
    }
}
