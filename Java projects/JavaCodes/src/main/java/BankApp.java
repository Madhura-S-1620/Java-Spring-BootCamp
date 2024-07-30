import java.util.Scanner;

class Account {
    private String name;
    private int age;
    private String accountId;
    private String accountType;
    private double balance;
    private double minimumBalance;

   
    public Account(String name, int age, String accountId, String accountType, double balance, double minimumBalance) {
        this.name = name;
        this.age = age;
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    
    public void displayAccount() {
        System.out.println("Welcome " + name + "! Following are your account details:");
        System.out.println("Age : " + age);
        System.out.println("Account Id: " + accountId);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Minimum balance: " + minimumBalance);
    }

    
    public void checkBalance() {
        System.out.println("Balance is: " + balance);
    }

   
    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. Balance is: " + balance);
    }


    public void withdrawAmount(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Sorry!!! Not enough balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Balance is: " + balance);
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = null;

        while (true) {
            System.out.println("=================================================");
            System.out.println("\t1.Create Account");
            System.out.println("\t2.Display Account");
            System.out.println("\t3.Check Balance");
            System.out.println("\t4.Deposit Amount");
            System.out.println("\t5.Withdraw Amount");
            System.out.println("\t6.Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter your name: ");
                    String name = sc.next();
                    int age;
                    while (true) {
                        System.out.print("Enter your age: ");
                        age = sc.nextInt();
                        if (age >= 18) {
                            break;
                        }
                        System.out.println("Minimum age should be 18 to create an account.");
                        System.out.print("Please enter valid age: ");
                    }
                    System.out.print("Enter your account Id: ");
                    String accountId = sc.next();
                    System.out.print("Enter your account type: ");
                    String accountType = sc.next();
                    System.out.print("Enter balance: ");
                    double balance = sc.nextDouble();
                    System.out.print("Enter minimum balance: ");
                    double minimumBalance = sc.nextDouble();
                    account = new Account(name, age, accountId, accountType, balance, minimumBalance);
                    break;
                case 2:
                    if (account != null) {
                        account.displayAccount();
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 3:
                    if (account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 4:
                    if (account != null) {
                        System.out.print("Enter the amount you want to deposit: ");
                        double depositAmount = sc.nextDouble();
                        account.depositAmount(depositAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 5:
                    if (account != null) {
                        System.out.print("Enter the amount you want to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdrawAmount(withdrawAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("INVALID INPUT !!");
            }
        }
    }
}
