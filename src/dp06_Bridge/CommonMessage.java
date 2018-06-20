package dp06_Bridge;


/**
 * 普通消息
 */
public class CommonMessage extends AbstractMessage {


    public CommonMessage(Messager messager) {
        super(messager);
    }

    /**
     * 普通的消息调用父类的消息发送消息即可
     * @param content 消息内容
     * @param toUser 接收者
     */
    @Override
    void sendMessage(String content, String toUser) {
        super.sendMessage(content, toUser);
    }
}
