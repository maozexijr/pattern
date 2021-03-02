package factorymethod;


/**
 * 测试
 *
 * @author maozexijr
 */
public class Test {

    public static void main(String[] args) {

        AbstractFactory factory = new ConcreteFactory1();
        AbstractProduct product = factory.produce();
        product.show();

        factory = new ConcreteFactory2();
        product = factory.produce();
        product.show();

    }

}
