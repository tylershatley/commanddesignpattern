package commanddesignpattern;
import java.util.HashMap;

/**
 * InputHandler
 * this class has a hashmap that holds
 * "data" which correleates to is value
 * as if the data is a correct string
 * a correct command will be in the hashmap 
 * with it.
 * Has two methods, one to initialize and put all commands into
 * hashmap. And one method to check entry and execute
 */
public class InputHandler {
    private HashMap<String, Command> commands;

    /**
     * input handler
     * initializes hashmap and puts all 
     * commands into the hashmap
     * @param robot
     */
    public InputHandler(Robot robot) {
        commands = new HashMap<String, Command>();
        commands.put("pickup", new PickupCommand(robot));
        commands.put("jump", new JumpCommand(robot));
    }

    /**
     * inputEntered
     * checks if string data 
     * is in hashmap
     * if so, it executes the command
     * associated with the data
     * @param data
     */
    public void inputEntered(String data) {
        if (commands.containsKey(data)) {
            commands.get(data).execute();
        }
    }
}
