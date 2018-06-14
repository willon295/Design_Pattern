package dp02_factory.normal_factory;

public class Customer {
    public static void main(String[] args) {

        Car bmw = CarFactory.getCar(CarFactory.BMW);
        bmw.run();

        Car benci = CarFactory.getCar(CarFactory.BENCI);
        benci.run();
    }
}
