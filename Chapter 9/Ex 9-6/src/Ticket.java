import java.util.Random;

public abstract class Ticket {
    protected int ticketNumber;
    protected int price = 50;

    public Ticket() {
        this(new Random().nextInt(1500));
    }

    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber() {
        return this.ticketNumber;
    }

    public abstract double getPrice();

    public String toString() {
        return String.format("Ticket #%i, $%.2f", this.ticketNumber, getPrice());
    }
}