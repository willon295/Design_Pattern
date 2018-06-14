package dp02_factory.abstract_factory;

public class Main {
    public static void main(String[] args) {

        AbstractFactory computer_factory = FactoryProducer.getFactory(FactoryProducer.COMPUTER_FACTORY);
        AbstractFactory mobilePhone_factory = FactoryProducer.getFactory(FactoryProducer.MOBILE_PHONE_FACTORY);

        Computer hasee = computer_factory.getComputer(ComputerFactory.HASEE);
        Computer thinkpad = computer_factory.getComputer(ComputerFactory.THINKPAD);
        hasee.boot();
        thinkpad.boot();


        MobilePhone sumsung = mobilePhone_factory.getPhone(MobilePhoneFactory.SUMSUNG);
        MobilePhone xiaomi = mobilePhone_factory.getPhone(MobilePhoneFactory.XIAOMI);
        sumsung.boot();
        xiaomi.boot();

    }
}
