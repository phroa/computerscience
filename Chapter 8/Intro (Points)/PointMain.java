public class PointMain {
  public static void main(String[] args) {
    Point one = new Point();
    one.x = 30;
    one.y = 40;

    System.out.println(one.x + ", " + one.y);

    Point two = new Point();
    two.x = 35;
    two.y = 48;

    System.out.println(two.x + ", " + two.y);
    System.out.println(one.distance(two));
  }
}
