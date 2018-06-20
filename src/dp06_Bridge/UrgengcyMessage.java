package dp06_Bridge;


/**
 * 加急消息
 * */
public class UrgengcyMessage  extends  AbstractMessage{
    public UrgengcyMessage(Messager messager) {
        super(messager);
    }

    /**
     * 加急的消息处理
     * @param content 消息内容
     * @param toUser 接收者
     */
    @Override
    void sendMessage(String content, String toUser) {
        content="<!加急>__"+content;
        super.sendMessage(content,toUser);

    }
    /**
     * 扩展的功能，可以自由实现
     * @param messageId 消息id
     * @return 消息的处理状态
     */
    public Object watch(String  messageId){
        return null;
    }
}
