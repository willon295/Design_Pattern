package dp23_proxy.dynamic_proxy;

/**
 * 火车票
 */
public class TrainTicket implements Ticket {

    private double price;

    public TrainTicket(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void sell() {
        System.out.println("火车票："+price);
    }
}
