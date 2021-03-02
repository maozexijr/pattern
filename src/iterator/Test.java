package iterator;

/**
 * 测试
 *
 * @author maozexijr
 */
public class Test {

    public static void main(String[] args) {
        AbstractAggregate aggregate = new ConcreteAggregate();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");

        AbstractIterator iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
    }

}
