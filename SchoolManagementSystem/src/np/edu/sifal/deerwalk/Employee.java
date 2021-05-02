package np.edu.sifal.deerwalk;

import java.util.Scanner;

public class Employee {
    
    Scanner stringScanner = new Scanner(System.in);
    protected int id;
    protected String name;
    
    void setData()
    {
        System.out.print("Enter your name : ");
        this.name = stringScanner.next();
        System.out.print("Enter you ID : ");
        this.id = stringScanner.nextInt();

    }
    void getData()
    {
        System.out.println("Name : " + this.name);
        System.out.println("ID : " + this.id);
    }
    
}