public class DistributePens{
	public static void main(String[] args){
		//Creating a variable containing the number of pens
		int noOfPens = 14;

		// Creating a variable containing the number of students in which pens are distributed
		int noOfStudents = 3;

		// Calculating the pens per student is distributed
		int pensPerStudent = 14/3;

		//Calculating the remaining pens after distribution
		int remainingPens = 14%3;

		//Display the pens per student have and remaining pens after distribution
		System.out.print("The Pen Per Student is " + pensPerStudent +" and the remaining pen not distributed is "+remainingPens);
	

	}
	
}