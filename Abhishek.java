import java.util.Scanner;

interface InterfaceOne {
    void updateGear(int gear);
}

interface InterfaceTwo {
    void accelerate(int speed);
}

interface InterfaceThree {
    void pushBrake(int brakeForce);
}

class Car implements InterfaceOne, InterfaceTwo, InterfaceThree {
    private int gear;
    private int speed;
    private int brakeForce;

    public void updateGear(int gear) {
        this.gear = gear;
    }

    public void accelerate(int speed) {
        this.speed = speed;
    }

    public void pushBrake(int brakeForce) {
        this.brakeForce = brakeForce;
    }

    public void currentSpeed() {
        int currentSpeed = speed - brakeForce;
        System.out
                .println("Car Present State :\n Brake Force - " + brakeForce + "\n Current Speed - " + currentSpeed
                        + "\n Gear - "
                        + gear);
    }
}

class Truck implements InterfaceOne, InterfaceTwo, InterfaceThree {
    private int gear;
    private int speed;
    private int brakeForce;

    public void updateGear(int gear) {
        this.gear = gear;
    }

    public void accelerate(int speed) {
        this.speed = speed;
    }

    public void pushBrake(int brakeForce) {
        this.brakeForce = brakeForce;
    }

    public void currentSpeed() {
        int currentSpeed = speed - brakeForce;
        System.out.println(
                "Truck Present State :\n Brake Force - " + (brakeForce) + "\n Current Speed - " + (currentSpeed)
                        + "\n Gear - "
                        + (gear));
    }
}

public class Abhishek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter brake force for Car Between(1 to 3): ");
        int carBrakeForce = scanner.nextInt();

        System.out.print("Enter speed for Car Between(1 to 4): ");
        int carSpeed = scanner.nextInt();

        System.out.print("Enter gear for Car Between(1 to 5): ");
        int carGear = scanner.nextInt();
        Car c1 = new Car();

        c1.updateGear(carGear);
        c1.accelerate(carSpeed);
        c1.pushBrake(carBrakeForce);
        c1.currentSpeed();

        System.out.print("Enter brake force for Truck Between(1 to 3): ");
        int truckBrakeForce = scanner.nextInt();

        System.out.print("Enter speed for Truck Between(1 to 4): ");
        int truckSpeed = scanner.nextInt();

        System.out.print("Enter gear for Truck Between(1 to 5): ");
        int truckGear = scanner.nextInt();

        Truck t1 = new Truck();

        t1.updateGear(truckGear);
        t1.accelerate(truckSpeed);
        t1.pushBrake(truckBrakeForce);
        t1.currentSpeed();

        scanner.close();
    }
}
