package abstractfactory;

/**
 * 1厂
 *
 * @author maozexijr
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProduct1 produce1() {
        return new ConcreteProduct11();
    }

    @Override
    public AbstractProduct2 produce2() {
        return new ConcreteProduct12();
    }
}
