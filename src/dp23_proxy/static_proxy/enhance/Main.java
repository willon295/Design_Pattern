package dp23_proxy.static_proxy.enhance;

public class Main {


    public static void main(String[] args) {


        UserProxy userProx = new UserProxy(new User("Jack"));
        userProx.eat();
        System.out.println();
        userProx.sleep();

    }
}
/*

洗苹果
Jack吃水果
垃圾扔进垃圾桶

洗澡
Jack睡觉

 */