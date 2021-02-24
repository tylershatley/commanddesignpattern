package commanddesignpattern;

public class JumpCommand implements Command {
    private Robot robot;

    public JumpCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.jump();
    }
}
