public class PointMain {
  public static void main(String[] args) {
    Point one = new Point();
    one.x = 30;
    one.y = 40;

    System.out.print("Point one is at ");
    System.out.println(one);

    Point two = new Point();
    two.x = 35;
    two.y = 48;

    System.out.print("Point two is at ");
    System.out.println(two);
    System.out.print("Point two moved (-3, 5) is");
    two.translate(-3, 5);
    System.out.println(two);

    System.out.print("Point one is ");
    System.out.print(one.distance(two));
    System.out.print(" units far away");
  }
}
