package dp09_decorator.demo02;

/**
 * 珍珠类
 */
public class Pearl  extends CondimentDecorator{


    public Pearl(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName()+",Pearl";
    }

    @Override
    double price() {
        return beverage.price()+2.0;
    }
}
