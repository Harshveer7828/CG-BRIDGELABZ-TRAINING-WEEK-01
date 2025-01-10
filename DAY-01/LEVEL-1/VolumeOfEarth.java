public class VolumeOfEarth{
	public static void main(String[] args){
		// Creating the variable containing radius of earth
		int radiusOfEarthInKm =  6378;
		
		// Calculating volume in kilometer^3
		double volumeInKm = (4*3.14*radiusOfEarthInKm*radiusOfEarthInKm*radiusOfEarthInKm) / 3;
		
		//Converting earth km distance into miles
		double kilometerToMiles =0.621371;
		
		// Calculating volume in Miles^3
		double volumeInMiles = volumeInKm * Math.pow(kilometerToMiles,3);


		// Display the distance in miles
		System.out.print("The volume of earth in cubic kilometers is " + volumeInKm +"and cubic mile is "+ volumeInMiles);
		input.close();
	}
	
}