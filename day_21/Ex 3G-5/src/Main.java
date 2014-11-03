import java.util.Scanner;

/**
 * Created by js on 10/23/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("How many squares? ");
        int s = new Scanner(System.in).nextInt();

        DrawingPanel panel = new DrawingPanel(300, 200);

        int i = 0;
        for (;i<=s;i++) {
            panel.getGraphics().drawRect(50, 50, 20*i, 20*i);
        }
        panel.getGraphics().drawLine(50, 50, 50 + 20 * --i, 50 + 20 * i);

    }
}
