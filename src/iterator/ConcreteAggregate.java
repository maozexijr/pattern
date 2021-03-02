package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合
 *
 * @author maozexijr
 */
public class ConcreteAggregate implements AbstractAggregate {

    private List<Object> objects = new ArrayList<>();

    @Override
    public void add(Object object) {
        objects.add(object);
    }

    @Override
    public void remove(Object object) {
        objects.remove(object);
    }

    @Override
    public AbstractIterator getIterator() {
        return new ConcreteIterator(objects);
    }
}
