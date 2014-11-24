import java.util.Scanner;

public class Inclass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
  
    //System.out.print("Thing: "); 
    //System.out.println(" hasNext? " + in.hasNext());
    //System.out.println(" hasNextInt? " + in.hasNextInt());
    //System.out.println(" hasNextDouble? " + in.hasNextDouble());

    int n = getInt(in, "Number: ");
    System.out.println("You put in " + n);
  }

  static int getInt(Scanner in, String p) {
    System.out.print(p);
    while (!in.hasNextInt()) {
      in.next();
      System.out.println("Not an integer");
      System.out.print(p);
    }
    return in.nextInt();
  }
}
