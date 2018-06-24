package dp17_observer.demo01;


import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String message;

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    /**
     * 当用户订阅时，将用户添加进订阅者集合
     * @param observer 用户
     */
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getName() + " 注册了新帐号 !");
    }

    /**
     * 通知所有用户
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    /**
     * 当用户不再订阅时
     * @param observer 用户
     */
    public void unAttach(Observer observer) {
        if (observers != null) {
            observers.remove(observer);
        }
        System.out.println("用户： "+observer.getName()+" 注销了帐号 ！");
    }
}
