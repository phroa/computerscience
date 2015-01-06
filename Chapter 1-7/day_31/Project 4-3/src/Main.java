import java.util.Scanner;

/**
 * Created by js on 11/21/14.
 */
public class Main {

    // constants to refer to each person's scores by name
    static final int    GPA = 0;
    static final int    ACT = 1;
    static final int    SAT = 2;
    static final int BETTER = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // these hold the person's scores.
        double[] person1 = {0, 0, 0, 0};
        double[] person2 = {0, 0, 0, 0};

        // set the gpa to the prompted value
        person1[GPA] = prompt(in, "first", "GPA");
        // set act
        person1[ACT] = prompt(in, "first", "ACT score");
        // etc
        person1[SAT] = prompt(in, "first", "SAT score");

        System.out.println();

        // second person's scores
        person2[GPA] = prompt(in, "second", "GPA");
        person2[ACT] = prompt(in, "second", "ACT score");
        person2[SAT] = prompt(in, "second", "SAT score");

        // see who has higher scores in each way
        if (person1[GPA] > person2[GPA]) {
            // person 1's GPA is higher, so increase their "better" score
            person1[BETTER]++;
        }
        else if (person2[GPA] > person1[GPA]) {
            // person 2's is higher, so increase /their/ score
            person2[BETTER]++;
        }



        if (person1[ACT] > person2[ACT]) {
            person1[BETTER]++;
        }
        else if (person2[ACT] > person1[ACT]) {
            person2[BETTER]++;
        }

        if (person1[SAT] > person2[SAT]) {
            person1[BETTER]++;
        }
        else if (person2[SAT] > person1[SAT]) {
            person2[BETTER]++;
        }

        // the higher `better` score minus the lower `better` score is how many scores are higher than the other person's.
        // perhaps person 1 has better grades, but isn't so great at taking tests. person 2 will be "better" in two ways out of three.

        if (person1[BETTER] > person2[BETTER]) {
            System.out.println("Person 1 is more qualified in " + ((int) (person1[BETTER] - person2[BETTER])) + " way(s).");
        }
        else if (person2[BETTER] > person1[BETTER]) {
            System.out.println("Person 2 is more qualified in " + ((int) (person2[BETTER] - person1[BETTER])) + " way(s).");
        }
        else {
            // their BETTER scores are equal
            System.out.println("They are both equally qualified.");
        }

    }

    // prompts user for `person`'s `variable`
    static double prompt(Scanner in, String person, String variable) {
        System.out.print("What's the " + person + " person's " + variable + "? ");
        return in.nextDouble();
    }

}
