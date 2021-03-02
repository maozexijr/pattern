package abstractfactory;

/**
 * 1厂2类产品
 *
 * @author maozexijr
 */
public class ConcreteProduct12 implements AbstractProduct2 {

    @Override
    public void show() {
        System.out.println("1厂2类产品");
    }

}
