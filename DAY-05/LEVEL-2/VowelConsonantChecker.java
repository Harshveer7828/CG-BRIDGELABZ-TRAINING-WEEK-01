import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char c) {
        // Convert character to lowercase
        char lowerChar = Character.toLowerCase(c);

        // Check if the character is a vowel
        if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (lowerChar >= 'a' && lowerChar <= 'z') {
            return "Consonant";
        }
        // If it's neither, it's not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string
    public static String[][] findVowelsAndConsonants(String input) {
        String[][] result = new String[input.length()][2];

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            result[i][0] = String.valueOf(currentChar); // Store the character
            result[i][1] = checkCharacterType(currentChar); // Store the character type
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] data) {
        for (String[] row : data) {
            System.out.println(row[0]+" "+ row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Call the method to find vowels and consonants
        String[][] result = findVowelsAndConsonants(userInput);

        // Display the result
        displayResult(result);

        input.close();
    }
}
