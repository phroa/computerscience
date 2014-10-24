import java.util.Scanner;

/**
 * Created by js on 10/23/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Width: ");
        int x = c.nextInt();

        while (x % 20 != 0) {
            System.out.println("That really should be divisible by 20. Let's try that again.");
            System.out.print("Width: ");
            x = c.nextInt();
        }

        System.out.print("Height: ");
        int y = c.nextInt();

        while (y % 20 != 0) {
            System.out.println("That really should be divisible by 20. Let's try that again.");
            System.out.print("Height: ");
            y = c.nextInt();
        }

        DrawingPanel panel = new DrawingPanel(x, y);

        int cx = 20, cy = 20;
        while (cx < x/2 && cy < y/2) {
            panel.getGraphics().drawRect(cx, cy, x - cx * 2, y - cy * 2);
            cx += 20;
            cy += 20;
        }
    }
}
