package dp01_singleton;


/**
 * 懒汉模式
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    }
    public  synchronized static SingletonLazy getInstance() {
        if (instance == null) {
            instance =  new SingletonLazy();
        }
        return instance;
    }
}
