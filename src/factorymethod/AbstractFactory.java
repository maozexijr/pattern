package factorymethod;

/**
 * 工厂
 *
 * @author maozexijr
 */
public interface AbstractFactory {

    /**
     * 生产
     *
     * @return
     */
    AbstractProduct produce();

}
