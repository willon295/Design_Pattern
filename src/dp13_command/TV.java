package dp13_command;

/**
 * Receiver 电视
 */
public class TV {
    private int channel= 1;

    public void turnON() {
        System.out.println("TV on...");
    }

    public void turnOFF() {

        System.out.println("TV off...");
    }

    public void changeChannel() {
        channel++;
        System.out.println("Channel change to "+channel);
    }
}
