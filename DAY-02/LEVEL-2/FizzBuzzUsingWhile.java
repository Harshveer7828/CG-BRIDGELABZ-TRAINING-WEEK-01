import java.util.Scanner;

public class FizzBuzzUsingWhile {
    public static void main(String[] args) {
        // Declaring a variable to store the user's input
        int number;

        // Declaring Scanner class instance
        Scanner input = new Scanner(System.in);

        // Get the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        // Checking if the input is a positive integer
        if (number > 0) {
            int i = 0;

            // Using while loop to iterate from 0 to the input number
            while (i <= number) {
                // Checking for multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i+" FizzBuzz");
                }
                // Checking for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println(i+" Fizz");
                }
                // Checking for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println(i+" Buzz");
                }
                // Incrementing the loop variable
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Closing the scanner
        input.close();
    }
}
