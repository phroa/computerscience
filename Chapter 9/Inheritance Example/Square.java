public class Square {
  public double x;

  public Square(double x) {
    this.x = x;
  }

  public double getArea() {
    return Math.pow(this.x, 2);
  }

  public void expand(double x) {
    this.x += x;
  }

  public String toString() {
    return String.format("%.2fx%.2f", this.x, this.x);
  }
}
