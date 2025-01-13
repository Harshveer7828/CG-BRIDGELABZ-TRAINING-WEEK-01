import java.util.Scanner;

public class SubStringCreate{
	//method to crate a substring from the string
	public static String CreateSubstring(String text, int startIndex, int lastIndex){
		String resultString = ""; 
		for (int i = startIndex; i < lastIndex; i++){
			resultString += text.charAt(i);
		}
		return resultString;
	}

	public static void main(String[] args){
		// crate an scanner object
		Scanner input = new Scanner(System.in);
		
		// Get the user input string
		System.out.print("Enter the String:- ");
		String text = input.next();
		
		// Get the index value for creating the substring
		System.out.print("Enter the first index:- ");
		int firstIndex = input.nextInt();
		System.out.print("Enter the last index:- ");
		int lastIndex = input.nextInt();
		
		// Compute the substring using CreateSubstring method
		String subStringFromUserMethod = CreateSubstring(text,firstIndex,lastIndex);
		
		// create using built in method
		String subStringFromBuiltInMethod = text.substring(firstIndex,lastIndex);	

		if(subStringFromBuiltInMethod.equals(subStringFromUserMethod)) System.out.print("Both Sub-Strings are equal " + subStringFromBuiltInMethod);
		else System.out.println("Both sub-strings are not equal ");
		
		//closing the input scanner
		input.close();
		
	}
}