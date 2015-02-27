/**
 * Created by js on 2/3/15.
 */
public class AdvanceTicket extends Ticket {

    private int daysBeforehand;

    public AdvanceTicket(int ticketNumber, int daysBeforehand) {
        this.ticketNumber = ticketNumber;
        this.daysBeforehand = daysBeforehand;
    }

    @Override
    public double getPrice() {
        return daysBeforehand >= 10? 30 : 40;
    }
}
