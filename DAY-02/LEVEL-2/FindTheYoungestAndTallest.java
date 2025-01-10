import java.util.Scanner;

public class FindTheYoungestAndTallest {
    public static void main(String[] args) {
        // Declaring a variable to store the user's input
        int amarAge, akbarAge, anthonyAge, amarHeight, anthonyHeight, akbarHeight;

        // Declaring Scanner class instance
        Scanner input = new Scanner(System.in);

        // Get the amar age 
        System.out.print("Enter amar age: ");
        amarAge = input.nextInt();
		
		// Get the amar height 
        System.out.print("Enter amar height: ");
        amarHeight = input.nextInt();
		
		// Get the akbar age 
        System.out.print("Enter akbar age: ");
        akbarAge = input.nextInt();
		
		// Get the akbar age 
        System.out.print("Enter akbar height: ");
        akbarHeight = input.nextInt();
		
		// Get the anthonyAge age 
        System.out.print("Enter anthony age: ");
        anthonyAge = input.nextInt();
		
		// Get the anthony height 
        System.out.print("Enter anthony height: ");
        anthonyHeight = input.nextInt();
		
		//Computing the youngest person and diplay its name

        if((amarAge < akbarAge) && (amarAge < anthonyAge)) System.out.println("Amar is youngest person");
        else if((akbarAge < amarAge) && (akbarAge < anthonyAge)) System.out.println("Akbar is youngest person");
        else if((anthonyAge < amarAge) && (anthonyAge < akbarAge)) System.out.println("Anthony is youngest person");
		
		//Computing the tallest person and diplay its name

        if((amarHeight > akbarHeight) && (amarHeight > anthonyHeight)) System.out.println("Amar is tallest person");
        else if((akbarHeight > amarHeight) && (akbarHeight > anthonyHeight)) System.out.println("Akbar is tallest person");
        else if((anthonyHeight > amarHeight) && (anthonyHeight > akbarHeight)) System.out.println("Anthony is tallest person");

        // Closing the scanner
        input.close();
    }
}
