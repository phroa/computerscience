public class Rectangle extends Square {
  public double y;

  public Rectangle(double x, double y) {
    super(x);
    this.y = y;
  }

  @Override
  public double getArea() {
    return this.x * this.y;
  }
 
  @Override
  public void expand(double x) {
    this.x += x;
    this.y += x;
  }

  public void expand(double x, double y) {
    this.x += x;
    this.y += y;
  }

  @Override
  public String toString() {
    return String.format("%.2fx%.2f", this.x, this.y);
  }
}
