package dp02_factory.abstract_factory;

public class ComputerFactory extends AbstractFactory {

    static final int HASEE = 1;
    static final int THINKPAD = 2;

    @Override
    Computer getComputer(Integer type) {

        if (type.equals(ComputerFactory.HASEE)) {
            return new Hasee();
        } else if (type.equals(ComputerFactory.THINKPAD)) {
            return new ThinkPad();
        }
        return null;
    }

    @Override
    MobilePhone getPhone(Integer type) {
        return null;
    }
}
