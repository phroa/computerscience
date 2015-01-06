import java.util.Scanner;

/**
 * Created by js on 10/6/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("So what's your name?\n> ");
        String name = console.next();
        System.out.print("\nokay we all knew that already but let's go on, " + name + "\n\nand your age?\n> ");

        int age = console.nextInt();

        System.out.println(age + "? pfft.");

    }
}
