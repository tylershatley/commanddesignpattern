package commanddesignpattern;

public class HealCommand implements Command{
    /**
     * This class is used to create an instance of a command healing
     * inherits from class VehicleDecorator
     */

    private Robot robot;

    /**
     * This method is a constructor which initializes heal command robot
     * @param robot
     */
    public HealCommand(Robot robot)
    {
        this.robot = robot;
    }

    /**
     * This method calls heal function in robot and returns nothing
     */
    public void execute()
    {
        robot.heal();
    }
}
