package observer;

/**
 * 测试
 *
 * @author maozexijr
 */
public class Test {

    public static void main(String[] args) {
        AbstractObserver observer1 = new ConcreteObserver1();
        AbstractObserver observer2 = new ConcreteObserver2();

        AbstractSubject subject = new ConcreteSubject();
        subject.add(observer1);
        subject.add(observer2);

        subject.notifyObservers();
    }

}
