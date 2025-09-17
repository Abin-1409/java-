// Abstract class
abstract class Appliance {
    private int powerRating;

    public Appliance(int powerRating) { this.powerRating = powerRating; }

    public int getPowerRating() { return powerRating; }
    public void setPowerRating(int powerRating) { this.powerRating = powerRating; }

    public abstract void turnOn();
    public abstract void turnOff();
}

// Fan subclass
class Fan extends Appliance {
    public Fan(int powerRating) { super(powerRating); }

    @Override
    public void turnOn() { System.out.println("Fan is ON"); }
    @Override
    public void turnOff() { System.out.println("Fan is OFF"); }
}

// Light subclass
class Light extends Appliance {
    public Light(int powerRating) { super(powerRating); }

    @Override
    public void turnOn() { System.out.println("Light is ON"); }
    @Override
    public void turnOff() { System.out.println("Light is OFF"); }
}

// Test class
public class SmartHome {
    public static void main(String[] args) {
        Fan f = new Fan(75);
        Light l = new Light(40);

        f.turnOn();
        l.turnOn();
        f.turnOff();
        l.turnOff();
    }
}
