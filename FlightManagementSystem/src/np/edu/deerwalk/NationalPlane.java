package np.edu.deerwalk;

public class NationalPlane extends Planes{
	private boolean passport_required;

	
	public boolean isPassport_required() {
		return passport_required;
	}

	public void setPassport_required(boolean passport_required) {
		this.passport_required = passport_required;
	
	}
	
	@Override
	void showData() {
		super.showData();
		System.out.println("Passport Required : " + passport_required);

	}
	
	@Override
	void setData() {
		super.setData();
		System.out.print("Is the passport required(y/n) : ");
		String yorn = super.strScanner.nextLine();
		passport_required = yorn.equals("y");
	}
}
