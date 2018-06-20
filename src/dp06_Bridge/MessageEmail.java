package dp06_Bridge;


/**
 * 邮件 消息
 */
public class MessageEmail implements Messager {
    @Override
    public void send(String content, String toUser) {
        System.out.println("邮件 方式，发送《"+content+"》给 《"+toUser+"》");
    }
}
