import java.util.Scanner;

public class CompareStrings{
	//method to compare two string and return boolean value
	public static boolean isEqual(String text1,String text2){
		if(text1.length() != text2.length()) return false;
		for(int i = 0; i < text1.length(); i++){
			if(text1.charAt(i) != text2.charAt(i)) return false;
		}
		
		return true;
	}

	public static void main(String[] args){
		// crate an scanner object
		Scanner input = new Scanner(System.in);
		
		// Get the user input string
		System.out.print("Enter the first String:- ");
		String text1 = input.next();
		
		System.out.print("Enter the second String :- ");
		String text2 = input.next();
		
		
		// Calls the isEqual method to compute the result
		boolean equalOrNot = isEqual(text1,text2);
		
		
		
		// checks with the build inmethod compare
		boolean equalOrNotUsingBuildInMehtod = text1.equals(text2);
		
		if(equalOrNot && equalOrNotUsingBuildInMehtod) System.out.print("Both Strings are equal");
		else System.out.println("Both strings are not equal");
		
	}
}