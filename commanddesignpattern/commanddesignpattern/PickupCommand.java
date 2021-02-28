package commanddesignpattern;

public class PickupCommand implements Command {
    private Robot robot;

    /**
     * initializes pickup command robot
     * 
     * @param robot object to be commanded
     */
    public PickupCommand(Robot robot) {
        this.robot = robot;
    }

    /**
     * Implemented command method calls robot void pickup function
     */
    @Override
    public void execute() {
        robot.pickUp();
    }
}
