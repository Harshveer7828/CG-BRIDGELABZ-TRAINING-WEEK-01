import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		double heightInCm, weight, heightInMeters, bmi;
        
        // Get input from the user to enter weight in kilograms
        System.out.print("Enter your weight in kg: ");
        weight = input.nextDouble();
        
        // taking input from the user to enter height in centimeters
        System.out.print("Enter your height in cm: ");
        heightInCm = input.nextDouble();
        
        // Convert height from centimeters to meters
        heightInMeters = heightInCm / 100;
        
        // Calculate BMI using the formula
        bmi = weight / (heightInMeters * heightInMeters);
        
        // Determine the weight status
        String weightStatus;
        if (bmi < 18.4) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi < 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obes");
        }
		
        //closing the scanner
        input.close();
	}
}