import java.util.Scanner;
	 
	public class House {
	   public static void main(String args[])
	   {
	      int id;
	      float price;
	      String location;
	      String advertiser;
	     
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter ID");
	      id = in.nextInt();
	      System.out.println("THIS IS YOUR ID" + id);
	     
	      System.out.println("Enter The price");
	      price = in.nextFloat();
	      System.out.println("THIS IS YOUR PRICE " + price);  
	   
	      System.out.println("Enter your Advertiser");
	      advertiser = in.nextLine();
	      System.out.println("This is your advertiser " + advertiser);
	      
	      System.out.println("Enter your location");
	      location = in.nextLine();
	      System.out.println("This is your location " + location);
	   
	   
	   }

	@Override
	public String toString() {
		return "House []";
	}
	}

