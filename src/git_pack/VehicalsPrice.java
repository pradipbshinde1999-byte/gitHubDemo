package git_pack;

public class VehicalsPrice {
	
	
	String car ="hyundai";
	
	String bike="yamaha";
	
	String flight="Emirates";
	
	int carValue=500000;
	
	int bikeValue=100000;
	
	int FlightValue=70000000;
	
	

	public void cars()
	{
		 System.out.println("vehical is car:-"+car+"+________"+"value of the car is:"+carValue);
	}
	
	

	public void bikes()
	{
		 System.out.println("vehical is bikes:-"+bike+"+________"+"value of the bike is:"+bikeValue);
	}
	

	public void flights()
	{
		 System.out.println("vehical is flight:-"+flight+"+________"+"value of the car is:"+FlightValue);
	}
	
	
	public static void main(String[] args) 
	{
		
		VehicalsPrice carPrice=new VehicalsPrice();
		carPrice.cars();
		carPrice.bikes();
		carPrice.flights();
		
	}
	

}
