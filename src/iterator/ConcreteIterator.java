package iterator;

import java.util.List;

/**
 * 具体迭代器
 *
 * @author maozexijr
 */
public class ConcreteIterator implements AbstractIterator {

    private List<Object> objects = null;
    private int index = -1;

    public ConcreteIterator(List<Object> objects) {
        this.objects = objects;
    }

    @Override
    public Object first() {
        index = 0;
        return objects.get(index);
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return objects.get(++index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (index + 1 < objects.size()) {
            return true;
        }
        return false;
    }
}
