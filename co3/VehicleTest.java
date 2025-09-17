abstract class Vehicle {
    public abstract void startEngine();

    public void stopEngine() {
        System.out.println("Vehicle engine stopped.");
    }
}

class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Bike extends Vehicle {
    public void startEngine() {
        System.out.println("Bike engine started.");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        Vehicle bike = new Bike();
        bike.startEngine();
        bike.stopEngine();
    }
}
