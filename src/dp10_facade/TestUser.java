package dp10_facade;


public class TestUser {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.start();

        System.out.println("用户使用中。。");
        System.out.println("用户使用完毕。。");

        computer.shutdown();


        /*
        Computer starting ..
        CPU start ..
        Disk start ..
        Memory start ..
        Computer success!
        用户使用中。。
        用户使用完毕。。
        Computer  shutdown...
        Disk shutdown..
        Memory shutdown..
        CPU shutdown..
        Computer shutdown success !

        */
    }
}
