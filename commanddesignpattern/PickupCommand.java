package commanddesignpattern;
//Tyler Shatley
public class PickupCommand implements Command {
    private Robot robot;

    public PickupCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        robot.pickUp();
    }
}
