package dp06_Bridge;


public class TestMessage {
    public static void main(String[] args) {

        Messager m = new MessageSMS(); //短信形式消息
        CommonMessage commonMessage = new CommonMessage(m); //短信形式 的 普通消息
        commonMessage.sendMessage("申请加薪", "老总");


        Messager m2 = new MessageEmail(); //邮件形式的消息
        UrgengcyMessage urgengcyMessage = new UrgengcyMessage(m2); // 邮件形式的 加急 消息
        urgengcyMessage.sendMessage("给我昨天的报表", "小李");


        SpecialUrgencyMessage specialUrgencyMessage = new SpecialUrgencyMessage(new MessageSMS());
        specialUrgencyMessage.sendMessage("马上来会议室","小陈");
    }
}
