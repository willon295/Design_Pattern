package dp02_factory.abstract_factory;

public class FactoryProducer {

    static final int COMPUTER_FACTORY = 1;
    static final int MOBILE_PHONE_FACTORY = 2;

    public static AbstractFactory getFactory(Integer facType) {

        if (facType.equals(COMPUTER_FACTORY)) {
            return new ComputerFactory();
        }

        if (facType.equals(MOBILE_PHONE_FACTORY)) {
            return new MobilePhoneFactory();
        }
        return null;
    }

}
