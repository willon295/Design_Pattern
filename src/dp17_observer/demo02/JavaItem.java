package dp17_observer.demo02;


import java.util.ArrayList;

public class JavaItem extends Item {


    public JavaItem() {
        users = new ArrayList<>();
    }

    @Override
    void attach(NormalUser user) {
        users.add(user);
    }

    @Override
    void unAttach(NormalUser user) {
        if (users != null) {
            users.remove(user);
        }
    }

    @Override
    void notifyAllUser() {
        for (NormalUser user : users) {
            user.update(this);
        }
    }

    /**
     * 推送新消息
     * @param message 消息
     */
    public void postNewMessage(String message) {
        this.message =  message;
        //马上通知所有用户
        notifyAllUser();
    }
}
