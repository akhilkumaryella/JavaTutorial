package designpatterns.command;

/**
 * its an invoker in Command pattern
 */
public class RemoteControl {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

}
