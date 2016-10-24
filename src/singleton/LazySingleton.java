package singleton;

/**
 * Created by john on 2016/10/20.
 * 懒汉
 */
public class LazySingleton {
    public static LazySingleton mLazySingleton;

    private String name;

    private LazySingleton() {
        name = "懒汉";
    }

    public static LazySingleton getInstance() {
        if (mLazySingleton == null) {
            mLazySingleton = new LazySingleton();
        }
        return mLazySingleton;
    }
}
