package commanddesignpattern;

public class Robot {
    
    /**
     * Tells robots name and welcomes user
     * @param name
     */
    public Robot(String name) {
        System.out.println("Welcome, my name is " + name + ", I'm a friendly robot");
    }

    public void pickUp() {
        System.out.println("Oh treasure, picking it up!");
    }

    public void jump() {
        System.out.println("Oh no a hazard, I'm jumping over it.");
    }

    public void fire() {
        System.out.println("Bad guys! Fire my blow torch at them.");
    }

    public void heal() {
        System.out.println("Thanks for healing my wounds.");
    }
}
