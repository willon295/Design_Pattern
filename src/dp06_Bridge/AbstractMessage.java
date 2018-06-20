package dp06_Bridge;


/**
 * 抽象消息类，所有消息类型的父类（普通消息，加急消息，特急消息...）
 */
public  abstract class AbstractMessage {


    /**
     * 持有实现部分的一个对象*/
    Messager messager;
    public AbstractMessage(Messager messager) {
        this.messager = messager;
    }


    /**
     * 委派给实现部分发送消息
     * @param content 消息内容
     * @param toUser 接收者
     * */
    void sendMessage(String  content,String toUser){
        this.messager.send(content,toUser);
    }
}
