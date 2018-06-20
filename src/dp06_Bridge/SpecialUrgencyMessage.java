package dp06_Bridge;

/**
 * 特急消息
 */
public class SpecialUrgencyMessage  extends AbstractMessage{
    public SpecialUrgencyMessage(Messager messager) {
        super(messager);
    }


    /**
     * 特急的处理方式
     * @param content 消息内容
     * @param toUser 接收者
     */
    @Override
    void sendMessage(String content, String toUser) {
        content="<!!!!特急>__"+content;
        super.sendMessage(content,toUser);
    }
}
