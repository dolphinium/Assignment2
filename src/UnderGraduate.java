public class UnderGraduate extends Student {
    double credit;

    public UnderGraduate(String name, double GPA, double credit) {
        super.name = name;
        super.GPA = GPA;
        this.credit = credit;
    }

    @Override
    public double calculateAchievement() {
        return 50 * this.credit * super.GPA;
    }
}
