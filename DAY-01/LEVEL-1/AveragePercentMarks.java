public class AveragePercentMarks{
	public static void main(String[] args){
		// Creating a variable for containing math marks
		int mathMarks = 94;
		// Creating a variable for containing physics marks
		int physicsMarks = 95;
		// Creating a variable for containing chemistry marks
		int chemistryMarks = 96;
		// Calculating total marks
		int totalMarks = mathMarks + physicsMarks + chemistryMarks;
		// Calculating the average marks in PCM
		int averageMarks = totalMarks / 3;
		// Display the average marks		
		System.out.print(" Sam’s average mark in PCM is "+ averageMarks );
	}
	
}