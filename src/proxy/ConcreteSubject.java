package proxy;

/**
 * 实际主题
 *
 * @author maozexijr
 */
public class ConcreteSubject implements AbstractSubject {

    @Override
    public void doSomething() {
        System.out.println("实际主题执行中。。");
    }

}
