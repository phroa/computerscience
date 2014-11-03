/**
 * Created by js on 10/23/14.
 */
public class Main {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 200);
        for (int cx = 0; cx < 100; cx += 20) panel.getGraphics().drawRect(100 - cx, 100 - cx, 2 * cx, 2 * cx);
    }
}
