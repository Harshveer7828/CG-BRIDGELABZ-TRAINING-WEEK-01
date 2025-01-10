import java.util.Scanner;
public class CelsiusToFahrenheit{
	public static void main(String[] args){
		//Declaring variables which contains temperature
		float celsius, farenheitResult ;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in celsius :- ");
		
		//Taking temperatureIncelcius from the user
		celsius = input.nextFloat();
		
		//Converting the temperature into fahrenheit
		farenheitResult  = ((celsius * 9) / 5 ) + 32;
		
		//Display the information
		System.out.print("The "+ celsius + "celsius is "+ farenheitResult + " fahrenheit");
		
		//close the scanner input
		input.close();
		
	}
	
}