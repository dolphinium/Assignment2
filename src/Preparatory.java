public class Preparatory extends Student {
    int levelOfEnglish;

    public Preparatory(String name, double GPA, int levelOfEnglish) {
        super.name = name;
        super.GPA = GPA;
        this.levelOfEnglish = levelOfEnglish;
    }

    @Override
    public double calculateAchievement() {
        return this.levelOfEnglish * 10 * super.GPA;
    }
}
