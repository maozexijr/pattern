package singleton;

/**
 * 懒汉式单例
 *
 * @author maozexijr
 */
public class LazySingleton {

    /**
     * 1 私有的构造函数
     */
    private LazySingleton() {

    }

    /**
     * 2 私有静态类对象
     */
    private static volatile LazySingleton instance = null;

    /**
     * 3 公开静态获取该类对象的方法
     *
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
