package np.edu.deerwalk;

import java.util.Scanner;

class Planes {
	
	Scanner intScanner = new Scanner(System.in);
	Scanner strScanner = new Scanner(System.in);
	
	protected int number_of_normal_seats;
	protected int number_of_special_seats;
	protected int price_normal;
	protected int price_special;
	
	protected String name;
	protected String flight_time;
	protected String destination;
	
	void showData() {
		System.out.println("Name of the flight : " + name);
		System.out.println("Number of seats left : " + number_of_normal_seats);
		System.out.println("Number of special seats left : " + number_of_special_seats);
		System.out.println("Departure time : " + flight_time);
		System.out.println("Destination : " + destination);
		System.out.println("Price of Normal seat : " + price_normal);
		System.out.println("Price of Special seat : " + price_special);
		
	}
	

	void setData() {
		System.out.print("Enter the name : ");
		name = strScanner.nextLine();
		System.out.print("Enter the number of normal seats : ");
		number_of_normal_seats = intScanner.nextInt();
		System.out.print("Enter the number of special seats : ");
		number_of_special_seats = intScanner.nextInt();
		System.out.print("Enter the price for normal seat : ");
		price_normal = intScanner.nextInt();
		System.out.print("Enter the price for special seat : ");
		price_special = intScanner.nextInt();
		System.out.print("Enter the destination : ");
		destination = strScanner.nextLine();
		System.out.print("Enter the departure time : ");
		flight_time = strScanner.nextLine();
	}
	
	void normalByOne() {
		number_of_normal_seats--;
	}
	
	void specialByOne() {
		number_of_special_seats--;
	}
	
	public String getFlightTime() {
		return flight_time;
	}
	

}
