package np.edu.sifal.newPolymorphism;

public class NilkanthaStudent extends Student {

    public String checkPracticeSession() {
        if (this.age < 11)
        {
            return "Practice Session starts at 8 am";
        }
        else if (this.age < 15)
        {
            return "Practice Session starts at 7 am";
        }
        else
        {
            return "Practice Session starts at 6 am";
        }
    }
}
