package dp10_facade;

/**
 * @author willon
 * @since 6/21/18
 */
public class CPU implements Component {
    @Override
    public void start() {
        System.out.println("CPU start ..");
    }

    @Override
    public void shutdown() {
        System.out.println("CPU shutdown..");
    }
}
