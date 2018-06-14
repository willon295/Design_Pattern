package dp02_factory.normal_factory;

public class CarFactory {
    static final Integer  BMW = 1;
    static  final Integer  BENCI = 2;
    public static Car getCar(Integer carType) {
        if (carType == null) {
            return null;
        } else if (carType.equals(BMW)) {
            return new BMW();
        } else if (carType.equals(BENCI)) {
            return new BenCi();
        }

        return null;
    }
}
