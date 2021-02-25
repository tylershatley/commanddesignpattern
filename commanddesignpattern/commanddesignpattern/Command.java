package commanddesignpattern;
/**
 * Interface command
 * calls execute, which will be
 * the command that is called which will tell
 * the roboot "what to do"
 */
public interface Command {
    public void execute();
}
