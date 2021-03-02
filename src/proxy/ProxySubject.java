package proxy;

/**
 * 代理主题
 *
 * @author maozexijr
 */
public class ProxySubject implements AbstractSubject {

    private ConcreteSubject concreteSubject;

    @Override
    public void doSomething() {
        if (null == concreteSubject) {
            concreteSubject = new ConcreteSubject();
        }

        System.out.println("代理执行。。");
        concreteSubject.doSomething();
        System.out.println("。。代理结束");
    }

}
