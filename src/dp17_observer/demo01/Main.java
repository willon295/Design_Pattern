package dp17_observer.demo01;


public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer zhangsan = new Observer("zhangsan");
        Observer lisi = new Observer("lisi");
        Observer wangwu = new Observer("wangwu");

        zhangsan.setSubject(subject);
        lisi.setSubject(subject);
        wangwu.setSubject(subject);
        System.out.println();

        subject.setMessage("微信新版本 6.10  发布 ！ ");

        System.out.println();
        lisi.removeSubject();

        subject.setMessage("微信新版本 7.02  发布 ！");

        /*

        zhangsan 注册了新帐号 !
        lisi 注册了新帐号 !
        wangwu 注册了新帐号 !

        zhangsan 收到推送 :  微信新版本 6.10  发布 ！
        lisi 收到推送 :  微信新版本 6.10  发布 ！
        wangwu 收到推送 :  微信新版本 6.10  发布 ！

        用户： lisi 注销了帐号 ！
        zhangsan 收到推送 :  微信新版本 7.02  发布 ！
        wangwu 收到推送 :  微信新版本 7.02  发布 ！


        * */

    }
}
