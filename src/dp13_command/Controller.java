package dp13_command;

/**
 * Invoker:  遥控器
 */
public class Controller {

    //维护一个命令实例
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(){
        command.execute();
    }
}
