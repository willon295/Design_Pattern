package dp09_decorator.demo02;

/**
 * 奶茶
 */
public class MikeTea extends Beverage {

    public MikeTea() {
        name = "MikeTea";
    }

    @Override
    public double price() {
        return 4.0;
    }
}
