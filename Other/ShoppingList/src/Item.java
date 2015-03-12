/*
 * Noah Hellriegel, Jack, Mathas van Patten
 * Period 1
 * AP Computer Science
 */
public class Item{
    private String name;
    private double price;

    public Item(double x, String y) {
        price = x;
        name = y;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s ($%.02f)", getName(), getPrice());
    }
}