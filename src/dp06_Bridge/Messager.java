package dp06_Bridge;

/**
 * 通用接口， 用于规范
 * 不同形式的消息 的发送 (短信，邮件，微信....)
 * */

public interface Messager {

    /**
     * 发送消息方法
     * @param content 消息内容
     * @param toUser 接收人
     */
    void send(String  content , String  toUser);
}
