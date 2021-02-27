package commanddesignpattern;

public class FireCommand implements Command{
    private Robot robot;
    /**
     * initializes fire command robot
     * @param robot
     */
    public FireCommand(Robot robot)
    {
        this.robot = robot;
    }
    /**
     * implemented fire command
     * calls robot void fire function
     */
    public void execute()
    {
        robot.fire();
    }

    
}
