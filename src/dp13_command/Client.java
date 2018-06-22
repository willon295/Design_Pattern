package dp13_command;

/**
 * @author willon
 * @since 6/21/18
 */
public class Client {
    public static void main(String[] args) {
        TV tv = new TV();

        Controller controller = new Controller();


        controller.setCommand(new CommandON(tv));
        controller.execute();

        controller.setCommand(new CommandChangeChannel(tv));
        controller.execute();

        controller.setCommand(new CommandOFF(tv));
        controller.execute();



        /*运行结果

        TV on...
        Channel change to 2
        TV off...

        */

    }
}
