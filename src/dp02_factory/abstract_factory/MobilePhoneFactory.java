package dp02_factory.abstract_factory;

public class MobilePhoneFactory extends AbstractFactory {


    static final Integer XIAOMI = 1;
    static final Integer SUMSUNG = 2;

    @Override
    Computer getComputer(Integer type) {

        return null;
    }

    @Override
    MobilePhone getPhone(Integer type) {
        if (type.equals(XIAOMI)) {
            return new Xiaomi();
        }

        if (type.equals(SUMSUNG)) {
            return new Sumsung();
        }
        return null;
    }
}
