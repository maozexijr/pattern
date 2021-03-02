package factorymethod;

/**
 * 工厂实现1
 *
 * @author maozexijr
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProduct produce() {
        return new ConcreteProduct1();
    }

}
