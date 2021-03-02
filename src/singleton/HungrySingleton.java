package singleton;

/**
 * 饿汉式单例
 *
 * @author maozexijr
 */
public class HungrySingleton {


    /**
     * 1 私有的构造函数
     */
    private HungrySingleton() {

    }

    /**
     * 2 私有静态类对象
     */
    private static final HungrySingleton instance = new HungrySingleton();

    /**
     * 3 公开静态获取该类对象的方法
     *
     * @return
     */
    public static synchronized HungrySingleton getInstance() {
        return instance;
    }

}
