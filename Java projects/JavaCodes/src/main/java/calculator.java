
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Choose an operation: +, -, *, /, %");
        char operator = scanner.next().charAt(0);
        
        double result;
        
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            case '%':
                // Check for division by zero
                if(num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        
        System.out.println("The result is: " + result);
    }
}
