/*
 * Noah Hellriegel, Jack, Mathas van Patten
 * Period 1
 * AP Computer Science
 */
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Cart {
    private final ArrayList<ItemOrder> orders;

    public Cart() {
        this(new ArrayList<ItemOrder>());
    }

    public Cart(ArrayList<ItemOrder> orders) {
        this.orders = orders;
    }

    public void order(ItemOrder order) {
        orders.add(order);
    }

    public ArrayList<ItemOrder> find(String thing) {
        return orders.stream()
                .filter(order -> order.getName().contains(thing))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public double getPrice() {
        double sum = 0;
        for (ItemOrder order : orders) sum += order.getPrice();
        return sum;
    }

    @Override
    public String toString() {
        return String.format("Cart with %d items worth $%.02f:%n%s", orders.size(), getPrice(), orders.toString());
    }
}