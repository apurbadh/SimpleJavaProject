package np.edu.sifal.newPolymorphism;

public abstract class Student {
    protected int id;
    protected int age;
    protected String fullName;

    public Student()
    {
        this.id = 1;
        this.age = 1;
        this.fullName = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void displayInfo()
    {
        System.out.println("Person Detail");
        System.out.println("ID: " + this.id);
        System.out.println("Full Name: " + this.fullName);
        System.out.println("Age: " + this.age);
    }
    public abstract String checkPracticeSession();
}
