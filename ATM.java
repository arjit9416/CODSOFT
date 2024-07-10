import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.printf("Deposit successful. Your new balance is: $%.2f%n", balance);
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.printf("Withdrawal successful. Your new balance is: $%.2f%n", balance);
        }
    }

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(0.0);
        atm.mainMenu();
    }
}