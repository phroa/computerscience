public class Circle implements Shape {
  private double r;

  public Circle(double r) {
    this.r = r;
  }

  public double getArea() {
    return Math.PI * r * r;
  }

  public double getPerimiter() {
    return Math.PI * 2 * r;
  }
}
