package prototype;

/**
 * 原型模式
 *
 * @author maozexijr
 */
public class RealizeType implements Cloneable {

    public RealizeType() {
    }

    /**
     * 浅复制
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (RealizeType) super.clone();
    }

}
