// Create TravelComputation Class to compute the Distance and Travel Time
import java.util.Scanner;
class TravelComputation {
   
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Declare the variables
		String nameOfPerson;
		System.out.print("Enter the name of person:- ");
		nameOfPerson = input.nextLine();
		
		//creating the dummy string to ignore the enter press key while taking input
		//String dum1 = input.nextLine();
		
		//Creating a variable which indicates the city from, via and to
		String fromCity, viaCity, toCity;
		
		// Taking the city name comming from
		System.out.print("Enter the city name comming from:- ");
		fromCity = input.nextLine();

		// Taking the city name via or pass through
		System.out.print("Enter the city name passed via to reach destination:- ");
		viaCity = input.nextLine();
		
		// Taking the destinationcity name
		System.out.print("Enter the destintion city name:- ");
		toCity = input.nextLine();
		
		/* Creating variables which stores the distance, distanceFromCity contains the 
		distance from fromCity to viaCity and distanceViaCity contains the distance between
		the viaCity to toCity*/
		int distanceFromCity, distanceViaCity;
		
		System.out.print("Enter the distance from "+ fromCity +" to " + viaCity + ":-");
		distanceFromCity = input.nextInt();
		
		System.out.print("Enter the distance from "+ viaCity +" to " + toCity + ":-");
		distanceViaCity = input.nextInt();
		
		/* Creating variables which stores the time taken to reach city, timeTakenFromCity contains the 
		time taken from fromCity to viaCity and timeTakenFromCity contains the time taken between
		the viaCity to toCity*/
		int hoursTakenFromCity, minutesTakenFromCity, hoursTakenViaCity, minutesTakenViaCity;
		
		//Taking the hours and minutes to travel through fromCity to viaCity by the user
		System.out.print("Enter the hours taken to travel " + fromCity + " to " + viaCity+ ":-");
		hoursTakenFromCity = input.nextInt();
		
		System.out.print("Enter the minutes taken to travel " + fromCity + " to " + viaCity+ ":-");
		minutesTakenFromCity = input.nextInt();
		
		//Taking the hours and minutes to travel viaCity to toCity by the user
		System.out.print("Enter the hours taken to travel " + viaCity + " to " + toCity+ ":-");
		hoursTakenViaCity = input.nextInt();
		
		System.out.print("Enter the minutes taken to travel " + viaCity + " to " + toCity+ ":-");
		minutesTakenViaCity = input.nextInt();
		
		// calculating the total time taken to rach the destination.
		int totalTime = hoursTakenFromCity * 60 + minutesTakenFromCity + hoursTakenViaCity * 60 + minutesTakenViaCity;
		int totalDistance = distanceFromCity + distanceViaCity;
		
		// Print the travel details
		System.out.println("The Total Distance travelled by " + nameOfPerson + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");


		
		input.close();
		
		
		
    }
}
