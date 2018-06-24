package dp17_observer.demo02;

import java.util.ArrayList;

/* Python 话题*/
public class PythonItem extends Item {

    public PythonItem() {
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

    public void postNewMessage(String message) {
        this.message = message;
        notifyAllUser();
    }
}
