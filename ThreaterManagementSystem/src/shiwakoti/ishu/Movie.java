package shiwakoti.ishu;

import java.util.Scanner;

class Movie {
	
	Scanner strScanner = new Scanner(System.in);
	Scanner numScanner = new Scanner(System.in);
		
	protected String name;
	protected int price;
	int seat;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	void byOne() {
		this.seat--;
	}
	void setData() {
		System.out.print("Enter the movie name : ");
		this.name = strScanner.next();
		System.out.print("Enter the price : ");
		this.price = numScanner.nextInt();
	}

	void showData() {
		System.out.println("Name : " + this.name);
		System.out.println("Price : " + this.price);
		System.out.println("Seats Left : " + this.seat);
	}
	

}
