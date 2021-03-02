package iterator;

/**
 * 抽象聚合
 *
 * @author maozexijr
 */
public interface AbstractAggregate {

    /**
     * 添加
     *
     * @param object
     */
    void add(Object object);

    /**
     * 移除
     *
     * @param object
     */
    void remove(Object object);

    /**
     * 获取
     *
     * @return
     */
    AbstractIterator getIterator();

}
