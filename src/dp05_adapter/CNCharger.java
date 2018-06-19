package dp05_adapter;

/**
 * @author willon
 * @version 0.1.1-SNAPSHOT
 * @since 18-6-19
 */
public class CNCharger implements Charger {
    USChargerAdapter adapter;

    @Override
    public void chargging(int dy) {

        if (dy==220){
            System.out.println("Chargging .. "+dy);
        }else {
            System.out.println("Cann't chargging .." +dy);
        }

    }
}
