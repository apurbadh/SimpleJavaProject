package np.edu.deerwalk;

import java.util.List;

public class Admin extends User{
	
	protected String password;
	
	public Admin() {
		
	}
	
	public Admin(String name, String password) {
		this.password = password;
		super.name = name;
	}
	
	@Override
	public void setData() {
		super.setData();
		System.out.print("Enter your password : ");
		this.password = super.strScanner.next();
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	void getData(List<NormalUser> user) {
		for (NormalUser usr : user) {
			usr.getData();
		}
		
	}

	void getData() {
		
	}
	

}
