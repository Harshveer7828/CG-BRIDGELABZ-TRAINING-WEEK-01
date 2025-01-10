public class CalculateProfitAndLoss{
	public static void main(String[] args){
		// Creating a variable containing the costPrice
		int costPrice = 129;
		// Creating a variable containing the selling price
		int sellingPrice = 191;
		//Calculating the profit
		int profit = sellingPrice - costPrice;
		//Calculating the profit percentage 
		float profitPercentage = (profit * 100 )/ costPrice ;
		//Display the profit and profit percentage 
		System.out.print("The Cost Price is INR "+  costPrice + "and Selling Price is INR " +  sellingPrice +"\nThe Profit is INR "+ profit + " and the Profit Percentage is "+profitPercentage);
	}
	
} 