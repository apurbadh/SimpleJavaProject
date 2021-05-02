package np.edu.sifal.deerwalk;

import java.util.Scanner;

public class Lecturer extends Employee {
    private String subject;

    @Override
    void setData() {
        Scanner stringScanner = new Scanner(System.in);
        super.setData();
        System.out.print("Enter your subject : ");
        this.subject = stringScanner.next();
        stringScanner.close();
    }

    @Override
    void getData() {
        super.getData();
        System.out.println("Subject : " + subject);
    }
}
