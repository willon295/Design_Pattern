package dp02_factory.abstract_factory;

public abstract class AbstractFactory {

    abstract Computer getComputer(Integer type);
    abstract MobilePhone getPhone(Integer type);
}
