package dp09_decorator.demo02;

/**
 * 抽象饮料类
 */
public abstract class Beverage {
    String  name="Unknown Beverage";
    abstract double price();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
