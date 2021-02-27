package commanddesignpattern;
public class JumpCommand implements Command {
    private Robot robot;

    /**
     * initializes jump command robot
     * @param robot
     */
    public JumpCommand(Robot robot) {
        this.robot = robot;
    }
    /**
     * implemented jump command
     * calls robot void jump function
     */
    @Override
    public void execute() {
        robot.jump();
    }
}
