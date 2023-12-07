public class FinalKeyword {
    // final int height = 70;

    // void height() {
    // height = 80;
    // }

    public static void main(String[] args) {
        // FinalKeyword finale = new FinalKeyword();
        // finale.run();
        BMWs bmw = new BMWs();
        Bike bike = new Bike();
        bike.run();
        bmw.run();
    }
}

class Bike {
    void run() {
        System.out.println("running.");
    }
}

final class BMWs extends Bike {
    void run() {
        System.out.println("BMW is running.");
    }
}