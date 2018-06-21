package dp09_decorator.demo02;

/**
 * 奶昔类
 */
public class MikeShake extends Beverage {
    public MikeShake() {
        name = "MikeShake";
    }

    @Override
    double price() {
        return 4.5;
    }
}
