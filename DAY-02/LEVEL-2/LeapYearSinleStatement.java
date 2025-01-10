import java.util.Scanner;

public class LeapYearSinleStatement {
    public static void main(String[] args) {
        // Declaring variable to store the year input
        int year;

        // Creating an instance of Scanner
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter the year
        System.out.print("Enter the year (>= 1582): ");
        year = input.nextInt();

        // Conditions to find leap year using logical operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("The program works for years >= 1582 only.");
        }

        // Closing the scanner
        input.close();
    }
}
