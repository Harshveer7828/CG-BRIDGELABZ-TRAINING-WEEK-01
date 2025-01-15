import java.util.Scanner;
public class FindTheShortestAndLongest{
	//Mehtod which spliutted amnd store the string into the array with the count of characters
	public static String[][] splitMethod(String text,int size){
		
		// String array which contains the splitted string
		String[][] resultant = new String[size][2];
		String str = "";
		int rowIndex = 0;
		int count = 0;
	
		// Traverse the text string and store the splitted text and character count
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) != ' '){
				str += text.charAt(i);
				count++;
			}else {
				resultant[rowIndex][0] = str;
				resultant[rowIndex++][1] = String.valueOf(count);
				count = 0;
				str = "";
			}
		}
		
		// adds the last count and str which is skipped
		resultant[rowIndex][0] = str;
		resultant[rowIndex++][1] = String.valueOf(count);
		
		return resultant;
		
	}
	// Mehtod which display the string array
	public static void DisplayString(String[][] ans){
		for(int i = 0; i < ans.length; i++){
			System.out.println(ans[i][0] + " , "+ ans[i][1]);
		}
	}
	
	//Method which is used to count the digit of characters
	public static int CountStringWords(String text, int size){
		int count = 1;
		for(int i = 0; i < size; i++){
			//Skip the sppace character
			if(text.charAt(i) == ' '){
				count++;
			}
		}
		return count;
	}
	
	public static int countLength(String text){
		int count = 0;
		for(char ch : text.toCharArray()){
			count++;
		}
		return count;
	}
	
	// Mehtod which finds the shortest and longest string 
	public static int[] findLongestAndShortest(String[][] resultantArray){
		int[] lengthArray = new int[2];
		lengthArray[1] = Integer.valueOf(resultantArray[0][1]);
		for(int i = 0; i < resultantArray.length; i++){
			if(Integer.valueOf(resultantArray[i][1]) > lengthArray[0]){
				lengthArray[0] = Integer.valueOf(resultantArray[i][1]);
			}
			else if(Integer.valueOf(resultantArray[i][1]) < lengthArray[1]) lengthArray[1] = Integer.valueOf(resultantArray[i][1]);
		}
		return lengthArray;
	}
	
	public static void main(String[] args){
	
		//create an instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//Taking user input 
		System.out.println("Enter the string :- ");
		String userInput = input.nextLine().trim();
		// Return the words count in the string and store in the variable
		int wordsLength = CountStringWords(userInput,countLength(userInput));
		// result vaiable store the result array after splitted and counted words are inserted
		String[][] result = splitMethod(userInput,wordsLength);
		
		//Display the result array
		DisplayString(result);
		
		//Diplaying the shortest and  the longest string in the array
		int[] shortestAndLongest = findLongestAndShortest(result);
		
		System.out.println("Longest string of length "+ shortestAndLongest[0] + " and shortest length string "+ shortestAndLongest[1]);
		//close scanner
		input.close();
	}
}