/*
 * Noah Hellriegel, Jack, Mathas van Patten
 * Period 1
 * AP Computer Science
 */
public class Runner {
    public static void main(String[] args) {
        Cart cart = new Cart();

        System.out.println(cart);

        System.out.println();

        cart.order(new ItemOrder(new Item(12, "Bulk Peanut Butter"), 1));
        cart.order(new ItemOrder(new Item(1.98, "Pizza Slice"), 3));
        cart.order(new ItemOrder(new Item(4.39, "Pickles"), 8));

        System.out.println(cart);

        System.out.println();

        System.out.println("Found some pizza?");

        System.out.println(cart.find("Pizza"));
    }
}
