import java.awt.*;
import java.io.*;
import java.util.*;

public class Bomb {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(200, 200);
    Graphics g = panel.getGraphics();

    ArrayList<Point> points = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(new File("cities.txt")))) {
      for (String line; (line = reader.readLine()) != null;) {
        String[] split = line.split(" ");
        points.add(new Point(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
      }
    } catch (Exception e) {System.exit(0);}

    System.out.println(points.size() + " cities on the map.");

    Scanner in = new Scanner(System.in);
    Point bomb = new Point();

    System.out.println("Enter the coordinates for the bomb to be placed:");
    System.out.print("X: ");
    bomb.x = in.nextInt();
    System.out.print("Y: ");
    bomb.y = in.nextInt();

    System.out.print("Enter the bomb's blast radius: ");
    int radius = in.nextInt();

    g.setColor(Color.RED);
    g.drawOval(bomb.x - radius, bomb.y - radius, radius * 2, radius * 2);

    for (Point p : points) {
      g.setColor((p.distance(bomb) <= radius) ? Color.RED : Color.BLACK);
      p.draw(g, true);
    }
  }
}
