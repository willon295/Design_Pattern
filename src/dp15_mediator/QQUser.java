package dp15_mediator;


public class QQUser {

    private String name;

    public QQUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 发送消息
     * @param msg 消息
     */
    public void sendMessage(String msg) {
        QQ.showMessage(this, msg);
    }
}
