package dp01_singleton;


/**
 * 饿汉模式
 */
public class SingletonStarve {

    //类加载时就创建唯一实例
    public static SingletonStarve getInstance() {
        return instance;
    }

    private static SingletonStarve instance = new SingletonStarve();

    private SingletonStarve() {
    }
}
