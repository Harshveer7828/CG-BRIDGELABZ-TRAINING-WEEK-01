public classDiscountedCollegeFee{
	public static void main(String[] args){
		// Creating a variable containing the student fee
		int studentFee = 125000;

		// Creating a variable containing discount percentage
		int discountPercent = 10;
			
		//Calculating the discount amount
		int discountAmount = (studentFee*10)/100;
		
		//Calculating the fee after discount
		int discountedFee = studentFee - discountAmount;

		//Display the profit and profit percentage 
		System.out.print("The discount amount is INR " + discountAmount +  " and final discounted fee is INR " + discountedFee);
	}
	
} 