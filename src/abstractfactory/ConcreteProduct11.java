package abstractfactory;

/**
 * 1厂1类产品
 *
 * @author maozexijr
 */
public class ConcreteProduct11 implements AbstractProduct1 {

    @Override
    public void show() {
        System.out.println("1厂1类产品");
    }

}
