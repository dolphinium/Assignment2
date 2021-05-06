public class Academic extends Personal {
    int numberOfPaper;
    int numberOfSymposium;

    public Academic(String name, int birthYear, String department, int numberOfPaper, int numberOfSymposium) {
        super.name = name;
        super.birthYear = birthYear;
        super.department = department;
        this.numberOfPaper = numberOfPaper;
        this.numberOfSymposium = numberOfSymposium;
    }

    @Override
    public double calculateAchievement() {
        return ((3 * this.numberOfPaper) + (2 * this.numberOfSymposium)) / (2021 - super.birthYear);
    }
}
