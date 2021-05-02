package np.edu.deerwalk;

import java.util.*;

abstract class User {
	Scanner strScanner = new Scanner(System.in);

	protected String name;

	public String getName() {
		return name;
	}

	public void setData() {
		System.out.print("Enter your name : ");
		String nm = strScanner.next();
		this.name = nm;
		
	}
	
	abstract void getData();
	
}
