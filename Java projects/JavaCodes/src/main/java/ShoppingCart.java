import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("**** SHOPPING CART ****");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. BitCoin");
            System.out.println("4. Exit");
            System.out.print("Enter the Choice ::");
            choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------");
            
            switch (choice) {
                case 1:
                    processCreditCardPayment(scanner);
                    break;
                case 2:
                    processPayPalPayment(scanner);
                    break;
                case 3:
                    processBitcoinPayment(scanner);
                    break;
                case 4:
                    System.out.println("Thank you For Shopping !!!!");
                    break;
                default:
                    System.out.println("Invalid Payment Mode !!!");
                    break;
            }
            
            System.out.println("----------------------------------------------------------");
        } while (choice != 4);
        
        scanner.close();
    }
    
    private static void processCreditCardPayment(Scanner scanner) {
        System.out.print("Enter amount to be Transferred :: ");
        double amount = scanner.nextDouble();
        System.out.println("----------------------------------------------------------");
        scanner.nextLine();  
        System.out.print("Card holder Name :: ");
        String cardHolderName = scanner.nextLine();
        System.out.print("Card Number :: ");
        String cardNumber = scanner.nextLine();
        System.out.print("Card Expire Date :: ");
        String expireDate = scanner.nextLine();
        System.out.println("----------------------------------------------------------");
        System.out.println("Paying through CreditCard payment: Charging $" + amount);
    }
    
    private static void processPayPalPayment(Scanner scanner) {
        System.out.print("Enter amount to be Transferred :: ");
        double amount = scanner.nextDouble();
        System.out.println("----------------------------------------------------------");
        System.out.println("Checking Internet Connection........");
        System.out.println("----------------------------------------------------------");
        System.out.println("Paying through PayPal payment: Charging $" + amount);
    }
    
    private static void processBitcoinPayment(Scanner scanner) {
        System.out.print("Enter amount to be Transferred :: ");
        double amount = scanner.nextDouble();
        System.out.println("----------------------------------------------------------");
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Enter Transaction 'Input Address' :: ");
        String inputAddress = scanner.nextLine();
        System.out.println("----------------------------------------------------------");
        System.out.println("Paying through BitCoin payment: Charging $" + amount);
    }
}

