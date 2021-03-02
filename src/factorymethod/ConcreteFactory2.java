package factorymethod;

/**
 * 工厂实现2
 *
 * @author maozexijr
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public AbstractProduct produce() {
        return new ConcreteProduct2();
    }

}
