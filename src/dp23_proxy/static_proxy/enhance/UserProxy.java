package dp23_proxy.static_proxy.enhance;

/**
 * 代理类
 */
public class UserProxy implements Action{

    //持有一个用户实例引用
    private User user;

    public UserProxy(User user) {
        this.user = user;
    }


    /**
     * 对用户原有的方法增强
     */
    @Override
    public void eat() {
        System.out.println("洗苹果");
        user.eat();
        System.out.println("垃圾扔进垃圾桶");

    }

    @Override
    public void sleep() {
        System.out.println("洗澡");
        user.sleep();
    }
}
