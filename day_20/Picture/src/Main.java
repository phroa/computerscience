import java.awt.*;

import static java.awt.Color.BLACK;
import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;

/**
 * Created by js on 10/21/14.
 */
public class Main {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500);
        panel.setGridLines(true);
        Graphics g = panel.getGraphics();

        background(g);
        sun(g);
        tree(g);
        person(g);
        house(g);
        birds(g);
        sign(g);

    }

    static void background(Graphics g) {
        // sky
        g.setColor(new Color(129, 199, 232));
        g.fillRect(0, 0, 500, 500);

        // ground
        g.setColor(new Color(20, 113, 51));
        g.fillRect(0, 460, 500, 40);
    }

    static void sun(Graphics g) {
        // sun's outline
        g.setColor(BLACK);
        g.drawOval(-50, -50, 100, 100);
        // filled-in sun
        g.setColor(new Color(208, 210, 56));
        g.fillOval(-50, -50, 100, 100);
    }

    static void tree(Graphics g) {
        // trunk
        g.setColor(new Color(128, 85, 37));
        g.fillRect(110, 300, 30, 160);

        // leaves
        g.setColor(new Color(40, 180, 71));
        g.fillOval(125, 260, 60, 50);
        g.fillOval(85, 270, 80, 70);
        g.fillOval(85, 225, 80, 70);
        g.fillOval(80, 230, 80, 70);
    }

    static void house(Graphics g) {
        // house
        g.setColor(new Color(151, 107, 53));
        g.fillRect(260, 300, 130, 160);

        // roof
        g.fillPolygon(new int[]{220, 325, 430}, new int[]{300, 240, 300}, 3);
    }

    static void person(Graphics g) {
        g.setColor(BLACK);
        g.drawLine(180, 460, 190, 430);
        g.drawLine(190, 430, 200, 460);

        g.drawLine(190, 400, 190, 430);

        g.drawOval(180, 380, 20, 20);

        g.drawLine(190, 413, 215, 402);
        g.drawLine(190, 413, 182, 433);
    }

    static void birds(Graphics g) {
        // birds
        g.setColor(BLACK);
        g.drawLine(240, 20, 245, 25);
        g.drawLine(245, 25, 250, 20);

        g.drawLine(260, 23, 265, 28);
        g.drawLine(265, 28, 270, 23);
        g.drawLine(247, 28, 252, 33);
        g.drawLine(252, 33, 257, 28);
    }

    static void sign(Graphics g) {
        // signature
        g.setColor(BLACK);
        g.setFont(new Font("Zapfino", ITALIC | BOLD, 13));
        g.drawString("- Jack Stratton", 370, 20);
    }

}
