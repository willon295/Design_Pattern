package dp05_adapter;

/**
 * @author willon
 * @version 0.1.1-SNAPSHOT
 * @since 18-6-19
 */
public class USCharger implements Charger {

    USChargerAdapter adapter;

    @Override
    public void chargging(int dy) {
        if (dy == 110) {
            System.out.println("Chargging.." + dy);
        } else if (dy == 220) {
            adapter = new USChargerAdapter(dy);
            adapter.chargging(dy);
        }
    }
}
