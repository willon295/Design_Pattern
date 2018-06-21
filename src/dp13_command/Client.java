package dp13_command;

/**
 * @author willon
 * @since 6/21/18
 */
public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        Command on = new CommandON(tv);
        Command off = new CommandOFF(tv);
        Command change = new CommandChangeChannel(tv);

        Controller controller = new Controller(on, off, change);
        controller.turnON();
        controller.change();
        controller.turnOFF();


        /*运行结果

        TV on...
        Channel change to 2
        TV off...

        */

    }
}
