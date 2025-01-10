import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        double first, second;
        String op;

        // Declare a Scanner class to get user input
        Scanner scanner = new Scanner(System.in);

        // Get input values for first number, second number, and operator
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();

        // Perform operations
        switch (op) {
            case "+":
                // Perform addition
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                // Perform subtraction
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                // Perform multiplication
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // Perform division and handle division by zero
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                // Handle invalid operator
                System.out.println("Invalid Operator.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
