import java.awt.*;

public final class Point {
  public int x;
  public int y;

  public Point() {}

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
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
      graphics.drawString(toString(), x, y - 5);
    }
  }

  @Override
  public String toString() {
    return String.format("(%d, %d)", this.x, this.y);
  }
}
