package np.edu.deerwalk;

public class InternationalPlane extends Planes{
	
	private int minimum_age;
	
	public InternationalPlane() {
		
	}
	
	public InternationalPlane(int minimum_age) {
		this.setMinimum_age(minimum_age);
	}

	public int getMinimum_age() {
		return minimum_age;
	}

	public void setMinimum_age(int minimum_age) {
		this.minimum_age = minimum_age;
	}


	
	@Override
	void showData() {
		super.showData();
		System.out.println("Minimum Age : " + minimum_age);
	}
	
	@Override
	void setData() {
		super.setData();
		System.out.print("Enter the minimum age : ");
		minimum_age = super.intScanner.nextInt();
		
	}
	

	
}
