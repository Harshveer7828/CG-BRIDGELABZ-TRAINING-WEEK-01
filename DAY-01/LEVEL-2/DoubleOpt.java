import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] args){
		//Declaring variables which contains a,b,c
		double a,b,c;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of a :- ");
		
		//Taking a from the user
		a = input.nextInt();
		
		System.out.print("Enter the value of b :- ");
		
		//Taking b from the user
		b = input.nextInt();
		
		System.out.print("Enter the value of c :- ");
		
		//Taking c from the user
		c = input.nextInt();
	
		
		//Display the information
		System.out.print("The results of Int Operations are " + (a + b *c) + " , " +  (a * b + c) + ", and " + (c + a / b) + " and " +(a % b + c));
		
		//close the scanner input
		input.close();
		
	}
	
}