import java.util.Scanner;
public class FahrenheitToCelsius{
	public static void main(String[] args){
		//Declaring variables which contains temperature
		float fahrenheit, celsiusResult ;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in fahrenheit :- ");
		
		//Taking temperatureIncelcius from the user
		fahrenheit = input.nextFloat();
		
		//Converting the temperature into fahrenheit
		celsiusResult  = ((fahrenheit - 32) * 5 ) / 9;
		
		//Display the information
		System.out.print("The "+ fahrenheit + "fahrenheit is "+ celsiusResult + " celsiusResult");
		
		//close the scanner input
		input.close();
		
	}
	
}