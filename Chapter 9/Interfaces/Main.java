public class Main {
  public static void main(String[] args) {
    Shape[] shapes = {new Rectangle(3, 5), new Circle(30), new Triangle(5, 10, 13), new Circle(4)};

    for (Shape s : shapes) print(s);

  }

  static void print(Shape s) {
    System.out.println(s.getClass().getName() + ":");
    System.out.println("Perimiter: " + s.getPerimiter());
    System.out.println("Area: " + s.getArea());
    System.out.println();
  }
}
