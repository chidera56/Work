abstract class Anime {
    // abstract void watch();
}

// public class AbstractClass extends Anime {
// void watch() {
// System.out.println("Watching anime.");
// }

// public static void main(String[] args) {
// Anime anime = new AbstractClass();
// anime.watch();
// }
// }

abstract class Motorcycle {
    Motorcycle() {
        System.out.println("Motorcycle is created.");
    }

    abstract void cycling();

    void changegear() {
        System.out.println("Gear has been changed.");
    }
}

class Mercedes1 extends Motorcycle {
    void cycling() {
        System.out.println("Cycling perfectly.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Motorcycle car = new Mercedes1();
        car.cycling();
        car.changegear();
    }
}
