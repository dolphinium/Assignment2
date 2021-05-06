public class Erasmus extends Student {
    String country;

    public Erasmus(String name, double GPA, String country) {
        super.name = name;
        super.GPA = GPA;
        this.country = country;
    }

    @Override
    public double calculateAchievement() {
        return 0;
    }
}
