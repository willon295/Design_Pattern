package dp05_adapter;

/**
 * @author willon
 * @version 0.1.1-SNAPSHOT
 * @since 18-6-19
 */
public class USChargerAdapter implements Charger {

    private Charger charger;

    public USChargerAdapter(int  dy) {
        if (dy==110){
            charger = new USCharger();
        }else if (dy==220){
            charger = new CNCharger();
        }

    }

    @Override
    public void chargging(int dy) {
        charger.chargging(dy);
    }
}
