package dp13_command;

/**
 * 具体命令 -- 关机
 */
public class CommandOFF implements Command {
    private TV tv;

    public CommandOFF(TV tv) {
        this.tv = tv;
    }


    @Override
    public void execute() {
        tv.turnOFF();
    }
}
