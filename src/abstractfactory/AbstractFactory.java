package abstractfactory;

/**
 * 工厂
 *
 * @author maozexijr
 */
public interface AbstractFactory {

    /**
     * 生产1类产品
     *
     * @return
     */
    AbstractProduct1 produce1();

    /**
     * 组装2类产品
     *
     * @return
     */
    AbstractProduct2 produce2();

}
