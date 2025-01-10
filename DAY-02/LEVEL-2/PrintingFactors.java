import java.util.Scanner;

public class PrintingFactors {
    public static void main(String[] args) {
        // Declaring a Scanner class
        Scanner scanner = new Scanner(System.in);

        // Get the input value for the variable
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Loop to find the factors and printing them
        for (int i = 1; i <= number; i++) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
