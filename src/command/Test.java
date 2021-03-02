package command;

/**
 * 测试
 *
 * @author maozexijr
 */
public class Test {

    public static void main(String[] args) {
        AbstractCommand command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.call();
    }

}
