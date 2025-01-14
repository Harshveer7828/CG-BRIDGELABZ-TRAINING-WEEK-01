import java.util.Scanner;
public class IllegalArgumentExceptionDemo{

    // Method that generates an IllegalArgumentException
    public static void generateException(String input) {
        try {
            // Trying to create a substring with start index greater than end index
            String subSubstring = input.substring(5, 2);
            System.out.println("Substring: " + subSubstring);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Method that handles the exception using a try-catch block
    public static void handleRuntimeException(String input) {
        try {
            // Attempt to create a substring with incorrect indices
            String subSubstring = input.substring(5, 2);
            System.out.println("Substring: " + subSubstring);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = input.nextLine();

        // Call the method to generate the exception
        generateException(userString);

        // Call the method to handle the RuntimeException
        handleRuntimeException(userString);
        // scanner object close
        input.close();
    }
}