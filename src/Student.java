public abstract class Student implements Lecturable {
    String name;
    double GPA;

    @Override
    public boolean isQualified() {
        return calculateAchievement() > 100;
    }
}
