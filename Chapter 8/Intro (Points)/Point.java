import java.awt.*;

public final class Point {
  public int x;
  public int y;

  public Point() {}

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void translate(int x, int y) {
    this.x += x;
    this.y += y;
  }

  public double distance(Point second) {
    return Math.sqrt(Math.pow(this.x - second.x, 2) + Math.pow(this.y - second.y, 2));
  }

  public void draw(Graphics graphics, boolean label) {
    graphics.fillRect(x, y, 3, 3);
    if (label) {
      graphics.drawString("(" + x + ", " + y + ")", x, y - 5);
    }
  }

}
