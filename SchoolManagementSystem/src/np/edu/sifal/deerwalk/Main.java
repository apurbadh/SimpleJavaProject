package np.edu.sifal.deerwalk;

import java.util.Calendar;


public class Main {
    
    public static void main(String[] args) {
        
        Coordinator coordinator = new Coordinator();
        Lecturer lecturer = new Lecturer();

        System.out.println("Coordinator details : ");
        coordinator.setData();
        coordinator.getData();

        System.out.println("Lecturer details : ");
        lecturer.setData();
        lecturer.getData();
        System.out.println(Calendar.HOUR);

    }
}