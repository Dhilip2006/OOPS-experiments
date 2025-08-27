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

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        sc.close();
    }

    void showAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
    }
}

public class classobject {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.openAccount();
        acc1.showAccount();
    }
}
