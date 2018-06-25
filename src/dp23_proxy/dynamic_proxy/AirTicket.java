package dp23_proxy.dynamic_proxy;

/**
 * 飞机票
 */
public class AirTicket  implements Ticket{


    private double price;

    public AirTicket(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void sell() {
        System.out.println("飞机票： "+price);
    }
}
