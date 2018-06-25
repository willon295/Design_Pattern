package dp01_singleton;

public class Main {


    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                SingletonLazy instance = SingletonLazy.getInstance();
                System.out.println("lazy: "+instance.hashCode());
            }).start();
        }


        for (int i = 0; i < 5; i++) {

            new Thread(() -> {
                SingletonStarve instance = SingletonStarve.getInstance();
                System.out.println("stave: "+instance.hashCode());
            }).start();
        }
    }
}

/*

lazy: 1506862609
lazy: 546952365
lazy: 1506862609
lazy: 1163972460
lazy: 1506862609
stave: 357399586
stave: 357399586
stave: 357399586
stave: 357399586
stave: 357399586

 */

