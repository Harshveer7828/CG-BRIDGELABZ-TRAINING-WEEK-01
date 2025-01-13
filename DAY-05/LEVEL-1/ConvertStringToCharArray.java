import java.util.Scanner;

public class ConvertStringToCharArray{
	//method to convert a string into char array
	public static char[] ConvertStringToArray(String text){
		char[] resultArray = new char[text.length()]; 
		for (int i = 0; i < text.length(); i++){
			resultArray[i] = text.charAt(i);
		}
		return resultArray;
	}
	public static boolean printResult(char[] user, char[] builtIn){
		// if the length is not same then it return false
		if(user.length != builtIn.length) return false;
		
		//iterate over the loop and checks the array
		for(int i = 0; i < user.length; i++){
			if(user[i] != builtIn[i]) return false;
		}
		
		return true;
		
	}

	public static void main(String[] args){
		// crate an scanner object
		Scanner input = new Scanner(System.in);
		
		// Get the user input string
		System.out.print("Enter the String:- ");
		String text = input.next();
		
		
		
		// Compute the substring using CreateSubstring method
		char[] charArrayFromUserMethod = ConvertStringToArray(text);
		
		// create using built in method
		char[] charArrayFromBuiltInMethod = text.toCharArray();	

		if(printResult(charArrayFromBuiltInMethod,charArrayFromUserMethod)) System.out.print("Both the arrays are equal");
		else System.out.print("Both the arrays are not equals");
		
		//closing the input scanner
		input.close();
		
	}
}