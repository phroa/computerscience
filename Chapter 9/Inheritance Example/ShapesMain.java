public class ShapesMain {
  public static void main(String[] args) {
    Square square = new Square(42);
    System.out.println("Square: " + square + " area: " + square.getArea());

    Rectangle rectangle = new Rectangle(3, 4);
    System.out.println("Rectangle: " + rectangle + " area: " + rectangle.getArea());

  }
}
