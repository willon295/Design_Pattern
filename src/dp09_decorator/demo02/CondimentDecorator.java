package dp09_decorator.demo02;

/**
 * 辅料基类
 */
public abstract class CondimentDecorator  extends Beverage{


    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
