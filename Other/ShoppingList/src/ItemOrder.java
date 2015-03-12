/*
 * Noah Hellriegel, Jack, Mathas van Patten
 * Period 1
 * AP Computer Science
 */

public class ItemOrder
{
    Item item;
    double amount;
    public ItemOrder(Item doge, double amount){
        item = doge;
        this.amount = amount;
    }

    public double getPrice(){
        if (amount>=3){
            return (item.getPrice() * amount) - 2;
        }
        else{
            return (item.getPrice() * amount);
        }


    }

    public String getName(){
        return item.getName();
    }

    @Override
    public String toString() {
        return String.format("Order for %.0f %s ($%.02f total)", amount, item, getPrice());
    }
}