import java.util.Scanner;
public class ComputeSimpleInterest{
	public static void main(String[] args){
		//Declaring variable which contains principal, rate, time
		int pricipal , rate, time ;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Principal :- ");
		
		//Taking pricipal from the user
		pricipal = input.nextInt();
		
		System.out.print("Enter the rate:- ");
		
		//Taking rate from the user
		rate = input.nextInt();
		
		System.out.print("Enter the time:- ");
		
		//Taking time from the user
		time = input.nextInt();

		//Computing the simple interest
		int simpleInterest = ( pricipal * rate * time ) / 100;	
		
		//Display the information
		System.out.print("The Simple Interest is "+ simpleInterest +" for Principal "+ pricipal +" , Rate of Interest "+ rate +" and Time " + time);
		
		//close the scanner input
		input.close();
		
	}
	
}