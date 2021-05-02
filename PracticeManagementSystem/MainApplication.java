package np.edu.sifal.newPolymorphism;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static Scanner stringScanner;
    public static Scanner numberScanner;
    public static List<DeerwalkSifalStudent> deerwalkSifalStudentList = new ArrayList<>();
    public static List<NilkanthaStudent> nilkanthaStudentList = new ArrayList<>();
    public static List<KinsStudent> kinsStudentsList = new ArrayList<>();

    public static void main(String[] args) {

        stringScanner = new Scanner(System.in);
        numberScanner = new Scanner(System.in);
        DeerwalkSifalStudent deerwalkSifalStudent = null;
        NilkanthaStudent nilkanthaStudent = null;
        KinsStudent kinsStudent = null;

        int option = 0;
        String choice = "no";

        do {
            System.out.println("*************************************************");
            System.out.println("SELECT OPTIONS:");
            System.out.println("1 For Viewing All Students:");
            System.out.println("2 For Viewing Sifal Students:");
            System.out.println("3 For Viewing KINS Students:");
            System.out.println("4 For Viewing Nilkantha Students:");
            System.out.println("5 For Adding Sifal Students and viewing its practice session:");
            System.out.println("6 For Adding Nilkantha Students and viewing its practice session:");
            System.out.println("7 For Adding KINS Students and viewing its practice session:");
            System.out.println("*************************************************");

            option = numberScanner.nextInt();

            switch (option)
            {
                case 1:
                    displayStudents();
                    break;
                case 2:
                    displaySifalStudents();
                    break;
                case 3:
                    displayKINSStudents();
                    break;
                case 4:
                    displayNilkanthaStudents();
                    break;
                case 5:
                    deerwalkSifalStudent = new DeerwalkSifalStudent();
                    getUserStudentInput(deerwalkSifalStudent);
                    viewPracticeSession(deerwalkSifalStudent);
                    deerwalkSifalStudentList.add(deerwalkSifalStudent);
                    break;
                case 6:
                    nilkanthaStudent = new NilkanthaStudent();
                    getUserStudentInput(nilkanthaStudent);
                    viewPracticeSession(nilkanthaStudent);
                    nilkanthaStudentList.add(nilkanthaStudent);
                    break;
                case 7:
                    kinsStudent = new KinsStudent();
                    getUserStudentInput(kinsStudent);
                    viewPracticeSession(kinsStudent);
                    kinsStudentsList.add(kinsStudent);
                    break;
                default:
                    System.out.println("Invalid option!!");
            }
            System.out.print("Do you want to exit the program: (Yes/No): ");
            choice = stringScanner.nextLine().toLowerCase();

        }while (!choice.equals("yes"));
    }

    public static void getUserStudentInput(Student student) {
        System.out.print("Enter Id: ");
        int id = numberScanner.nextInt();
        System.out.print("Enter age: ");
        int age = numberScanner.nextInt();
        System.out.print("Enter Full Name: ");
        String fullName = stringScanner.nextLine();

        student.setId(id);
        student.setAge(age);
        student.setFullName(fullName);
    }

    public static void viewPracticeSession(Student student)
    {
        System.out.println(student.checkPracticeSession());
    }

    public static void displayStudents()
    {
        displaySifalStudents();
        displayNilkanthaStudents();
        displayKINSStudents();

    }
    public static void displaySifalStudents()
    {
        if (deerwalkSifalStudentList.size() > 0)
        {
            System.out.println("Deerwalk Sifal Students:");
            for (Student student : deerwalkSifalStudentList) {
                student.displayInfo();
            }
        }
        else
        {
            System.out.println("No Sifal student in the list");
        }

    }
    public static void displayNilkanthaStudents()
    {
        if (nilkanthaStudentList.size() > 0)
        {
            System.out.println("Nilkantha Students:");
            for (Student student : nilkanthaStudentList) {
                student.displayInfo();
            }
        }
        else
        {
            System.out.println("No Nilkantha student in list");
        }

    }
    public static void displayKINSStudents()
    {
        if (kinsStudentsList.size() > 0)
        {
            System.out.println("KINS Students:");
            for (Student student : kinsStudentsList) {
                student.displayInfo();
            }
        }
        else
        {
            System.out.println("No KINS student in list");
        }

    }
}
