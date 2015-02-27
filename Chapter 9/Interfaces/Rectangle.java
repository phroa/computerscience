public class Rectangle implements Shape {
  private double x, y;

  public Rectangle(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getArea() {
    return this.x * this.y;
  }

  public double getPerimiter() {
    return this.x * 2 + this.y * 2;
  }
}
