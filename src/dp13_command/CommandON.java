package dp13_command;

/**
 * 具体命令类 -  打开
 */
public class CommandON implements Command {

    private TV tv;

    public CommandON(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnON();
    }
}
