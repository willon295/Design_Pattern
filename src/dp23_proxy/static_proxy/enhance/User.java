package dp23_proxy.static_proxy.enhance;

/**
 * 具体用户实现类
 */
public class User implements Action {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(name+"吃水果");
    }

    @Override
    public void sleep() {

        System.out.println(name+"睡觉");
    }
}
