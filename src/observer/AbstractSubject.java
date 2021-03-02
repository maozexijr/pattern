package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 *
 * @author maozexijr
 */
abstract class AbstractSubject {

    protected List<AbstractObserver> observers = new ArrayList<>();

    public void add(AbstractObserver observer) {
        observers.add(observer);
    }

    public void remove(AbstractObserver observer) {
        observers.remove(observer);
    }

    /**
     * 通知
     */
    public abstract void notifyObservers();
}
