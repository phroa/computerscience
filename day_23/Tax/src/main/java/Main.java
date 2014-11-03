import java.util.Scanner;

/**
 * Created by js on 10/30/14.
 */
public class Main {
    public static void main(String[] args) {
        //e(10);

        //grades();
        Scanner in = new Scanner(System.in);

        boolean tax = isThereSalesTax(in);
        double price = price(in);
        double total = total(price, tax);

        System.out.printf("Your total is $%.2f%s", total, (!tax ? ", congrats. No tax. Now move to Washington, ya hippie." : ""));

    }

    private static double total(double price, boolean tax) {
        return tax ? 1.08 * price : price;
    }

    private static double price(Scanner in) {
        System.out.print("Okay, and what did you pay? ");

        return in.nextDouble();
    }

    private static boolean isThereSalesTax(Scanner in) {
        System.out.print("What state are you in? ");
        String state = in.nextLine();

        return !state.matches("(?i)^or.*");
    }

//    static void grades() {
//        Scanner c = new Scanner(System.in);
//
//        System.out.print("So what score did you get on that last test? ");
//        double s = c.nextDouble();
//
//        System.out.println("Well, you got " + (findGrade(s) == 'A' ? "an A" : "a " + findGrade(s)));
//
//    }
//
//    private static char findGrade(double score) {
//        if (score >= 90) return 'A';
//        else if (score >= 80) return 'B';
//        else if (score >= 70) return 'C';
//        else return score > 60 ? 'D' : 'F';
//    }
//
//    private static void e(int x) {
//        for (int i=-x;i<=x;i++) {
//            if (i == 1) System.out.println(i + " is equal to 1");
//            else if (i > 1) System.out.println(i + " is greater than 1");
//            else System.out.println(i + " is less than 1");
//        }
//    }
}
