package abstractfactory;


/**
 * 测试
 *
 * @author maozexijr
 */
public class Test {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProduct1 product1 = factory.produce1();
        AbstractProduct2 product2 = factory.produce2();
        product1.show();
        product2.show();

        factory = new ConcreteFactory2();
        product1 = factory.produce1();
        product2 = factory.produce2();
        product1.show();
        product2.show();
    }

}
