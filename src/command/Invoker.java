package command;

/**
 * 调用者
 *
 * @author maozexijr
 */
public class Invoker {

    private AbstractCommand command;

    public Invoker(AbstractCommand command) {
        this.command = command;
    }

    public void call() {
        this.command.execute();
    }

}
