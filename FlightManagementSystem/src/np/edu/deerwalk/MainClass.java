package np.edu.deerwalk;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		List<NationalPlane> nationalPlanes = new ArrayList<>();
		List<InternationalPlane> internationalPlanes = new ArrayList<>();
		
		NationalPlane nationalPlane = null;
		InternationalPlane internationalPlane = null;
		
		Scanner intScanner = new Scanner(System.in);
		Scanner strScanner = new Scanner(System.in);
		
		String name = null;
		int adminChoice = 0;
		int usrChoice = 0;
		int choice;
		int anochoice;
		
		do {
			System.out.println("Enter exit to exit");
			System.out.print("Enter your name : ");
			name = strScanner.nextLine();
			
			if (name.equals("admin")) {
				do {
					System.out.println("1. Add a national plane");
					System.out.println("2. Add a internationap plane");
					System.out.println("3. Exit");
					System.out.print("Enter your choice number : ");
					adminChoice = intScanner.nextInt();
					
					switch (adminChoice) {
					case 1:
						nationalPlane = new NationalPlane();
						nationalPlane.setData();
						nationalPlanes.add(nationalPlane);
						break;
					case 2:
						internationalPlane = new InternationalPlane();
						internationalPlane.setData();
						internationalPlanes.add(internationalPlane);
						break;
					case 3:
						break;
					default:
						System.out.println("Choice not found!");
						break;
							
					}
						
				}while(adminChoice != 3);
				
			}else if (!name.equals("exit")) {
				do {
					System.out.println("1. Buy a ticket for National Plane");
					System.out.println("2. Buy a ticket for International Plane");
					System.out.println("3. Exit");
					System.out.print("Enter your choice number : ");
					usrChoice = intScanner.nextInt();
					
					switch (usrChoice) {
					case 1:
						for (int i = 0; i < nationalPlanes.size(); i++) {
							System.out.print(i + ". ");
							nationalPlanes.get(i).showData();
						}
						System.out.print("Enter your choice number : ");
						choice = intScanner.nextInt();
						try {
							nationalPlane = nationalPlanes.get(choice);
							System.out.print("Do you want normal or special(1 - Normal/2 - Special) : ");
							anochoice = intScanner.nextInt();
							if (anochoice == 1) {
								nationalPlane.normalByOne();
							}else if(anochoice == 2) {
								nationalPlane.specialByOne();
							}else {
								System.out.println("Choice not Found!");
							}
							
						}catch (Exception e) {
							System.out.println("Choice not found!");
						}
						System.out.println("Thanks for purchasing");
						System.out.println("Your flight will leave in " + nationalPlane.getFlightTime());
						break;
					case 2:
						for (int i = 0; i < internationalPlanes.size(); i++) {
							System.out.print(i + ". ");
							internationalPlanes.get(i).showData();
						}
						System.out.print("Enter your choice number : ");
						choice = intScanner.nextInt();
						try {
							internationalPlane = internationalPlanes.get(choice);
							System.out.print("Do you want normal or special(1 - Normal/2 - Special) : ");
							anochoice = intScanner.nextInt();
							if (anochoice == 1) {
								internationalPlane.normalByOne();
							}else if(anochoice == 2) {
								internationalPlane.specialByOne();
							}else {
								System.out.println("Choice not Found!");
							}
							
						}catch (Exception e) {
							System.out.println("Choice not found!");
						}
						System.out.println("Thanks for purchasing");
						System.out.println("Your flight will leave in " + internationalPlane.getFlightTime());
						break;
					case 3:
						break;
					default:
						System.out.println("Choice not found!");
					}
				}while(usrChoice != 3);
			}
			
		}while(!name.equals("exit"));
		
		intScanner.close();
		strScanner.close();
		
		

	}

}
