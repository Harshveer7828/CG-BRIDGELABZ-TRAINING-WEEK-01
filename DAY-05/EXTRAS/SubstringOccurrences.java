import java.util.Scanner;
import java.util.Arrays;
public class SubstringOccurrences{

	//Method which counts occurence of the substring
	public static int countSubstring(String text, String subStringValue){
		int j = 0;
		int count = 0;
		for(int i = 0; i < text.length(); i++){
			if(j < subStringValue.length()- 1 && text.charAt(i) == subStringValue.charAt(i)) {
				j++;
			}else if(j >= subStringValue.length()) {
				j = 0;
				i--;
				count++;
			}
		}
		
		return count;
	}
	
	
	
	public static void main(String[] args){
	
		// Declaring scanner object
		Scanner input = new Scanner(System.in);
		
		// Get user input string
		System.out.println("Enter the string : ");
		String text = input.next();
		
		System.out.println("Enter the substring string : ");
		String subString = input.next();
		int ans = countSubstring(text,subString);
		
		System.out.println(ans);
		
		input.close();
		
	}
}