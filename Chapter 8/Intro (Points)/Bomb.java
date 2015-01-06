import java.awt.*;

public class Bomb {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(300, 300);
    Graphics g = panel.getGraphics();
    Point p = new Point(20, 60);

    p.draw(g, true);
  }
}
