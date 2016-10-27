package singleton;

public class Client {

    public static void main(String[] args) {
        //1.首先判断 EagerSingleton的对象只有一个
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("饿汉实例一:" + eagerSingleton1.hashCode());
        System.out.println("饿汉实例二:" + eagerSingleton2.hashCode());
        System.out.println("是否相同:"+eagerSingleton1.equals(eagerSingleton2));

        //2.然后判断 LazySingleton的对象只有一个
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("懒汉实例一:" + lazySingleton1.hashCode());
        System.out.println("懒汉实例二:" + lazySingleton2.hashCode());

        //hasCode是一样的所以他们的 对象是相同的.

    }
}
