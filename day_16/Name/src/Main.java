import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What's your name?");
        System.out.print("> ");
        String name = in.nextLine();

        System.out.println();
        System.out.println(name.split(" ")[1] + ", " + name.split(" ")[0]);

    }
}
