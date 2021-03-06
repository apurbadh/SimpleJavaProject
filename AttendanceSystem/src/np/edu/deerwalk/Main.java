package np.edu.deerwalk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List<NormalUser> list = new ArrayList<NormalUser>();
		Scanner intScanner = new Scanner(System.in);
		Scanner strScanner = new Scanner(System.in);
		int type;
		do {
		System.out.println("Are you a admin or user ? ");
		System.out.println("1. User");
		System.out.println("2. Admin");
		System.out.println("3. Exit");
		
		
		System.out.print(">> ");
		type = intScanner.nextInt();
		
		if (type == 1) 
		{
			NormalUser user = new NormalUser();
			user.setData();
			do {
				System.out.println("1. Present");
				System.out.println("2. Absent");
				System.out.println("3. About you");
				System.out.println("4. Exit");
				
				System.out.print(">> ");
				type = intScanner.nextInt();
				
				switch (type) {
				case 1:
					user.setAttendance(true);
					break;
				case 2:
					user.setAttendance(false);
					break;
				case 3:
					user.getData();
					break;
				case 4:
					break;
				default:
					System.out.println("Not found");
					break; 
						
				}
				
			}while(type != 4);
			list.add(user);
		}else if (type == 2)
		{
			Admin user = new Admin();
			user.setData();
			
			if (!user.getPassword().equals("admin") && !user.getName().equals("admin")) {
				System.out.println("Wrong Credentials");
			}else {
				do {
				System.out.println("1. See all records");
				System.out.println("2. Exit");
				
				System.out.print(">> ");
				type = intScanner.nextInt();
				switch (type) {
				
				case 1:
					user.getData(list);
					break;
				case 2:
					break;
				default:
					System.out.println("Not found");
				}
				}while(type != 2);
			}
		}
		}while (type != 3);
		intScanner.close();
		strScanner.close();
		
		
		
		
	}

}
