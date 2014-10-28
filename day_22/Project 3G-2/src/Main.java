import data.Colors;
import data.Objects;
import data.Position;

import java.awt.*;

import static data.Objects.*;
import static data.Position.*;
import static data.Colors.*;

/**
 * Created by js on 10/27/14.
 */
public class Main {
    public static void main(String[] args) {
        DrawingPanel p = new DrawingPanel(200, 200);
        Graphics g = p.getGraphics();

        // This uses the values present in the appropriate ./data/X.java file, e.g. Position.TOP and Position.LEFT which
        // (both) correspond to the int 25.
        drawObject(g, LEFT,   TOP, EYES,  LIGHT);
        drawObject(g, CENTER, TOP, BOXES, MEDIUM);
        drawObject(g, RIGHT,  TOP, TEXT,  DARK);

        drawObject(g, LEFT,   MIDDLE, BOXES, DARK);
        drawObject(g, CENTER, MIDDLE, TEXT,  LIGHT);
        drawObject(g, RIGHT,  MIDDLE, EYES,  MEDIUM);

        drawObject(g, LEFT,   BOTTOM, TEXT,  MEDIUM);
        drawObject(g, MIDDLE, BOTTOM, EYES,  DARK);
        drawObject(g, RIGHT,  BOTTOM, BOXES, LIGHT);
    }

    private static void drawObject(Graphics g, Position col, Position row, Objects obj, Colors c) {
        int x = col.get();
        int y = row.get();

        g.setColor(c.get());

        // object border
        g.drawRect(x, y, 50, 50);

        switch (obj) {
            case EYES:
                // left eye
                g.drawOval(x + 5, y + 10, 15, 30);
                g.fillOval(x + 5, y + 18, 15, 15);

                // right eye
                g.drawOval(x + 30, y + 10, 15, 30);
                g.fillOval(x + 30, y + 18, 15, 15);
                break;
            case TEXT:
                g.setFont(new Font("Inconsolata", Font.PLAIN, 14));
                g.drawString("I", x + 22, y + 15);
                g.drawString("LOVE", x + 13, y + 28);
                g.drawString("JAVA", x + 12, y + 42);
                break;
            case BOXES:
                // from the top, going down
                for (int i=0; i < 5; i++)
                    g.drawRect(x + (5 * i), y + (5 * i), 5, 45 - (10 * i));

                // from the left
                for (int i=0; i < 5; i++)
                    g.drawRect(x + (5 * (i + 1)), y + (5 * i), 45 - (10 * i), 5);

                // from the bottom
                for (int i=0; i < 5; i++)
                    g.drawRect(x + (5 * i), y + (45 - (5 * i)), 45 - (10 * i), 5);

                // from the right
                for (int i=0; i < 5; i++)
                    g.drawRect(x + (45 - (5 * i)), y + (5 * (i + 1)), 5, 45 - (10 * i));

                break;
        }

    }
}
