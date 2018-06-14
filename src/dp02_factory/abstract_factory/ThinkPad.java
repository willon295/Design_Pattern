package dp02_factory.abstract_factory;

public class ThinkPad implements Computer {
    @Override
    public void boot() {
        System.out.println("ThinkPad  computer boot....");
    }
}
