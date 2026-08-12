import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Deposit Amount : ");
                    balance += sc.nextDouble();
                    System.out.println("Amount Deposited Successfully");
                    break;
                case 2:
                    System.out.print("Enter Withdraw Amount : ");
                    double amount = sc.nextDouble();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Collect Your Cash");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 3:
                    System.out.println("Available Balance : " + balance);
                    break;
                case 4:
                    System.out.println("Thank You...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);

        sc.close();
    }
}
