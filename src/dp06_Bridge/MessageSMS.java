package dp06_Bridge;

/**
 * 短信消息
 */
public class MessageSMS implements Messager {

    @Override
    public void send(String content, String toUser) {
        System.out.println("短信  方式，发送《"+content+"》给 《"+toUser+"》");
    }
}
