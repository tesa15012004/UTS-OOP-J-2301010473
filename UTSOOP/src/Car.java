// File: Vehicle.java
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
