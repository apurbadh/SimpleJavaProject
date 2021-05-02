package shiwakoti.ishu;

public class NormalMovie extends Movie{
	
	private int discount;
	
	public NormalMovie() {
		super.seat = 48;
		
	}
	
	public NormalMovie(String name, int price, int disount) {
		super.name = name;
		super.price = price;
		this.discount = disount;
		
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	@Override
	void setData() {
		super.setData();
		System.out.print("Enter the discount amount : ");
		this.discount = super.numScanner.nextInt();
	}

}
