public class LectureProcessor {
    public static void doIt(Lecturable a) {
        if(a.isQualified())
            System.out.println("can lecture...");
        else
            System.out.println("cannot lecture");
    }
}
