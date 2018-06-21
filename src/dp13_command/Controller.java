package dp13_command;

/**
 * Invoker:  遥控器
 */
public class Controller {

    //维护一系列的命令
    private Command onCommand, offCommand, changeCommand;

    public Controller(Command on, Command off, Command change) {
        this.onCommand = on;
        this.offCommand = off;
        this.changeCommand = change;
    }


    public void  turnON(){
        onCommand.execute();
    }
    public void turnOFF(){
        offCommand.execute();
    }

    public void change(){
        changeCommand.execute();
    }
}
