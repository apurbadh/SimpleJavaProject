package np.edu.sifal.deerwalk;

import java.util.Scanner;

public class Coordinator extends Employee {
    private String faculty;

    @Override
    void setData()
    {
        super.setData();
        Scanner stringScanner = new Scanner(System.in);
        System.out.print("Enter your faculty: ");
        this.faculty = stringScanner.next();
        stringScanner.close();
    }
    
    @Override
    void getData()
    {
        super.getData();
        System.out.println("Faculty : " + faculty);
        
    }
}