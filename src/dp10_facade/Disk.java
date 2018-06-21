package dp10_facade;

/**
 * @author willon
 * @since 6/21/18
 */
public class Disk implements Component {
    @Override
    public void start() {
        System.out.println("Disk start ..");
    }

    @Override
    public void shutdown() {

            System.out.println("Disk shutdown..");

    }
}
