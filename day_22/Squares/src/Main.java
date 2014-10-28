import java.awt.*;

public class Main {
    public static void main(String[] args) {

        DrawingPanel panel = new DrawingPanel(200, 200);

        Graphics graphics = panel.getGraphics();

        // draw squares 12 pixels apart
        for (int i = 0; i < 200; i += 12) {
            drawSquare(graphics, i);
        }

    }

    static void drawSquare(Graphics graphics, int i) {
        // draw a black border
        Color black = new Color(0, 0, 0);
        graphics.setColor(black);
        // i - 1 because just 'i' makes them overlap oddly (same reason I'm using 21 for the width + height)
        graphics.drawRect(i - 1, i - 1, 21, 21);

        // make a color that's a shade of white depending on 'i'
        Color c = new Color(255 - i, 255 - i, 255 - i);
        graphics.setColor(c);
        // fill a square
        graphics.fillRect(i, i, 20, 20);
    }

}
