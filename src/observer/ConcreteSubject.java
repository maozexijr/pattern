package observer;

/**
 * 抽象观察者
 *
 * @author maozexijr
 */
public class ConcreteSubject extends AbstractSubject {

    @Override
    public void notifyObservers() {
        for (AbstractObserver observer : observers) {
            observer.response();
        }
    }

}
