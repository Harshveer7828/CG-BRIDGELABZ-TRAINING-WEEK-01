import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Declaring variable to store the year input
        int year;

        // Creating an instance of Scanner
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter the year
        System.out.print("Enter the year (>= 1582): ");
        year = input.nextInt();

        // Conditions to find the leap year
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("The program works for years >= 1582 only.");
        }

       
        // Closing the scanner
        input.close();
    }
}
