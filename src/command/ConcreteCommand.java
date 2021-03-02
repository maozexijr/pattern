package command;

/**
 * 具体命令
 *
 * @author maozexijr
 */
public class ConcreteCommand implements AbstractCommand {

    private Receiver receiver;

    public ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }

}
