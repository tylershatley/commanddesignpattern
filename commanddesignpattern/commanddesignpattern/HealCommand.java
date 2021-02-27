package commanddesignpattern;

public class HealCommand implements Command{
    private Robot robot;
    /**
     * initializes heal command robot
     * @param robot
     */
    public HealCommand(Robot robot)
    {
        this.robot = robot;
    }
    /**
     * implemented heal command
     * calls robot void heal function
     */
    public void execute()
    {
        robot.heal();
    }
}
