import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		//Declaring variables which contains height and base
		float height, base;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the height of the triangle :- ");
		
		//Taking height input from the user
		height = input.nextFloat();
		
		System.out.print("Enter the base of the triangle :- ");
		
		// Taking base from the user
		base = input.nextFloat();
		
		//Calculating the area of triangle
		float areaOfTriangle = (base * height)/2;
		
		//Area of triangle in inches
		double areaOfTriangleInInches = areaOfTriangle * 0.3937;
		
		//Display the area of the triangle
		System.out.print("Area of Triangle in sq centimeter:- " + areaOfTriangle + " area of triangle in sq inches:-" + areaOfTriangleInInches);
		
		//close the scanner input
		input.close();
		
	}
	
}