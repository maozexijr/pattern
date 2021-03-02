package abstractfactory;

/**
 * 2厂
 *
 * @author maozexijr
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public AbstractProduct1 produce1() {
        return new ConcreteProduct21();
    }

    @Override
    public AbstractProduct2 produce2() {
        return new ConcreteProduct22();
    }

}
