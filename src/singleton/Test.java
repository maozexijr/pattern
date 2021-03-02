package singleton;

/**
 * 测试
 *
 * @author maozexijr
 */
public class Test {

    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        // do something
        LazySingleton lazySingleton = LazySingleton.getInstance();
        // do something
    }

}
