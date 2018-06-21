package dp13_command;

/**
 * 具体命令 -- 换台
 */
public class CommandChangeChannel implements Command {

    private TV tv;

    public CommandChangeChannel(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
