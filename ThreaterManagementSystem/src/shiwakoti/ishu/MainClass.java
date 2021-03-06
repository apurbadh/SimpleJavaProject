package shiwakoti.ishu;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner intScanner = new Scanner(System.in);
		Scanner strScanner = new Scanner(System.in);
		String user;
		int admininp, usrinp, movchoice;
		NormalMovie normalMovie;
		SpecialMovie specialMovie;
		List<NormalMovie> listNormal = new ArrayList<NormalMovie>();
		List<SpecialMovie> listSpecial = new ArrayList<SpecialMovie>();
		do {
			System.out.println("Type exit to exit");
			System.out.print("Enter your name : ");
			user = strScanner.next();
		
			if (user.equals("admin")) {
				do {
				System.out.println("1. Add a normal movie");
				System.out.println("2. Add a special movie");
				System.out.println("3. Exit");
				
				System.out.print("Enter the number : ");
				admininp = intScanner.nextInt();
				
				switch (admininp) {
				case 1:
					normalMovie = new NormalMovie();
					normalMovie.setData();
					listNormal.add(normalMovie);
					break;
				case 2:
					specialMovie = new SpecialMovie();
					specialMovie.setData();
					listSpecial.add(specialMovie);
					break;
				case 3:
					break;
					
				default:
					System.out.println("Not Found");
				}
				
				
				}while(admininp != 3);
				
			}else if (!user.equals("exit")) {
				do {
					System.out.println("1. Buy a ticket for normal movie");
					System.out.println("2. Buy a ticket for special movie");
					System.out.println("3. Exit");
					
					System.out.print("Enter the number : ");
					usrinp = intScanner.nextInt();
					
					switch (usrinp) {
					case 1:
						int i = 1;
						for (NormalMovie nMovie : listNormal) {
							System.out.print(i + ". ");
							nMovie.showData();
							System.out.print("Enter the number : ");
							movchoice = intScanner.nextInt();
							
							try {
								listNormal.get(movchoice - 1).byOne();
								System.out.println("Thanks for purchasing");
							} catch (Exception e) {
								System.out.println("Not found");
							}
							i++;
	
						}
						break;
					case 2:
						int j = 1;
						for (SpecialMovie nMovie : listSpecial) {
							System.out.print(j);
							nMovie.showData();
							System.out.print("Enter the number : ");
							movchoice = intScanner.nextInt();

							try {
								listSpecial.get(movchoice - 1).byOne();
								System.out.println("Thanks for purchasing");
							} catch (Exception e) {
								System.out.println("Not found");
							}
							j++;	
						}
						break;
					case 3:
						break;
					default:
						System.out.println("Not Found");
					}
					
				}while(usrinp != 3);
			}
		
		}while(!user.equals("exit"));
		intScanner.close();
		strScanner.close();
		
	}
	

}
