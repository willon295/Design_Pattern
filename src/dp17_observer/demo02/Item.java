package dp17_observer.demo02;


import java.util.List;

public abstract class Item {

    protected  String  message;

    protected List<NormalUser> users;

    /**
     * 添加新的用户
     * @param user 用户
     */
    abstract void attach(NormalUser user);
    abstract void unAttach(NormalUser user);

    /**
     * 通知所有用户
     */
    abstract void notifyAllUser();

    public String getMessage() {
        return message;
    }

}
