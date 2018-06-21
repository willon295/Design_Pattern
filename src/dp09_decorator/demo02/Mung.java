package dp09_decorator.demo02;

/**
 * 绿豆类
 */
public class Mung  extends CondimentDecorator{

    public Mung(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName()+",Mung";
    }

    @Override
    double price() {
        return beverage.price()+1.5 ;
    }
}
