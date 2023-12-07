class Vehicle {
    void run() {
        System.out.println("Vehicle is running.");
    }
}

public class MethodOverriding extends Vehicle {
    void run() {
        System.out.println("Bike is running.");
    }

    public static void main(String[] args) {
        MethodOverriding override = new MethodOverriding();
        override.run();

    }
}

class Cars {
    double getPriceOfCar() {
        return 300000;
    }
}

class BMW extends Cars {
    double getPriceOfCar() {
        return 500000;
    }
}

class AUDI extends Cars {
    double getPriceOfCar() {
        return 700400;
    }
}

/*
 * public class MethodOverriding {
 * public static void main(String[] args) {
 * BMW cardealer1 = new BMW();
 * AUDI cardealer2 = new AUDI();
 * 
 * System.out.println("BMW price is: " + cardealer1.getPriceOfCar());
 * System.out.println("AUDI price is: " + cardealer2.getPriceOfCar());
 * 
 * }
 * }
 */