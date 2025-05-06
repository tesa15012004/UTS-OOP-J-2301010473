// File ini sebaiknya bernama Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek Vehicle
        Vehicle vehicle = new Vehicle("Toyota Corolla", 2020, "Blue");
        vehicle.displayInfo();
        vehicle.displayInfo("This vehicle has high fuel efficiency.");
        vehicle.start();
        vehicle.stop();

        System.out.println();

        // Membuat objek Car
        Car car = new Car("Mazda MX-5", 2023, "Red", true);
        car.displayInfo("This is a convertible car.");
        car.start();
        car.stop();
    }
}

// Class Vehicle
class Vehicle {
    private String model;
    protected int year;
    public String color;

    public Vehicle(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle has stopped.");
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }

    public void displayInfo(String additionalInfo) {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color + ", Additional Info: " + additionalInfo);
    }
}

// Class Car (subclass dari Vehicle)
class Car extends Vehicle {
    private boolean isConvertible;

    public Car(String model, int year, String color, boolean isConvertible) {
        super(model, year, color);
        this.isConvertible = isConvertible;
    }

    @Override
    public void start() {
        System.out.println("The car is starting with a roar of the engine.");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped with a smooth brake.");
    }

    @Override
    public void displayInfo(String additionalInfo) {
        super.displayInfo(additionalInfo);
        System.out.println("Is Convertible: " + (isConvertible ? "Yes" : "No"));
    }
}

