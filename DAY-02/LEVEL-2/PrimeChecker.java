import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        //Declaring the isPrime variable as true
        boolean isPrime = true;
        
        // Check if the number is less than or equal to 1
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number ; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        // Print the result based on the isPrime variable
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        input.close();
    }
}