package dp10_facade;


public class Memory implements Component {
    @Override
    public void start() {
        System.out.println("Memory start ..");
    }

    @Override
    public void shutdown() {
        System.out.println("Memory shutdown..");
    }
}
