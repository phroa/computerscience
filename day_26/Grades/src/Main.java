import java.util.*;

public class Main {

    static final double HOMEWORK_WEIGHT = .5;
    static final double MIDTERM_WEIGHT = .1;
    static final double FINAL_WEIGHT = .4;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<Double, Double> homeworkGrades = promptForHomeworkGrades(in);

        double earned = 0, max = 0;
        for (Map.Entry<Double, Double> e : homeworkGrades.entrySet()) {
            earned += e.getKey();
            max += e.getValue();
        }

        double homeworkPercent = earned / max * 100;

        System.out.printf("You got %.2f points out of a possible %.2f on your homework. That's %.2f%%, which is a(n) %s.",
                earned, max, homeworkPercent, findGrade(homeworkPercent));
        System.out.println();
        System.out.println();

        double weightedHomework = homeworkPercent * HOMEWORK_WEIGHT;

        double midtermGrade = midterm(in);

        double weightedMidterm = midtermGrade * MIDTERM_WEIGHT;

        System.out.printf("You got %.2f%% on your midterm, which is a(n) %s.", midtermGrade, findGrade(midtermGrade));
        System.out.println();

        double finalExamGrade = finalexam(in);

        double weightedFinalExam = finalExamGrade * FINAL_WEIGHT;

        System.out.printf("You got %.2f%% on your final, which is a(n) %s.", finalExamGrade, findGrade(finalExamGrade));
        System.out.println();

        double average = weightedHomework + weightedMidterm + weightedFinalExam;

        System.out.println("- - - - - - - - - -");

        System.out.printf("You got %.2f%% in total. That's a(n) %s", average, findGrade(average));
        System.out.println();
    }

    public static char findGrade(double average) {
        if (average >= 90) {
            return 'A';
        }
        if (average >= 80) {
            return 'B';
        }
        if (average >= 70) {
            return 'C';
        }
        if (average >= 60) {
            return 'D';
        }
        return 'F';
    }

    public static Map<Double, Double> promptForHomeworkGrades(Scanner in) {

        System.out.print("How many homework assignments were there? ");
        int homeworkAssignments = in.nextInt();

        Map<Double, Double> tempList = new HashMap<Double, Double>();

        for (int i = 1; i <= homeworkAssignments; i++) {
            System.out.println("What did you get on assignment " + i + "?");
            System.out.print("> ");
            double score = in.nextDouble();
            System.out.println("Out of how many points?");
            System.out.print("> ");
            double outOf = in.nextDouble();

            if (score > outOf)
                throw new IllegalArgumentException("You can't get more points than the maximum! (" + score + "/" + outOf + ")");

            tempList.put(score, outOf);

            System.out.println();
        }

        return tempList;
    }

    public static double midterm(Scanner in) {
        System.out.println("What was your score on the midterm exam?");
        System.out.print("> ");
        double score = in.nextDouble();

        System.out.println("How many points was it out of?");
        System.out.print("> ");
        double outof = in.nextDouble();

        return score / outof * 100;
    }

    public static double finalexam(Scanner in) {
        System.out.println("What was your score on the final exam?");
        System.out.print("> ");
        double score = in.nextDouble();

        System.out.println("How many points was it out of?");
        System.out.print("> ");
        double outof = in.nextDouble();
        return score / outof * 100;
    }
}