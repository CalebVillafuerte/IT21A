abstract class Vehicle {

    public abstract void rentVehicle();

    public void showRentalInfo() {
        System.out.println("Vehicle rental service is available.");
    }
}

class Car extends Vehicle {

    @Override
    public void rentVehicle() {
        System.out.println("Car rented for a family trip.");
    }
}

class Motorcycle extends Vehicle {

    @Override
    public void rentVehicle() {
        System.out.println("Motorcycle rented for a short ride.");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();

        myCar.rentVehicle();
        myCar.showRentalInfo();

        System.out.println();

        myMotorcycle.rentVehicle();
        myMotorcycle.showRentalInfo();
    }
}