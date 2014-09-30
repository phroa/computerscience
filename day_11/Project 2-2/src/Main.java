// Jack & Sam

public class Main {

    public static void main(String[] args) {
        line();

        for (int i = 1; i <= 2; i++) {
            System.out.println("|  ^" + "^  |");
            System.out.println("| ^ " + " ^ |");
            System.out.println("|^  " + "  ^|");
        }


        line();

        for (int i = 1; i <= 2; i++) {
            System.out.println("|v    v|");
            System.out.println("| v  v |");
            System.out.println("|  vv  |");
        }

        line();

    }

    static void line() {
        System.out.println("+------+");
    }

}
