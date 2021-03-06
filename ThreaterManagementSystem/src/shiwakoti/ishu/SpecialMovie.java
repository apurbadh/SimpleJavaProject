package shiwakoti.ishu;

public class SpecialMovie extends Movie{
	
	private String type;
	
	public SpecialMovie() {
		
		super.seat = 16;
	}
	
	public SpecialMovie(String name, int price, String type) {
		super.name = name;
		super.price = price;
		this.type = type;
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	void setData() {
		super.setData();
		System.out.print("Special Type : ");
		this.type = super.strScanner.next();
	}
	
	@Override
	void showData() {
		super.showData();
		System.out.println("Special Type : " + this.type);
	}
	

}
