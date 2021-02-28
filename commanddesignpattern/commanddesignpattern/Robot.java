package commanddesignpattern;

/**
 * A machine that mimics human characteristics
 */
public class Robot {

    /**
     * Tells robot's name and welcomes user
     * 
     * @param name is the robot's
     */
    public Robot(String name) {
        System.out.println("Welcome, my name is " + name + ", I'm a friendly robot");
    }

    /**
     * Pickup function prints out pick up statement
     */
    public void pickUp() {
        System.out.println("Oh treasure, picking it up!");
    }

    /**
     * Jump function prints out jump statement
     */
    public void jump() {
        System.out.println("Oh no a hazard, I'm jumping over it.");
    }

    /**
     * Fire functiom prints out fire statement
     */
    public void fire() {
        System.out.println("Bad guys! Fire my blow torch at them.");
    }

    /**
     * Heal function prints out heal statement
     */
    public void heal() {
        System.out.println("Thanks for healing my wounds.");
    }
}
