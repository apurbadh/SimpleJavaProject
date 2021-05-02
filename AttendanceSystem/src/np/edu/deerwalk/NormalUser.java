package np.edu.deerwalk;

public class NormalUser extends User{
	private int roll_no;
	private boolean attendance;
	
	public NormalUser() {
		
	}
	
	public NormalUser(String name, int roll_no) {
		super.name = name;
		this.roll_no = roll_no;
	}
	
	public int getRollNo() {
		return this.roll_no;
	} 
	
	@Override
	public void setData() {
		super.setData();
		System.out.print("Enter your roll number : ");
		int rl = Integer.parseInt(super.strScanner.next());
		
		this.roll_no = rl;
	}
	
	void getData() {
		System.out.println("Name : " + super.name );
		System.out.println("Roll no : " + this.roll_no);
		System.out.println("Present : " + this.attendance);
	}

	public boolean getAttendance() {
		return attendance;
	}

	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}
	
}
