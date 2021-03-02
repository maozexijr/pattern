package prototype;

/**
 * 测试
 *
 * @author maozexijr
 */
public class Test {

    public static void main(String[] args) {
        try {
            RealizeType realizeType1 = new RealizeType();
            RealizeType realizeType2 = (RealizeType) realizeType1.clone();
            // do something
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
