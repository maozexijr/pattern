package iterator;

/**
 * 抽象迭代器
 *
 * @author maozexijr
 */
public interface AbstractIterator {

    /**
     * 首项
     *
     * @return
     */
    Object first();

    /**
     * 下一项
     *
     * @return
     */
    Object next();

    /**
     * 有下一项
     *
     * @return
     */
    boolean hasNext();

}
