package np.edu.sifal.newPolymorphism;

public class KinsStudent extends Student{

    public String checkPracticeSession() {
        if (this.age < 9)
        {
            return "Practice Session starts at 6 pm";
        }
        else if (this.age < 14)
        {
            return "Practice Session starts at 5 pm";
        }
        else
        {
            return "Practice Session starts at 4 pm";
        }
    }
}
