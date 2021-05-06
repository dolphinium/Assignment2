public class Graduate extends Student {
    int numberOfPaper;

    public Graduate(String name, double GPA, int numberOfPaper) {
        super.name = name;
        super.GPA = GPA;
        this.numberOfPaper = numberOfPaper;
    }

    @Override
    public double calculateAchievement() {
        return this.numberOfPaper * 30 + super.GPA * 20;
    }
}
