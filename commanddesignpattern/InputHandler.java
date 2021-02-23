package commanddesignpattern;
import java.util.HashMap;

public class InputHandler {
    //idfk what to do
    private Robot robot;
    private PickupCommand puc;
    private HashMap <String, Command> commands;

    public InputHandler(Robot robot) {
        commands = new HashMap<String, Command>();
        commands.put("pickup", puc);
    }

    public void inputEntered(String data) {
        if(commands.containsKey(data)) {
            commands.get(data);
        }
    }
}
