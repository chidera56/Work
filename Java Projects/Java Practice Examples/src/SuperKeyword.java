/*class Car {
    String color = "Pitch Black";
}

class Mercedes extends Car {
    String color = "Navy Blue";

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Mercedes obj = new Mercedes();
        obj.printColor();
    }
}*/

class Animals {
    // void eat() {
    // System.out.println("Eating");
    // }

    Animals() {
        System.out.println("Animal is created.");
    }
}

class Dogs extends Animals {
    // void eat() {
    // System.out.println("Dog is eating.");
    // }

    // void bark() {
    // System.out.println("Barking.");
    // }

    // void work() {
    // super.eat();
    // bark();
    // }

    Dogs() {
        // super();
        System.out.println("Dog is created.");
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        new Dogs();
    }
}
