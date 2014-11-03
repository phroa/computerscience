import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float item1 = prompt(in, "One");
        float item2 = prompt(in, "Two");
        float item3 = prompt(in, "Three");

        in.close();

        float subtotal = item1 + item2 + item3;
        float tax = tax(subtotal);
        float tip = tip(subtotal);

        System.out.println("Subtotal:   " + subtotal);
        System.out.println("Tax:        " + tax);
        System.out.println("Tip:        " + tip);
        System.out.println("            -------");
        System.out.println("Total Bill: " + (subtotal + tax + tip));

    }

    private static float prompt(Scanner in, String i) {
        System.out.print("Item " + i + "'s Price: ");
        return in.nextFloat();
    }

    static float tax(float amt) {
        return amt * 1.08f - amt;
    }
    static float tip(float amt) {
        return amt * 1.15f - amt;
    }
}
