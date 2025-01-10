import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get input from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Initialize the count variable
        int digitCount = 0;
        
        // Use a loop to count the digits
        while(number != 0 ){
            number /= 10;    // removing last digit 
            digitCount++;    // incrementing the count 
        }
        // Display the count
        System.out.println("The number of digits is: " + digitCount);
        
		//close the scanner
        input.close();
    }
}

