import java.util.Scanner;

public class VoteEligibility{

    public static int[] ageOfStudents(int n){  //n = number of students
        int[] age = new int[n];
        for(int i = 0; i < n; i++){
            age[i] = (int)(Math.random() * 100 - 10); //Generating random age between 0 to 90
        }
        return age;
    }

    public static String[][] canVote(int[] age){

        String[][] result = new String[age.length][2];
        for(int i = 0; i < age.length; i++){
            if(age[i] < 0){
                result[i][0] = Integer.toString(age[i]);
                result[i][1] = "Invalid Age";
            }else if(age[i] >= 18){
                result[i][0] = Integer.toString(age[i]);
                result[i][1] = "Can Vote";
            }else{
                result[i][0] = Integer.toString(age[i]);
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }
    public static void displayResult (String[][] result){
        System.out.println("Age\tCan Vote");
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking user input for the number of students
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        //Saving the age of students in an array
        int [] age  = ageOfStudents(numberOfStudents) ;

        //Checking whether the student can vote or not
        String [][] result = canVote(age);

        //Calling the displayResult method to display the result
        displayResult(result);

        //Closing the scanner
        input.close();
    }
}