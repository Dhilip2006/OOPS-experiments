import java.util.Scanner;
class BankAccount {
    String accountHolder;
    String accountType;
    double balance;
    void openAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();
        System.out.print("Enter Account Type (Savings/Current): ");
        accountType = sc.nextLine();
        if(!accountType.equalsIgnoreCase("Savings") && 
           !accountType.equalsIgnoreCase("Current")) {
            System.out.println("Invalid Account Type! Defaulting to Savings.");
            accountType = "Savings";
        }
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }
    void showAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Updated Balance: " + balance);
    }
    void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Updated Balance: " + balance);
        }
    }
}
public class classobject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        acc.openAccount();
        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Show Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    acc.showAccount();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;
                case 4:
                    System.out.println("Thank you for using our Bank!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while(choice != 4);
    }
}