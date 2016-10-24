package singleton;

/**
 * Created by john on 2016/10/20.
 * 饿汉
 */
public class EagerSingleton {
    private static EagerSingleton mEagerSingleton = new EagerSingleton();

    private String name;

    private EagerSingleton() {
        name = "饿汉";
    }

    public static EagerSingleton getInstance() {
        return mEagerSingleton;
    }

}
